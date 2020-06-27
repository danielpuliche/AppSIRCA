package cliente.vista.usuarios;

import cliente.servicios.cliente;

public class VistaPrincipalClienteUsuario {
    
    public static void main(String[] args) {
       
        cliente objCliente= new cliente("localhost", 5000);//al cliente se le envia la dirección ip del servidor y puerto del servidor
        VtnPrincipalUser objVtnPrincipalUser = new VtnPrincipalUser(objCliente);
        objVtnPrincipalUser.setVisible(true);
        
    }
    
}
