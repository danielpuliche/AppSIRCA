/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Lenovo!
 */
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
