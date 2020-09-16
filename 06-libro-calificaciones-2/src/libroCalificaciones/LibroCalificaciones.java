package libroCalificaciones;

public class LibroCalificaciones {
    private String nombreCurso;
    private double calificaciones;
    private String mensaje;

    private Instructor instructor;
    private Alumno alumno;

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }
    public void setCalificaciones(double calificaciones){
        this.calificaciones = calificaciones;
    }
    public void setInstructor(Instructor instructor){
        this.instructor = instructor;
    }
    public void setAlumno(Alumno alumno){
        this.alumno = alumno;
    }
    public String toString() {
        return "Libro calificaciones: "+mensaje+"\nCalificaciones: "+calificaciones+
                "\nNombre del curso: "+nombreCurso+"\n"+instructor+ "\n"+alumno;
    }
}

