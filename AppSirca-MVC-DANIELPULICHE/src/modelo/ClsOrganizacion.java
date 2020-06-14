package modelo;

import java.util.ArrayList;

public class ClsOrganizacion {

    private ClsAdministrador objAdministrador;
    private ArrayList<ClsUsuario> listaUsuarios;
    
    
    public ClsOrganizacion(){
        listaUsuarios = new ArrayList();
        ClsUsuario objUsuario1 = new ClsUsuario("10060000", "Daniel Fernando", "Puliche Cañas", "Masculino", "Estudiante");
        listaUsuarios.add(objUsuario1);
        ClsUsuario objUsuario2 = new ClsUsuario("10060001", "Jhon Fredy", "Romero Nuñez", "Masculino", "No asignado");
        listaUsuarios.add(objUsuario2);
        objAdministrador = new ClsAdministrador("admin","admin12345" );  
    }
    
    public void agregarUsuario(ClsUsuario objUsuario){
        this.listaUsuarios.add(objUsuario);
    }
    
    public ArrayList<ClsUsuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public ClsAdministrador getAdministrador() {
        return objAdministrador;
    }
    
    public ClsUsuario consultarUsuario(){
        return null;        
    }
    
    public boolean existeUsuario(String identificacion){        
        boolean bandera=false;                
        for (int i = 0; i < listaUsuarios.size(); i++){            
            if(listaUsuarios.get(i).getIdentificacion().equals(identificacion)){
                bandera=true;
                break;
            }            
        }        
        return bandera;
    }
    
}
