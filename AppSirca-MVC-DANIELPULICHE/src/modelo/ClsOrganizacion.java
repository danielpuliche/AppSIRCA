package modelo;

import modelo.DTO.ClsUsuarioDTO;
import java.util.ArrayList;

public class ClsOrganizacion {

    private ClsAdministrador objAdministrador;
    private ArrayList<ClsUsuarioDTO> listaUsuarios;
    
    
    public ClsOrganizacion(){
        listaUsuarios = new ArrayList();
        agregarUsuario("10061452", "Puliche Cañas", "Daniel Fernando", "Masculino", "Estudiante");
        agregarUsuario("10061352", "Romero Nuñez", "Jhon Fredy", "Masculino", "Estudiante");
        agregarUsuario("10069273", "Nieto Sarria", "Leidy Alejandra", "Femenino", "Docente");
        agregarUsuario("10061940", "Arias Pulgarin", "Dana Isabella", "Femenino", "No asignado");
        agregarUsuario("10060272", "Cabrera Garcia", "Lina María", "Otro", "Administrativo");
        agregarUsuario("10027382", "Paz Perafán", "Daniel Eduardo", "Masculino", "Docente");
        agregarUsuario("10023750", "Daza Rosero", "Laura Sofia", "Femenino", "Administrativo");
        agregarUsuario("10018281", "Yangana Montoya", "Johan Santiago", "Masculino", "Estudiante");
        agregarUsuario("10039583", "Guerrero Lopez", "Nathalia Isabel", "Femenino", "Estudiante");
        agregarUsuario("10063859", "Manzano Muñoz", "Cesar Enrique", "Otro", "Docente");
        agregarUsuario("10002937", "Solarte Maraín", "Juan David", "Masculino", "No asignado");
        agregarUsuario("10028482", "Patiño Fernandez", "Ruth Angela", "Femenino", "No asignado");
        
        objAdministrador = new ClsAdministrador("Administrador","administrador" );  
    }
    
    public void agregarUsuario(String codigo, String apellidos, String nombres, String genero, String rol){
        ClsUsuarioDTO objUsuario = new ClsUsuarioDTO(codigo, apellidos, nombres, genero, rol);
        this.listaUsuarios.add(objUsuario);
    }
    
    public void editarUsuario(String codigoOriginal, String codigoEditado, String apellidosEditado, String nombresEditado, String generoEditado, String rolEditado){
        
        ClsUsuarioDTO objUsuarioEditar = consultarUsuario(codigoOriginal);
        
        objUsuarioEditar.setCodigo(codigoEditado);
        objUsuarioEditar.setNombres(nombresEditado);
        objUsuarioEditar.setApellidos(apellidosEditado);
        objUsuarioEditar.setGenero(objUsuarioEditar.darGenero(generoEditado));
        objUsuarioEditar.setRol(objUsuarioEditar.darRol(rolEditado));
 
    }

    public ArrayList<ClsUsuarioDTO> getListaUsuarios() {
        return listaUsuarios;
    }

    public ClsAdministrador getAdministrador() {
        return objAdministrador;
    }
    
    public ClsUsuarioDTO consultarUsuario(String codigo){
        
        ClsUsuarioDTO objUsuarioRetornar = null;
        for (int i = 0; i < this.listaUsuarios.size(); i++) {
            ClsUsuarioDTO objUsuarioAComparar = this.listaUsuarios.get(i);
            if(objUsuarioAComparar.getCodigo().equals(codigo)){
                objUsuarioRetornar = objUsuarioAComparar;
                break;
            }
        }
        return objUsuarioRetornar;        
    }
    
    public ArrayList<ClsUsuarioDTO> buscarUsuariosCoincidentes(String codigo){
        
        ArrayList<ClsUsuarioDTO> listaCoincidentes = new ArrayList();
        
        if(this.listaUsuarios.isEmpty()){
            listaCoincidentes = null;
        }else{
            for(int i=0;i<this.listaUsuarios.size();i++){
                if(this.listaUsuarios.get(i).getCodigo().startsWith(codigo)){
                    listaCoincidentes.add(this.listaUsuarios.get(i));
                }
            }
        }
        
        return listaCoincidentes;
    }
    
    public boolean existeUsuario(String codigo){        
        boolean bandera=false;                
        for (int i = 0; i < listaUsuarios.size(); i++){            
            if(listaUsuarios.get(i).getCodigo().equals(codigo)){
                bandera=true;
                break;
            }            
        }        
        return bandera;
    }
    
    public void asignarRol(String codigo, String rol){
        
        ClsUsuarioDTO objUsuarioAsignarRol = consultarUsuario(codigo);
        
        objUsuarioAsignarRol.setRol(objUsuarioAsignarRol.darRol(rol));
        
    }
    
    public boolean eliminarUsuario(String codigo){
        
        boolean bandera = false;
        
        for (int i = 0; i < this.listaUsuarios.size(); i++) {
            if(this.listaUsuarios.get(i).getCodigo().equals(codigo)){
                this.listaUsuarios.remove(i);
                bandera = true;
                break;
            }
        }
        
        return bandera;        
    }
}
