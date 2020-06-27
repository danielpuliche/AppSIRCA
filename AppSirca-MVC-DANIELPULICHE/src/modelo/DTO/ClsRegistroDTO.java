package modelo.DTO;

public class ClsRegistroDTO {

    private final String fecha;
    private final String hora;
    private final int tipoRegistro;

    public ClsRegistroDTO(String fecha, String hora, int tipoRegistro) {
        this.fecha = fecha;
        this.hora = hora;
        this.tipoRegistro = tipoRegistro;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public int getTipoRegistro() {
        return tipoRegistro;
    }   
    
}
