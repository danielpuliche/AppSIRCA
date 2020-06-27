package servidor.DAO;

import java.util.ArrayList;
import modelo.DTO.ClsUsuarioDTO;

public interface InterfazAccesoDatosUsuarioDAO {
    
    public ArrayList<ClsUsuarioDTO> consultarUsuarios();
    
    public ArrayList<ClsUsuarioDTO> consultarUsuariosDentro();
    
    public ArrayList<ClsUsuarioDTO> consultarUsuariosFuera();
    
    public boolean registrarUsuario(ClsUsuarioDTO usuario);
    
    public boolean eliminarUsuario(String codigo);

    public boolean editarUsuario(ClsUsuarioDTO objUsuario, String codigoUsuario);
    
    public boolean editarRol(String rol, String codigoUsuario);
    
    public ArrayList<ClsUsuarioDTO> consultarUsuariosCoincidencia(String codigo);
    
    public boolean existeUsuario(String codigoUsuario);
    
    }
