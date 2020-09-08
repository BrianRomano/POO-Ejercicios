package calificaciones;

public class PruebaLibroCalificaciones {
    public static void main(String[] args) {
        //Objetos
        LibroCalificaciones calificaciones = new LibroCalificaciones();
        LibroCalificaciones calificaciones1 = new LibroCalificaciones();
        //Set
        calificaciones.setNombreCurso("POO");
        calificaciones1.setNombreCurso("Bases de datos");
        //Get
        System.out.println("Nombre curso: "+calificaciones.getNombreCurso());
        System.out.println("Nombre curso: "+calificaciones1.getNombreCurso());
    }
}
