package libroCalificaciones;

public class Alumno {
    private String nombre;
    private int asistencias;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setAsistencias(int asistencias){
        this.asistencias = asistencias;
    }
    public String toString(){
        return "Alumno: "+nombre+ " - Asistencia: "+asistencias;
    }
}
