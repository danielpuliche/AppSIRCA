package servidor.DAO;

public interface InterfazAccesoDatosAdministradorDAO {

    public boolean iniciarSesion(String login, String contrasenia);
    
    public boolean modificarLogin(String loginNuevo, String loginActual);
    
    public boolean modificarcontrasenia(String contraseniaNueva, String contraseniaActual);
    
}
