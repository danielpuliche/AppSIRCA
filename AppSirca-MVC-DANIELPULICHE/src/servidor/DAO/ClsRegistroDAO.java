package servidor.DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import modelo.DTO.ClsRegistroDTO;
import servidor.conexion.ConexionBD;

public class ClsRegistroDAO implements InterfazAccesoDatosRegistroDAO{
    
    private final ConexionBD conexionABaseDeDatos;
    
    public ClsRegistroDAO()
    {
        conexionABaseDeDatos= new ConexionBD();
    }
    
    @Override
    public boolean asignarRegistroUsuario(String codigo, ClsRegistroDTO registro) {
        
        conexionABaseDeDatos.conectar();
        int resultado = -1;
        try {
            
            PreparedStatement sentencia = null;
            String consulta = "insert into registros(fecha,hora,tipoRegistro,codigoUsuario) values (?,?,?,?)";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);
            sentencia.setDate(1, Date.valueOf(registro.getFecha()));
            sentencia.setTime(2, Time.valueOf(registro.getHora()));
            sentencia.setInt(3, registro.getTipoRegistro());
            sentencia.setString(4, codigo);
            resultado = sentencia.executeUpdate(); 
            sentencia.close();
            conexionABaseDeDatos.desconectar();

        } catch (SQLException e) {
            System.out.println("Error en el registro: "+e.getMessage());         
        }
        
        return resultado == 1; 
    }

    @Override
    public int obtenerUltimoRegistro(String codigoEntrada) {
        int tipoRegistro = 2;
        
        conexionABaseDeDatos.conectar();
        try {
            
            PreparedStatement sentencia = null;
            String consulta = "SELECT registros.tipoRegistro FROM registros WHERE registros.codigoUsuario=? ORDER by registros.idRegistro DESC LIMIT 1";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);
            sentencia.setString(1, codigoEntrada);
            ResultSet res = sentencia.executeQuery();
            while(res.next()){
                tipoRegistro = res.getInt("tipoRegistro");
            }  
            sentencia.close();
            conexionABaseDeDatos.desconectar();

        } catch (SQLException e) {
            System.out.println("Error en el registro: "+e.getMessage());         
        }
        
        return tipoRegistro;
    }
    
}
