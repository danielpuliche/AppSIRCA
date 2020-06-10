
package servidor.vista;

import servidor.controlador.Controlador;
import java.io.IOException;
import modelo.ClsEmpresa;
import servidor.servicios.servidor;

public class vistaPrincipalServidor {

    
    public static void main(String[] args) {
        
        try {
            ClsEmpresa objEmpresa= new ClsEmpresa();
            Controlador objControlador= new Controlador(objEmpresa);
            servidor objServidor= new servidor(5000,objControlador);
            objServidor.ejecutarServidor();
        } catch (IOException ex) {
            System.out.println("Error al ejecutar el servidor");
        }
        
    }
    
}
