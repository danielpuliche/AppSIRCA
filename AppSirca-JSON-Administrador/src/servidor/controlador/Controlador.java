package servidor.controlador;

import com.google.gson.Gson;
import modelo.ClsAdministrador;
import modelo.ClsOrganizacion;
import modelo.ClsPeticion;
import modelo.ClsResultado;
import modelo.ClsUsuario;

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
        String resultadoJSON="";
        ClsResultado objResultado=new ClsResultado();
        
        switch (accion) {

            case "registrarPersona":
                  
                ClsUsuario objUsuario = objConvertidor.fromJson(argumentosPeticion, ClsUsuario.class);

                if(this.objOrganizacion.existeUsuario(objUsuario.getIdentificacion()) == false)
                {
                    this.objOrganizacion.agregarUsuario(objUsuario);
                    objResultado.setCodigoResultado(1);
                }
                else
                {
                    objResultado.setCodigoResultado(-1);
                }
                
            break;
            
            case "ingresarAlSistema":
                String login, contrasenia;                
                String vectorL[]=argumentosPeticion.split(",");
                login=vectorL[0];
                contrasenia=vectorL[1];
                System.out.println("login "+vectorL.length+" " + "contraseña " + contrasenia);
                if(objAdministrador.getLogin().equals(login) && objAdministrador.getConstrasenia().equals(contrasenia))
                {
                    objResultado.setCodigoResultado(1);
                }                
                else
                {
                    objResultado.setCodigoResultado(-1);
                }
            break;
            
        }
        resultadoJSON=objConvertidor.toJson(objResultado);
        return resultadoJSON;
    }
    
}

