package servidor.controlador;

import com.google.gson.Gson;
import modelo.ClsAdministrador;
import modelo.ClsOrganizacion;
import modelo.ClsPeticion;

public class Controlador {

    private final Gson objConvertidor;
    private final ClsOrganizacion objOrganizacion;
    private final ClsAdministrador objAdministrador;
    
    public Controlador(ClsOrganizacion objOrganizacion){
        this.objConvertidor = new Gson();
        this.objOrganizacion = objOrganizacion;
        this.objAdministrador = new ClsAdministrador("admin", "admin12345");
    }
    
    public String decodificarPeticion(String JSONPeticion) {    
        String accion, argumentosPeticion, resultado;        
        ClsPeticion objPeticion= objConvertidor.fromJson(JSONPeticion, ClsPeticion.class); 
        accion=objPeticion.getAccion();
        argumentosPeticion=objPeticion.getArgumentos();
        resultado=procesarAccion(accion, argumentosPeticion);
        return resultado;
    }

    private String procesarAccion(String accion, String argumentosPeticion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

