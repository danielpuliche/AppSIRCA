package servidor.vista;

import java.io.IOException;
import modelo.ClsOrganizacion;
import servidor.controlador.Controlador;
import servidor.servicios.servidor;

public class vistaPrincipalServidor {
    
    public static void main(String[] args) {
        
        try {
            ClsOrganizacion objOrganizacion = new ClsOrganizacion();
            Controlador objControlador = new Controlador(objOrganizacion);
            servidor objServidor= new servidor(5000,objControlador);
            objServidor.ejecutarServidor();
        } catch (IOException ex) {
            System.out.println("Error al ejecutar el servidor");
        }
        
    }
    
}
