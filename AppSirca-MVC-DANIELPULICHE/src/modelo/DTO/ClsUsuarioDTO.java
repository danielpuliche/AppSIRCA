package modelo.DTO;

public class ClsUsuarioDTO {
    
    private String codigo;
    private String nombres;
    private String apellidos;
    private EnumGenero genero;
    private EnumRol rol;

    public ClsUsuarioDTO(String codigo, String apellidos, String nombres, String genero, String rol) {
        this.codigo = codigo;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.genero = darGenero(genero);
        this.rol = darRol(rol);
    }
    
    public EnumGenero darGenero(String generoRecibido){
        
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
    
    public String obtenerRol(EnumRol rolRecibido){
        
        String rolString = "";
                        switch(rolRecibido){
                            case Administrativo:
                                rolString = "Administrativo";
                            break;
                            case Docente:
                                rolString = "Docente";
                            break;
                            case Estudiante:
                                rolString = "Estudiante";
                            break;                
                            case No_Asignado:
                                rolString = "No asignado";
                            break;
                            default:
                                
                            break;
                        }
        return rolString;
    }
    
    public String obtenerGenero(EnumGenero generoRecibido){
        
        String String = "";
                        switch(generoRecibido){
                            case Masculino:
                                String = "Masculino";
                            break;
                            case Femenino:
                                String = "Femenino";
                            break;
                            case Otro:
                                String = "Otro";
                            break;                
                            default:
                                
                            break;
                        }
        return String;
    }
    
    public EnumRol darRol(String rolRecibido){
        
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public void setGenero(EnumGenero genero) {
        this.genero = genero;
    }

    public void setRol(EnumRol rol) {
        this.rol = rol;
    }

    public EnumGenero getGenero() {
        return genero;
    }

    public EnumRol getRol() {
        return rol;
    } 
        
}
