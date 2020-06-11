package cliente.vista;

import cliente.servicios.cliente;

public class vistaPrincipalCliente {
    
    public static void main(String[] args) {
       
        cliente objCliente= new cliente("localhost", 5000);//al cliente se le envia la dirección ip del servidor y puerto del servidor
        VtnIngresoAlSistema objVtnIngresoAlSistema = new VtnIngresoAlSistema(objCliente);
        objVtnIngresoAlSistema.setVisible(true);
    }
    
}
