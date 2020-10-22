package libreria;

public class Orden {
    public double totalPagar; //Variable primitiva

    //Método que suma el costo de los libros
    public double agregarLibro(Libro libro){
        totalPagar += libro.getCosto();
        return totalPagar;
    }
}
