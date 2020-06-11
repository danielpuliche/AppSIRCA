package servidor.vista;

import servidor.controlador.Controladorx;
import java.io.IOException;
import modelo.ClsEmpresax;
import servidor.servicios.servidor;

public class vistaPrincipalServidor {
    
    public static void main(String[] args) {
        
        try {
            ClsEmpresax objEmpresax= new ClsEmpresax();
            Controladorx objControladorx= new Controladorx(objEmpresax);
            servidor objServidor= new servidor(5000,objControladorx);
            objServidor.ejecutarServidor();
        } catch (IOException ex) {
            System.out.println("Error al ejecutar el servidor");
        }
        
    }
    
}
