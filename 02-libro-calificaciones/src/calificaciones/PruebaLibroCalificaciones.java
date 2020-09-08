package calificaciones;

public class PruebaLibroCalificaciones {
    public static void main(String[] args) {
        LibroCalificaciones calificaciones = new LibroCalificaciones();
        calificaciones.setNombreCurso("1ero A");
        System.out.println("Nombre curso: "+calificaciones.getNombreCurso());
    }
}
