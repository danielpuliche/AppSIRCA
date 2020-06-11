package modelo;

public class ClsUsuario {
    
    private String identificacion;
    private String nombres;
    private String apellidos;
    private enumGenero genero;
    private enumRol rol;

    public ClsUsuario(String identificacion, String nombres, String apellidos, String genero, String rol) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = darGenero(genero);
        this.rol = darRol(rol);
    }
    
    public enumGenero darGenero(String generoRecibido){
        
        enumGenero generoEnum = enumGenero.Femenino;
        
        switch(generoRecibido){
            case "Masculino":
                generoEnum = enumGenero.Masculino;
            break;
            case "Femenino":
                generoEnum = enumGenero.Femenino;
            break;
            case "Otro":
                generoEnum = enumGenero.Otro;
            break;
        }
        
        return generoEnum;
    }
    
    public enumRol darRol(String rolRecibido){
        
        enumRol rolEnum = enumRol.Administrativo;
        
        switch(rolRecibido){
            case "Administrativo":
                rolEnum = enumRol.Administrativo;
            break;
            case "Docente":
                rolEnum = enumRol.Docente;
            break;
            case "Estudiante":
                rolEnum = enumRol.Estudiante;
            break;
            case "No asignado":
                rolEnum = enumRol.No_Asignado;
            break;
        }
        
        return rolEnum;
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
