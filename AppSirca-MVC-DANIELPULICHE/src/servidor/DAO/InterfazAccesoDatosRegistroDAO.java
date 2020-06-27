package servidor.DAO;

import java.util.ArrayList;
import modelo.DTO.ClsRegistroDTO;

public interface InterfazAccesoDatosRegistroDAO {

    public boolean asignarRegistroUsuario(String codigo, ClsRegistroDTO registro);
    
    public int obtenerTipoUltimoRegistro(String codigo);
    
    public ClsRegistroDTO obtenerUltimoRegistro(String codigo);
    
    public ArrayList<String> codigosUsuariosFiltrado(int tipoRegistro);
    
}
