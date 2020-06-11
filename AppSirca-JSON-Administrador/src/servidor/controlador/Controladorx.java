package servidor.controlador;

import com.google.gson.Gson;
import modelo.ClsAdministrador;
import modelo.ClsEmpresax;
import modelo.ClsPersona;
import modelo.ClsPeticion;
import modelo.ClsResultado;

public class Controladorx {
    private final Gson objConvertidor;
    private final ClsEmpresax objEmpresa;
    private final ClsAdministrador objAdministrador;
    
    public Controladorx(ClsEmpresax objEmpresa)
    {
        this.objConvertidor= new Gson();
        this.objEmpresa=objEmpresa;
        this.objAdministrador= new ClsAdministrador("admin", "admin12345");
    }
    
    public String decodificarPeticion(String JSONPeticion) {    
        String accion, argumentosPeticion, resultado;        
        ClsPeticion objPeticion= objConvertidor.fromJson(JSONPeticion, ClsPeticion.class); 
        accion=objPeticion.getAccion();
        argumentosPeticion=objPeticion.getArgumentos();
        resultado=procesarAccion(accion, argumentosPeticion);
        return resultado;
    }

    /**
     * Ejecuta la petición generada en el cliente
     *
     * @param accion operación remota que el cliente desea invocar
     * @param argumentosPeticion corresponde a los argumentos de la operación remota
     * @return  objeto  de la clase ClsResultado que almacena el resultado de la operación ejcutada
     */
    private String procesarAccion(String accion, String argumentosPeticion) {
        String resultadoJSON="";
        ClsResultado objResultado=new ClsResultado();
        switch (accion) {
            case "consultarPersona":
                String tipoIdentificacion, numeroIdentificacion;
                ClsPersona objPersonaEncontrada;
                String vector[]=argumentosPeticion.split(",");
                tipoIdentificacion=vector[0];
                numeroIdentificacion=vector[1];
                if(this.objEmpresa.existePersona(tipoIdentificacion, numeroIdentificacion)==true)
                {
                    objPersonaEncontrada=this.objEmpresa.consultarPersona(tipoIdentificacion, numeroIdentificacion);
                    String objPersonaComoJSON=objConvertidor.toJson(objPersonaEncontrada);                    
                    objResultado.setCodigoResultado(1);
                    objResultado.setJSONResultado(objPersonaComoJSON);                    
                }
                else
                {
                    objResultado.setCodigoResultado(-1);
                }
                
            break;
            case "registrarPersona":
                
                ClsPersona objPersona= objConvertidor.fromJson(argumentosPeticion, ClsPersona.class);
                if(this.objEmpresa.existePersona(objPersona.getTipoIdentificacion(), objPersona.getNumeroIdentificacion())==false)
                {
                    this.objEmpresa.agregarPersona(objPersona);
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
