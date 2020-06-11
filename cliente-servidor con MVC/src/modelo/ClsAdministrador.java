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
public class ClsAdministrador {
    private String login;
    private String constrasenia;

    public ClsAdministrador(String login, String constrasenia) {
        this.login = login;
        this.constrasenia = constrasenia;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getConstrasenia() {
        return constrasenia;
    }

    public void setConstrasenia(String constrasenia) {
        this.constrasenia = constrasenia;
    }
    
    
}
