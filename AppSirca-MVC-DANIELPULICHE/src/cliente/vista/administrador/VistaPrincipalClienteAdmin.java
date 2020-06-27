package cliente.vista.administrador;

import cliente.servicios.cliente;

public class VistaPrincipalClienteAdmin {
    
    public static void main(String[] args) {
       
        cliente objCliente= new cliente("localhost", 5000);//al cliente se le envia la dirección ip del servidor y puerto del servidor
        VtnIniciarSesion objVtnIniciarSesion = new VtnIniciarSesion(objCliente);
        objVtnIniciarSesion.setVisible(true);
        
    }
    
}
