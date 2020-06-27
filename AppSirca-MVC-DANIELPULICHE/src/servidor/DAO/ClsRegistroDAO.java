package servidor.DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
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
    public int obtenerTipoUltimoRegistro(String codigo) {
        int tipoRegistro = 2;
        
        conexionABaseDeDatos.conectar();
        try {
            
            PreparedStatement sentencia = null;
            String consulta = "SELECT registros.tipoRegistro FROM registros WHERE registros.codigoUsuario=? ORDER by registros.idRegistro DESC LIMIT 1";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);
            sentencia.setString(1, codigo);
            ResultSet res = sentencia.executeQuery();
            while(res.next()){
                tipoRegistro = res.getInt("tipoRegistro");
            }  
            sentencia.close();
            conexionABaseDeDatos.desconectar();

        } catch (SQLException e) {
            System.out.println("Error al obtener tipo registro: "+e.getMessage());         
        }
        
        return tipoRegistro;
    }

    @Override
    public ClsRegistroDTO obtenerUltimoRegistro(String codigo) {
        
        ClsRegistroDTO objRegistro = null;
        
        conexionABaseDeDatos.conectar();
        try {
            
            PreparedStatement sentencia = null;
            String consulta = "SELECT * FROM registros WHERE registros.codigoUsuario=? ORDER by registros.idRegistro DESC LIMIT 1";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);
            sentencia.setString(1, codigo);
            ResultSet res = sentencia.executeQuery();
            while(res.next()){
                String fecha = res.getDate("fecha").toString();
                String hora = res.getTime("hora").toString();
                int tipoRegistro = res.getInt("tipoRegistro");
                objRegistro = new ClsRegistroDTO(fecha, hora, tipoRegistro);
            }  
            sentencia.close();
            conexionABaseDeDatos.desconectar();

        } catch (SQLException e) {
            System.out.println("Error al obtener registro: "+e.getMessage());         
        } 
        
        return objRegistro;
    }
    
    @Override
    public ArrayList<String> codigosUsuariosFiltrado(int tipoRegistro) {
        
        ArrayList<String> codigosUsuarios = new ArrayList();
        
        conexionABaseDeDatos.conectar();        
        try {            
            PreparedStatement sentencia = null;
            String consulta = "SELECT * from registros where registros.tipoRegistro=? GROUP by registros.codigoUsuario";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);            
            sentencia.setInt(1, tipoRegistro);
            ResultSet res = sentencia.executeQuery();
            
            while(res.next()){
                codigosUsuarios.add(res.getString("codigo"));
            } 
            
            sentencia.close();
            conexionABaseDeDatos.desconectar();

        } catch (SQLException e) {
            System.out.println("Error en el listar: "+e.getMessage());         
        }
        
        return codigosUsuarios;
    }
    
}
