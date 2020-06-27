package servidor.controlador;

import com.google.gson.Gson;
import java.util.ArrayList;
import modelo.ClsAdministrador;
import modelo.ClsOrganizacion;
import modelo.DTO.ClsPeticionDTO;
import modelo.DTO.ClsResultadoDTO;
import modelo.DTO.ClsUsuarioDTO;

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
        
        ClsPeticionDTO objPeticion= objConvertidor.fromJson(JSONPeticion, ClsPeticionDTO.class); 
        accion=objPeticion.getAccion();
        argumentosPeticion=objPeticion.getArgumentos();
        
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
                
                ClsAdministrador objAdministrador = this.objOrganizacion.getAdministrador();
                if(objAdministrador.getLogin().equals(login) && objAdministrador.getConstrasenia().equals(contrasenia)){
                    objResultado.setCodigoResultado(1);
                }else{
                    objResultado.setCodigoResultado(-1);
                }
                
            break;
            
            case "listarTodosLosUsuarios":

                ArrayList<ClsUsuarioDTO> listaTodos = objOrganizacion.getListaUsuarios();
                
                if(listaTodos.isEmpty()){
                    objResultado.setCodigoResultado(-1);
                }else{
                    objResultado.setCodigoResultado(1);
                    String respuestaListaUsuarios = objConvertidor.toJson(listaTodos);
                    objResultado.setJSONResultado(respuestaListaUsuarios);
                }
                
            break;
            
            case "buscarUsuarios":

                String codigoPorBuscar = argumentosPeticion;
                ArrayList<ClsUsuarioDTO> listaCoincidentes = objOrganizacion.buscarUsuariosCoincidentes(codigoPorBuscar);
                
                if(listaCoincidentes.isEmpty()){
                    objResultado.setCodigoResultado(-1);
                }else{
                    objResultado.setCodigoResultado(1);
                    String respuestaListaCoincidentes = objConvertidor.toJson(listaCoincidentes);
                    objResultado.setJSONResultado(respuestaListaCoincidentes);
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
            
            case "modificarContraseña":
                
                String cambioDeContrasenia[] = argumentosPeticion.split(",");
                String contraseniaActual = cambioDeContrasenia[0];
                String contraseniaNueva = cambioDeContrasenia[1];
                
                if(contraseniaActual.equals(objOrganizacion.getAdministrador().getConstrasenia())){
                    objOrganizacion.getAdministrador().setConstrasenia(contraseniaNueva);
                    objResultado.setCodigoResultado(1);
                }else
                    objResultado.setCodigoResultado(-1);
                
            break;
            
            case "registrarUsuario":
                
                ClsUsuarioDTO objUsuario = objConvertidor.fromJson(argumentosPeticion, ClsUsuarioDTO.class);
                    
                String codigo = objUsuario.getCodigo();
                String apellidos = objUsuario.getApellidos();
                String nombres = objUsuario.getNombres();
                String rol = objUsuario.obtenerRol(objUsuario.getRol());
                String genero = objUsuario.obtenerGenero(objUsuario.getGenero());
                  
                if(this.objOrganizacion.existeUsuario(codigo) == false)
                {
                    this.objOrganizacion.agregarUsuario(codigo, apellidos, nombres, genero, rol);
                    objResultado.setCodigoResultado(1);
                }
                else
                {
                    objResultado.setCodigoResultado(-1);
                }
                
            break;
            
            case "eliminarUsuario":
                  
                String codigoEliminar = argumentosPeticion;

                if(objOrganizacion.eliminarUsuario(codigoEliminar))
                    objResultado.setCodigoResultado(1);
                else
                    objResultado.setCodigoResultado(-1);                
                
            break;
            
            case "asignarRol":
                
                String datosDeAsignacionRol[] = argumentosPeticion.split(",");
                String codigoAsignarRol = datosDeAsignacionRol[0];
                String nuevoRol = datosDeAsignacionRol[1];
                System.out.println(codigoAsignarRol);

                if(objOrganizacion.existeUsuario(codigoAsignarRol)){
                    objOrganizacion.asignarRol(codigoAsignarRol, nuevoRol);
                    objResultado.setCodigoResultado(1);
                }else{
                    objResultado.setCodigoResultado(-1);                
                }
    
            break;
            
            case "editarUsuario":
                
                String datosDeUsuarioAEditar[] = argumentosPeticion.split("/");
                String codigoOriginal = datosDeUsuarioAEditar[0];
                ClsUsuarioDTO objUsuarioEditado = this.objConvertidor.fromJson(datosDeUsuarioAEditar[1], ClsUsuarioDTO.class); 
                
                String codigoEditado = objUsuarioEditado.getCodigo();
                String nombresEditado = objUsuarioEditado.getNombres();
                String apellidosEditado = objUsuarioEditado.getApellidos();
                String generoEditado = objUsuarioEditado.obtenerGenero(objUsuarioEditado.getGenero());
                String rolEditado = objUsuarioEditado.obtenerRol(objUsuarioEditado.getRol());
                
                if(this.objOrganizacion.existeUsuario(codigoOriginal) == true)
                {
                    if(codigoOriginal.equals(codigoEditado)){
                        this.objOrganizacion.editarUsuario(codigoOriginal, codigoEditado, apellidosEditado, nombresEditado, generoEditado, rolEditado);
                        objResultado.setCodigoResultado(1);
                    }else{ 
                        if(this.objOrganizacion.existeUsuario(codigoEditado) == false){
                            this.objOrganizacion.editarUsuario(codigoOriginal, codigoEditado, apellidosEditado, nombresEditado, generoEditado, rolEditado);
                            objResultado.setCodigoResultado(1);
                        }else
                            objResultado.setCodigoResultado(-2);
                    }
                }
                else
                {
                    objResultado.setCodigoResultado(-1);
                }
                
            break;
           
        }
        
        resultadoJSON = objConvertidor.toJson(objResultado);
        return resultadoJSON;
    }
    
}

