package servidor.DAO;

import servidor.conexion.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClsAdministradorDAO implements InterfazAccesoDatosAdministradorDAO{
    private final ConexionBD conexionABaseDeDatos;
    
    public ClsAdministradorDAO()
    {
        conexionABaseDeDatos= new ConexionBD();
    }
    
    @Override
    public boolean iniciarSesion(String login, String contrasenia) {
        
        conexionABaseDeDatos.conectar();
        boolean resultado = false;
        
        try{
            PreparedStatement sentencia = null;
            String consulta = "select * from administrador where administrador.login=? and administrador.contraseña=?";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);            
            sentencia.setString(1, login);
            sentencia.setString(2, contrasenia);
            ResultSet res = sentencia.executeQuery();            
            
            if (res.next()){
                resultado = true;
            }
            
            sentencia.close();
            conexionABaseDeDatos.desconectar();
        }catch (SQLException e){
            System.out.println("Error al comparar datos: "+e.getMessage());
        }
        
        return resultado;
    }

    @Override
    public boolean modificarLogin(String loginNuevo, String loginActual) {
        
        conexionABaseDeDatos.conectar();
        int resultado=-1;
        try {            
            PreparedStatement sentencia = null;
            String consulta = "update administrador set administrador.login=? where administrador.login=?";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);
            sentencia.setString(1, loginNuevo);
            sentencia.setString(2, loginActual);
            resultado = sentencia.executeUpdate(); 
            sentencia.close();
            conexionABaseDeDatos.desconectar();

        } catch (SQLException e) {
            System.out.println("Error al modificar login: "+e.getMessage());         
        }
        
        return resultado == 1;
    }

    @Override
    public boolean modificarcontrasenia(String contraseniaNueva, String contraseniaActual) {
        
        conexionABaseDeDatos.conectar();
        int resultado=-1;
        try {            
            PreparedStatement sentencia = null;
            String consulta = "update administrador set administrador.contraseña=? where administrador.contraseña=?";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);
            sentencia.setString(1, contraseniaNueva);
            sentencia.setString(2, contraseniaActual);
            resultado = sentencia.executeUpdate(); 
            sentencia.close();
            conexionABaseDeDatos.desconectar();

        } catch (SQLException e) {
            System.out.println("Error al modificar contraseña: "+e.getMessage());         
        }
        
        return resultado == 1;
    }

    
    
}
