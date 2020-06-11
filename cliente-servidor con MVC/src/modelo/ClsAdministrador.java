package modelo;

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
