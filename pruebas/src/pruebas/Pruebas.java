/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Personal
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Date fechaHora = new Date();
        String formatoFecha = "yyyy-MM-dd";
        String formatoHora = "hh:mm:ss";
        SimpleDateFormat fecha = new  SimpleDateFormat(formatoFecha);
        SimpleDateFormat hora = new SimpleDateFormat(formatoHora);
        
        System.out.println(fecha.format(fechaHora));
        System.out.println(hora.format(fechaHora));
        
    }
    
}
