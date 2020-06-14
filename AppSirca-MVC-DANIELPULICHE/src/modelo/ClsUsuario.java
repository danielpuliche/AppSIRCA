package modelo;

public class ClsUsuario {
    
    private String identificacion;
    private String nombres;
    private String apellidos;
    private EnumGenero genero;
    private EnumRol rol;

    public ClsUsuario(String identificacion, String nombres, String apellidos, String genero, String rol) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = darGenero(genero);
        this.rol = darRol(rol);
    }
    
    public static EnumGenero darGenero(String generoRecibido){
        
        EnumGenero generoEnum = EnumGenero.Otro;
        
        switch(generoRecibido){
            case "Masculino":
                generoEnum = EnumGenero.Masculino;
            break;
            case "Femenino":
                generoEnum = EnumGenero.Femenino;
            break;
            case "Otro":
                generoEnum = EnumGenero.Otro;
            break;
        }
        
        return generoEnum;
    }
    
    public static EnumRol darRol(String rolRecibido){
        
        EnumRol rolEnum = EnumRol.No_Asignado;
        
        switch(rolRecibido){
            case "Administrativo":
                rolEnum = EnumRol.Administrativo;
            break;
            case "Docente":
                rolEnum = EnumRol.Docente;
            break;
            case "Estudiante":
                rolEnum = EnumRol.Estudiante;
            break;
            case "No asignado":
                rolEnum = EnumRol.No_Asignado;
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

    public EnumGenero getGenero() {
        return genero;
    }

    public void setGenero(EnumGenero genero) {
        this.genero = genero;
    }

    public EnumRol getRol() {
        return rol;
    }

    public void setRol(EnumRol rol) {
        this.rol = rol;
    }    
        
}
