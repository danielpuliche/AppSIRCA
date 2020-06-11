package modelo;

public class ClsPeticion {

    private String accion;//iniciar sesión, registrar cliente, consultar cliente
    private String argumentos;// argumentos de la operación a ejecutar en el servidor

    public ClsPeticion(String accion, String argumentos) {
        this.accion = accion;
        this.argumentos = argumentos;
    }

    public ClsPeticion() {
      
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(String argumentos) {
        this.argumentos = argumentos;
    }

      
    
    
}
