package servidor.controlador;

import com.google.gson.Gson;
import java.util.ArrayList;
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
        
        String accion;
        String argumentosPeticion;
        String resultado;     
        
        ClsPeticion objPeticion= objConvertidor.fromJson(JSONPeticion, ClsPeticion.class); 
        accion=objPeticion.getAccion();
        argumentosPeticion=objPeticion.getArgumentos();
        
        resultado = procesarAccion(accion, argumentosPeticion);
        return resultado;
    }

    private String procesarAccion(String accion, String argumentosPeticion) {
        String resultadoJSON="";
        ClsResultado objResultado = new ClsResultado();
        
        switch (accion) {
            
            case "ingresarAlSistema":
                
                String datosDePerfil[] = argumentosPeticion.split(",");
                String login = datosDePerfil[0];
                String contrasenia = datosDePerfil[1];
                
                ClsAdministrador objAdministrador = this.objOrganizacion.getAdministrador();
                if(objAdministrador.getLogin().equals(login) && objAdministrador.getConstrasenia().equals(contrasenia)){
                    objResultado.setCodigoResultado(1);
                }else{
                    objResultado.setCodigoResultado(-1);
                }
                
            break;
            
            case "listarTodosLosUsuarios":

                ArrayList<ClsUsuario> lista = objOrganizacion.getListaUsuarios();
                
                if(lista.isEmpty()){
                    objResultado.setCodigoResultado(-1);
                }else{
                    objResultado.setCodigoResultado(1);
                    String respuesta = objConvertidor.toJson(lista);
                    objResultado.setJSONResultado(respuesta);
                }
                
            break;
            
            case "modificarLogin":
                
                String cambioDeLogin[] = argumentosPeticion.split(",");
                String loginActual = cambioDeLogin[0];
                String loginNuevo = cambioDeLogin[1];
                
                if(loginActual.equals(objOrganizacion.getAdministrador().getLogin())){
                    objOrganizacion.getAdministrador().setLogin(loginNuevo);
                    objResultado.setCodigoResultado(1);
                }else
                    objResultado.setCodigoResultado(-1);
                                
            break;
            
            case "modificarContrasenia":
                
                String contraseniaActual;
                String contraseniaNueva;
                String cambioDeContrasenia[] = argumentosPeticion.split(",");
                contraseniaActual = cambioDeContrasenia[0];
                contraseniaNueva = cambioDeContrasenia[1];
                
                if(contraseniaActual.equals(objOrganizacion.getAdministrador().getConstrasenia())){
                    objOrganizacion.getAdministrador().setConstrasenia(contraseniaNueva);
                    objResultado.setCodigoResultado(1);
                }else
                    objResultado.setCodigoResultado(-1);
                
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
            
            case "eliminarUsuario":
                  
                String idEliminar = argumentosPeticion;

                if(objOrganizacion.eliminarUsuario(idEliminar))
                    objResultado.setCodigoResultado(1);
                else
                    objResultado.setCodigoResultado(-1);                
                
            break;
            
        }
        
        resultadoJSON = objConvertidor.toJson(objResultado);
        return resultadoJSON;
    }
    
}

