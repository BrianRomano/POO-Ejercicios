package libroCalificaciones;

public class LibroCalificacionesTest {
    public static void main(String[] args) {
        //Objetos
        LibroCalificaciones curso = new LibroCalificaciones();
        Alumno alumno = new Alumno();
        Instructor instructor = new Instructor();

        //Set
        curso.setNombreCurso("POO");
        curso.setMensaje("Bienvenido");
        curso.setCalificaciones(9.9);
        curso.setAlumno(alumno);
        curso.setInstructor(instructor);

        alumno.setNombre("Brian");
        alumno.setAsistencias(100);

        instructor.setNombre("Leonel");
        instructor.setNLegajo(123);

        //Mostrar
        System.out.println(curso);
    }
}
