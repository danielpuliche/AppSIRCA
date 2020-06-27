package servidor.controlador;

import servidor.DAO.ClsAdministradorDAO;
import servidor.DAO.ClsUsuarioDAO;
import com.google.gson.Gson;
import java.util.ArrayList;
import modelo.DTO.ClsPeticionDTO;
import modelo.DTO.ClsRegistroDTO;
import modelo.DTO.ClsResultadoDTO;
import modelo.DTO.ClsUsuarioDTO;
import servidor.DAO.ClsRegistroDAO;

public class Controlador {

    private final Gson objConvertidor;
    private final ClsAdministradorDAO objAdministradorDAO;
    private final ClsUsuarioDAO objUsuarioDAO;
    private final ClsRegistroDAO objRegistroDAO;
    
    public Controlador(){
        this.objConvertidor = new Gson();
        this.objAdministradorDAO = new ClsAdministradorDAO();
        this.objUsuarioDAO = new ClsUsuarioDAO();
        this.objRegistroDAO = new ClsRegistroDAO();
    }
    
    public String decodificarPeticion(String JSONPeticion) {    
        
        String accion;
        String argumentosPeticion;
        String resultado;     
        
        ClsPeticionDTO objPeticion = objConvertidor.fromJson(JSONPeticion, ClsPeticionDTO.class); 
        accion = objPeticion.getAccion();
        argumentosPeticion = objPeticion.getArgumentos();
        
        resultado = procesarAccion(accion, argumentosPeticion);
        return resultado;
    }

    private String procesarAccion(String accion, String argumentosPeticion) {

        String resultadoJSON="";
        ClsResultadoDTO objResultado = new ClsResultadoDTO();
        
        switch (accion) {
            
            case "ingresarAlSistema":
                
                String datosDePerfil[] = argumentosPeticion.split(",");
                String login = datosDePerfil[0];
                String contrasenia = datosDePerfil[1];
                
                boolean respuesta = objAdministradorDAO.iniciarSesion(login, contrasenia);
                
                if (respuesta)
                    objResultado.setCodigoResultado(1);
                else
                    objResultado.setCodigoResultado(-1);
                
            break;
            
            case "modificarLogin":
                
                String cambioDeLogin[] = argumentosPeticion.split(",");
                String loginActual = cambioDeLogin[0];
                String loginNuevo = cambioDeLogin[1];
                
                boolean cambioLogin = objAdministradorDAO.modificarLogin(loginNuevo,loginActual);
                
                if(cambioLogin){
                    objResultado.setCodigoResultado(1);
                }else
                    objResultado.setCodigoResultado(-1);
                                
            break;
            
            case "modificarContraseña":
                
                String cambioDeContrasenia[] = argumentosPeticion.split(",");
                String contraseniaActual = cambioDeContrasenia[0];
                String contraseniaNueva = cambioDeContrasenia[1];
                
                 boolean cambioContrasenia = objAdministradorDAO.modificarcontrasenia(contraseniaNueva, contraseniaActual);
                
                if(cambioContrasenia){
                    objResultado.setCodigoResultado(1);
                }else
                    objResultado.setCodigoResultado(-1);
                
            break;
            
            case "listarTodosLosUsuarios":
                
                ArrayList<ClsUsuarioDTO> listaTodos = objUsuarioDAO.consultarUsuarios();
                
                if(listaTodos.isEmpty()){
                    objResultado.setCodigoResultado(-1);
                }else{
                    objResultado.setCodigoResultado(1);
                    String respuestaListaUsuarios = objConvertidor.toJson(listaTodos);
                    objResultado.setJSONResultado(respuestaListaUsuarios);
                }
                
            break;
            
            case "listarUsuariosDentro":
                
                ArrayList<String> codigosUsuariosDentro = objRegistroDAO.codigosUsuariosFiltrado(1);
                ArrayList<ClsUsuarioDTO> listaUsuariosDentro = new ArrayList();
                
                if(listaUsuariosDentro.isEmpty()){
                    objResultado.setCodigoResultado(-1);
                }else{
                    objResultado.setCodigoResultado(1);
                    String respuestaListaUsuarios = objConvertidor.toJson(listaUsuariosDentro);
                    objResultado.setJSONResultado(respuestaListaUsuarios);
                }
                
            break;
            
            case "listarUsuariosFuera":
                
                ArrayList<ClsUsuarioDTO> listaUsuariosFuera = objUsuarioDAO.consultarUsuariosFuera();
                
                if(listaUsuariosFuera.isEmpty()){
                    objResultado.setCodigoResultado(-1);
                }else{
                    objResultado.setCodigoResultado(1);
                    String respuestaListaUsuarios = objConvertidor.toJson(listaUsuariosFuera);
                    objResultado.setJSONResultado(respuestaListaUsuarios);
                }
                
            break;
            
            case "registrarUsuario":
                
                ClsUsuarioDTO objUsuario = objConvertidor.fromJson(argumentosPeticion, ClsUsuarioDTO.class);
                    
                if(objUsuarioDAO.registrarUsuario(objUsuario))
                    objResultado.setCodigoResultado(1);
                else
                    objResultado.setCodigoResultado(-1);
                
            break;
            
            case "eliminarUsuario":
                  
                String codigoEliminar = argumentosPeticion;

                if(objUsuarioDAO.eliminarUsuario(codigoEliminar))
                    objResultado.setCodigoResultado(1);
                else
                    objResultado.setCodigoResultado(-1);                
                
            break;
            
            case "editarUsuario":
                
                String datosDeUsuarioAEditar[] = argumentosPeticion.split("/");
                String codigoOriginal = datosDeUsuarioAEditar[0];
                ClsUsuarioDTO objUsuarioEditado = this.objConvertidor.fromJson(datosDeUsuarioAEditar[1], ClsUsuarioDTO.class); 
                
                if(objUsuarioDAO.editarUsuario(objUsuarioEditado, codigoOriginal)){
                    objResultado.setCodigoResultado(1);
                }else 
                    objResultado.setCodigoResultado(-1);
                
            break;
            
            case "asignarRol":
                
                String datosDeAsignacionRol[] = argumentosPeticion.split(",");
                String codigoAsignarRol = datosDeAsignacionRol[0];
                String nuevoRol = datosDeAsignacionRol[1];

                if(objUsuarioDAO.editarRol(nuevoRol, codigoAsignarRol))
                    objResultado.setCodigoResultado(1);
                else
                    objResultado.setCodigoResultado(-1);                
                
            break;
            
            case "buscarUsuarios":

                String codigoPorBuscar = argumentosPeticion;
                ArrayList<ClsUsuarioDTO> listaCoincidentes = objUsuarioDAO.consultarUsuariosCoincidencia(codigoPorBuscar);
                
                if(listaCoincidentes.isEmpty()){
                    objResultado.setCodigoResultado(-1);
                }else{
                    objResultado.setCodigoResultado(1);
                    String respuestaListaCoincidentes = objConvertidor.toJson(listaCoincidentes);
                    objResultado.setJSONResultado(respuestaListaCoincidentes);
                }               
                
            break;
            
            case "entradaUsuario":
                
                String datosEntrada[] = argumentosPeticion.split("x");
                String registroEntrada = datosEntrada[0];
                String codigoEntrada = datosEntrada[1];
                
                if(objUsuarioDAO.existeUsuario(codigoEntrada)){
                
                    int ultimoRegistro = objRegistroDAO.obtenerTipoUltimoRegistro(codigoEntrada);

                    if(ultimoRegistro == 2){

                        ClsRegistroDTO objRegistroDTOEntrada = this.objConvertidor.fromJson(registroEntrada, ClsRegistroDTO.class); 
                        boolean respuestaEntrada = objRegistroDAO.asignarRegistroUsuario(codigoEntrada, objRegistroDTOEntrada);

                        if (respuestaEntrada)
                            objResultado.setCodigoResultado(1);  // exito en registro
                        else
                            objResultado.setCodigoResultado(-2); // error DB

                    }else if(ultimoRegistro == 1)
                        objResultado.setCodigoResultado(-1); // violacion de seguridad
                    
                }else
                    objResultado.setCodigoResultado(-3); // no registrado
                
            break;
            
            case "salidaUsuario":
                
                String datosSalida[] = argumentosPeticion.split("x");
                String registroSalida = datosSalida[0];
                String codigoSalida = datosSalida[1];
                
                if(objUsuarioDAO.existeUsuario(codigoSalida)){
                
                    int ultimoRegistrox = objRegistroDAO.obtenerTipoUltimoRegistro(codigoSalida);

                    if(ultimoRegistrox == 1){

                        ClsRegistroDTO objRegistroDTOEntrada = this.objConvertidor.fromJson(registroSalida, ClsRegistroDTO.class); 
                        boolean respuestaEntrada = objRegistroDAO.asignarRegistroUsuario(codigoSalida, objRegistroDTOEntrada);

                        if (respuestaEntrada)
                            objResultado.setCodigoResultado(1);  // exito en registro
                        else
                            objResultado.setCodigoResultado(-2); // error DB

                    }else if(ultimoRegistrox == 2)
                        objResultado.setCodigoResultado(-1); // violacion de seguridad
                
                }else
                    objResultado.setCodigoResultado(-3); // no registrado
                
                
            break;
            
        }
        
        resultadoJSON = objConvertidor.toJson(objResultado);
        return resultadoJSON;
    }
    
}

