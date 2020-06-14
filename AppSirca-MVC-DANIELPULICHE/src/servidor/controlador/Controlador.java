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
    
    public Controlador(ClsOrganizacion objOrganizacion){
        this.objConvertidor = new Gson();
        this.objOrganizacion = objOrganizacion;
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
            
            case "ingresarAlSistema":

                String login;
                String contrasenia;
                String datosDePerfil[] = argumentosPeticion.split(",");
                login = datosDePerfil[0];
                contrasenia = datosDePerfil[1];
                
                ClsAdministrador objAdministrador = this.objOrganizacion.getAdministrador();
                if(objAdministrador.getLogin().equals(login) && objAdministrador.getConstrasenia().equals(contrasenia)){
                    objResultado.setCodigoResultado(1);
                }else{
                    objResultado.setCodigoResultado(-1);
                }
                
            break;
            
            case "modificarLogin":
                
//                String loginActual;
//                String loginNuevo;
//                String cambioDeLogin[] = argumentosPeticion.split(",");
//                loginActual = cambioDeLogin[0];
//                loginNuevo = cambioDeLogin[1];
//                if(this.objOrganizacion.existeAdministrador(loginActual)==true)
//                {
//                    ClsAdministrador objAdministrador = this.objOrganizacion.consultarAdministrador(loginActual);
//                    objAdministrador.setLogin(loginNuevo);
//                    objResultado.setCodigoResultado(1);
//                }                
//                else
//                {
//                    objResultado.setCodigoResultado(-1);
//                }
                
            break;
            
            case "modificarContrasenia":
                
//                String loginAdministrador;
//                String contraseniaNueva;
//                String cambioDeContrasenia[] = argumentosPeticion.split(",");
//                loginAdministrador = cambioDeContrasenia[0];
//                contraseniaNueva = cambioDeContrasenia[1];
//                if(this.objOrganizacion.existeAdministrador(loginAdministrador)==true)
//                {
//                    ClsAdministrador objAdministrador = this.objOrganizacion.consultarAdministrador(loginAdministrador);
//                    objAdministrador.setConstrasenia(contraseniaNueva);
//                    objResultado.setCodigoResultado(1);
//                }                
//                else
//                {
//                    objResultado.setCodigoResultado(-1);
//                }
                
            break;
            
            case "registrarUsuario":
                  
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
            
        }
        
        resultadoJSON=objConvertidor.toJson(objResultado);
        return resultadoJSON;
    }
    
}

