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
public class ClsResultado {
    private int codigoResultado;//1 si se registro el cliente exitosamente, 2 si el cliente ya exite en el servidor
    private String JSONResultado;//los datos correspondientes a un conductor consultado

    public ClsResultado()
    {   
        this.codigoResultado=0;
        this.JSONResultado="";
    }
    public ClsResultado(int codigoResultado, String JSONResultado) {
        this.codigoResultado = codigoResultado;
        this.JSONResultado = JSONResultado;
    }

    public int getCodigoResultado() {
        return codigoResultado;
    }

    public void setCodigoResultado(int codigoResultado) {
        this.codigoResultado = codigoResultado;
    }

    public String getJSONResultado() {
        return JSONResultado;
    }

    public void setJSONResultado(String JSONResultado) {
        this.JSONResultado = JSONResultado;
    }

  
    
    
}
