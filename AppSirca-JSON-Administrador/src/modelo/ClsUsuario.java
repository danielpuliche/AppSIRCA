package modelo;

public class ClsUsuario {
    
    private String identificacion;
    private String nombres;
    private String apellidos;
    private enumGenero genero;
    private enumRol rol;

    public ClsUsuario(String identificacion, String nombres, String apellidos, enumGenero genero, enumRol rol) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.rol = rol;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public enumGenero getGenero() {
        return genero;
    }

    public void setGenero(enumGenero genero) {
        this.genero = genero;
    }

    public enumRol getRol() {
        return rol;
    }

    public void setRol(enumRol rol) {
        this.rol = rol;
    }
    
        
}
