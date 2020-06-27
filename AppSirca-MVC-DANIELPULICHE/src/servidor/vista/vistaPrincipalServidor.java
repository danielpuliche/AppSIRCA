package servidor.vista;

import java.io.IOException;
import servidor.controlador.Controlador;
import servidor.servicios.servidor;

public class vistaPrincipalServidor {
    
    public static void main(String[] args) {
        
        try {
            Controlador objControlador = new Controlador();
            servidor objServidor= new servidor(5000,objControlador);
            objServidor.ejecutarServidor();
        } catch (IOException ex) {
            System.out.println("Error al ejecutar el servidor");
        } catch (Exception e){
            System.out.println("Error"+e.getMessage());
        }
        
    }
    
}
