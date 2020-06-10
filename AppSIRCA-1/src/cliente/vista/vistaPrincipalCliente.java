/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.vista;

import cliente.servicios.cliente;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.ClsPersona;
import modelo.ClsPeticion;

/**
 *
 * @author Lenovo!
 */
public class vistaPrincipalCliente {

    
    public static void main(String[] args) {
       
        cliente objCliente= new cliente("localhost", 5000);//al cliente se le envia la dirección ip del servidor y puerto del servidor
        GUIAutenticacion vtnAutenticacion= new GUIAutenticacion(objCliente);
        vtnAutenticacion.setVisible(true);
       
    }
    
}
