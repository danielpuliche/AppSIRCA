package modelo;

import java.util.ArrayList;

public class ClsOrganizacion {

    private ArrayList<ClsUsuario> objUsuarios;
    
    public ClsOrganizacion(){
        objUsuarios = new ArrayList();
        ClsUsuario objUsuario1 = new ClsUsuario("100617123654", "Pepito Filipino", "Apellido Random", enumGenero.Masculino, enumRol.Docente);
        objUsuarios.add(objUsuario1);
        ClsUsuario objUsuario2 = new ClsUsuario("100678965412", "Nombre Random", "Apellido Random", enumGenero.Femenino, enumRol.No_Asignado);
        objUsuarios.add(objUsuario2);
    }
    
    public boolean agregarUsuario(ClsUsuario objUsuario){
        return this.objUsuarios.add(objUsuario);
    }
    
    public ArrayList<ClsUsuario> getObjUsuarios() {
        return objUsuarios;
    }
    
    public ClsUsuario consultarUsuario(){
        
        return null;        
    }
    
    public boolean existeUsuario(String identificacion)
    {
        boolean bandera=false;
        System.out.println("ejecutando método existe persona");
        for (int i = 0; i < objUsuarios.size(); i++) {
            System.out.println("Numero id: "+objUsuarios.get(i).getIdentificacion());
            if(objUsuarios.get(i).getIdentificacion().equalsIgnoreCase(identificacion))
            {
                bandera=true;
                System.out.println("Usuario encontrado");
                break;
            }
        }
        
        return bandera;
    }
   
}
