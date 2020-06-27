package servidor.DAO;

import servidor.conexion.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.DTO.ClsRegistroDTO;
import modelo.DTO.ClsUsuarioDTO;

public class ClsUsuarioDAO implements InterfazAccesoDatosUsuarioDAO{
    
    private final ConexionBD conexionABaseDeDatos;
    
    public ClsUsuarioDAO()
    {
        conexionABaseDeDatos= new ConexionBD();
    }
    
    @Override
    public ArrayList<ClsUsuarioDTO> consultarUsuarios() {
        
        ArrayList<ClsUsuarioDTO> usuarios = new ArrayList();
        
        conexionABaseDeDatos.conectar();        
        try {            
            PreparedStatement sentencia = null;
            String consulta = "select * from usuarios";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);            
            ResultSet res = sentencia.executeQuery();
            while(res.next()){
                String codigo = res.getString("codigo");
                String nombres = res.getString("nombres");
                String apellidos = res.getString("apellidos");
                String genero = res.getString("genero");
                String rol = res.getString("rol");
                ClsUsuarioDTO objUsuario = new ClsUsuarioDTO(codigo, apellidos, nombres, genero, rol);
                usuarios.add(objUsuario);
            }   
            
            sentencia.close();
            conexionABaseDeDatos.desconectar();

        } catch (SQLException e) {
                  System.out.println("Error en el listar: "+e.getMessage());         
        }
        
        return usuarios;
    }
    
    @Override
    public ArrayList<ClsUsuarioDTO> consultarUsuariosDentro() {
        
        ArrayList<ClsUsuarioDTO> listaUsuariosDentro = new ArrayList();
        
        conexionABaseDeDatos.conectar();        
        try {            
            PreparedStatement sentencia = null;
            String consulta = "select registros.fecha, registros.hora, usuarios.codigo, "
                            + "usuarios.nombres, usuarios.apellidos, usuarios.genero, "
                            + "usuarios.rol from registros join usuarios on registros.codigoUsuario=usuarios.codigo "
                            + "where registros.tipoRegistro=1";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);            
            
            ResultSet res = sentencia.executeQuery();
            while(res.next()){
                String fecha = res.getDate("fecha").toString();
                String hora = res.getTime("hora").toString();
                ClsRegistroDTO objRegistro = new ClsRegistroDTO(fecha, hora, 1);
                String codigo = res.getString("codigo");
                String nombres = res.getString("nombres");
                String apellidos = res.getString("apellidos");
                String genero = res.getString("genero");
                String rol = res.getString("rol");
                ClsUsuarioDTO objUsuario = new ClsUsuarioDTO(codigo, apellidos, nombres, genero, rol);
                objUsuario.asignarRegistro(objRegistro);
                listaUsuariosDentro.add(objUsuario);
            }   
            
            sentencia.close();
            conexionABaseDeDatos.desconectar();

        } catch (SQLException e) {
                  System.out.println("Error en el listar: "+e.getMessage());         
        }
        
        return listaUsuariosDentro;
    }
    
    @Override
    public ArrayList<ClsUsuarioDTO> consultarUsuariosFuera() {
        
        ArrayList<ClsUsuarioDTO> listaUsuariosDentro = new ArrayList();
        
        conexionABaseDeDatos.conectar();        
        try {            
            PreparedStatement sentencia = null;
            String consulta = "select registros.fecha, registros.hora, usuarios.codigo, "
                            + "usuarios.nombres, usuarios.apellidos, usuarios.genero, "
                            + "usuarios.rol from registros join usuarios on registros.codigoUsuario=usuarios.codigo "
                            + "where registros.tipoRegistro=2";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);            
            
            ResultSet res = sentencia.executeQuery();
            while(res.next()){
                String fecha = res.getDate("fecha").toString();
                String hora = res.getTime("hora").toString();
                ClsRegistroDTO objRegistro = new ClsRegistroDTO(fecha, hora, 1);
                String codigo = res.getString("codigo");
                String nombres = res.getString("nombres");
                String apellidos = res.getString("apellidos");
                String genero = res.getString("genero");
                String rol = res.getString("rol");
                ClsUsuarioDTO objUsuario = new ClsUsuarioDTO(codigo, apellidos, nombres, genero, rol);
                objUsuario.asignarRegistro(objRegistro);
                listaUsuariosDentro.add(objUsuario);
            }   
            
            sentencia.close();
            conexionABaseDeDatos.desconectar();

        } catch (SQLException e) {
                  System.out.println("Error en el listar: "+e.getMessage());         
        }
        
        return listaUsuariosDentro;
    }

    @Override
    public boolean registrarUsuario(ClsUsuarioDTO usuario) {
        
        conexionABaseDeDatos.conectar();
        int resultado=-1;
        try {            
            PreparedStatement sentencia = null;
            String consulta = "insert into usuarios(usuarios.codigo,usuarios.nombres,usuarios.apellidos,usuarios.genero,usuarios.rol) values(?,?,?,?,?)";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);
            sentencia.setString(1, usuario.getCodigo());
            sentencia.setString(2, usuario.getNombres());
            sentencia.setString(3, usuario.getApellidos());
            sentencia.setString(4, usuario.getGenero()+"");
            sentencia.setString(5, usuario.getRol()+"");
            resultado = sentencia.executeUpdate(); 
            sentencia.close();
            conexionABaseDeDatos.desconectar();

        } catch (SQLException e) {
                  System.out.println("Error en el registro: "+e.getMessage());         
        }
        
        return resultado == 1;
        
    }

    @Override
    public boolean eliminarUsuario(String codigo) {
        
        conexionABaseDeDatos.conectar();
        int resultado=-1;
        try {            
            PreparedStatement sentencia = null;
            String consulta = "delete from usuarios where usuarios.codigo=?";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);            
            sentencia.setString(1, codigo);
            resultado = sentencia.executeUpdate(); 
            sentencia.close();
            conexionABaseDeDatos.desconectar();

        } catch (SQLException e) {
                  System.out.println("Error en la eliminación: "+e.getMessage());         
        }
        
        return resultado == 1;
        
    }

    @Override
    public boolean editarUsuario(ClsUsuarioDTO objUsuario, String codigoUsuario) {
        
        conexionABaseDeDatos.conectar();
        int resultado=-1;
        try {            
            PreparedStatement sentencia = null;
            String consulta = "update usuarios set usuarios.codigo=?,"
                                                 + "usuarios.nombres=?,"
                                                 + "usuarios.apellidos=?,"
                                                 + "usuarios.genero=?,"
                                                 + "usuarios.rol=?"
                                                 + "where usuarios.codigo=?";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);
            sentencia.setString(1, objUsuario.getCodigo());
            sentencia.setString(2, objUsuario.getNombres());
            sentencia.setString(3, objUsuario.getApellidos());
            sentencia.setString(4, objUsuario.getGenero()+"");
            sentencia.setString(5, objUsuario.getRol()+"");
            sentencia.setString(6, codigoUsuario);
            resultado = sentencia.executeUpdate(); 
            sentencia.close();
            conexionABaseDeDatos.desconectar();

        } catch (SQLException e) {
            System.out.println("Error en la actualización: "+e.getMessage());         
        }
        
        return resultado == 1;
        
    }

    @Override
    public boolean editarRol(String rol, String codigoUsuario) {
        
        conexionABaseDeDatos.conectar();
        int resultado=-1;
        try {            
            PreparedStatement sentencia = null;
            String consulta = "update usuarios set usuarios.rol=? where usuarios.codigo=?";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);
            sentencia.setString(1, rol);
            sentencia.setString(2, codigoUsuario);
            resultado = sentencia.executeUpdate(); 
            sentencia.close();
            conexionABaseDeDatos.desconectar();

        } catch (SQLException e) {
            System.out.println("Error en la actualización: "+e.getMessage());         
        }
        
        return resultado == 1;    
    }

    @Override
    public ArrayList<ClsUsuarioDTO> consultarUsuariosCoincidencia(String codigoBuscar) {
        
        ArrayList<ClsUsuarioDTO> usuarios = new ArrayList();
        
        conexionABaseDeDatos.conectar();        
        try {            
            PreparedStatement sentencia = null;
            String consulta = "SELECT * FROM usuarios WHERE usuarios.codigo LIKE ?";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);            
            sentencia.setString(1, codigoBuscar+'%');
            ResultSet res = sentencia.executeQuery();
            while(res.next()){
                String codigo = res.getString("codigo");
                String nombres = res.getString("nombres");
                String apellidos = res.getString("apellidos");
                String genero = res.getString("genero");
                String rol = res.getString("rol");
                ClsUsuarioDTO objUsuario = new ClsUsuarioDTO(codigo, apellidos, nombres, genero, rol);
                usuarios.add(objUsuario);
            }   
            
            sentencia.close();
            conexionABaseDeDatos.desconectar();

        } catch (SQLException e) {
                  System.out.println("Error en el listar: "+e.getMessage());         
        }
        
        return usuarios;
        
    }

    @Override
    public boolean existeUsuario(String codigoUsuario) {
        
        conexionABaseDeDatos.conectar();
        int resultado = -1;
        try {            
            PreparedStatement sentencia = null;
            String consulta = "select * from usuarios where usuarios.codigo = ?";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);
            sentencia.setString(1, codigoUsuario);
            ResultSet res = sentencia.executeQuery();
            while(res.next()){
                resultado = 1;
            }
            sentencia.close();
            conexionABaseDeDatos.desconectar();

        } catch (SQLException e) {
                  System.out.println("Error al buscar usuario: "+e.getMessage());         
        }
        
        return resultado == 1;
        
    }
    
}
