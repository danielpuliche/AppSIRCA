package modelo;

import java.util.ArrayList;

public class ClsEmpresax {

    private ArrayList<ClsPersona> objPersonas;    
    
    public ClsEmpresax()
    {
        objPersonas=new ArrayList();
        ClsPersona objPersona1= new  ClsPersona("CC", "1.061", "juan", "lopez");
        objPersonas.add(objPersona1);
        ClsPersona objPersona2= new  ClsPersona("TI", "1.062", "catalina", "perez");        
        objPersonas.add(objPersona2);
    }
    
    public boolean agregarPersona(ClsPersona objPersona)
    {
        return this.objPersonas.add(objPersona);
    }

    public ArrayList<ClsPersona> getObjPersonas() {
        return objPersonas;
    }
    
    public ClsPersona consultarPersona(String tipoIdentificacion, String numeroIdentificacion)
    {
        System.out.println("ejecutando método consultar persona");
        ClsPersona objPersona= null;
        for (int i = 0; i < objPersonas.size(); i++) {
            if(objPersonas.get(i).getTipoIdentificacion().equalsIgnoreCase(tipoIdentificacion) && objPersonas.get(i).getNumeroIdentificacion().equalsIgnoreCase(numeroIdentificacion))
            {
                objPersona=objPersonas.get(i);
                System.out.println("Persona encontrada");
                break;
            }
        }
        
        return objPersona;
    }
    
    public boolean existePersona(String tipoIdentificacion, String numeroIdentificacion)
    {
        boolean bandera=false;
        System.out.println("ejcutando método existe persona");
        for (int i = 0; i < objPersonas.size(); i++) {
             System.out.println("tipo: -" + objPersonas.get(i).getTipoIdentificacion()+ "-numero -" + objPersonas.get(i).getNumeroIdentificacion()+"-");
            if(objPersonas.get(i).getTipoIdentificacion().equalsIgnoreCase(tipoIdentificacion) && objPersonas.get(i).getNumeroIdentificacion().equalsIgnoreCase(numeroIdentificacion))
            {
                bandera=true;
                System.out.println("Persona encontrada");
                break;
            }
        }
        
        return bandera;
    }
    
    
}
