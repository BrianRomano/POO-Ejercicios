package libreria;

public class Libreria {
    public static void main(String[] args) {
        //Objetos
        Orden orden = new Orden();
        Libro libroUno = new Libro();
        Libro libroDos = new Libro();
        Libro libroTres = new Libro();

        //Uso de constructores
        Direccion direccion = new Direccion("9 de julio", 999, "CABA");
        Autor autor = new Autor("JRR", "Tolkien", "3 de enero 1892", 'M', "tolkien@tolkien.com");
        Editorial editorial = new Editorial("Minotauro", 1123456789, direccion, "minotauro@minotauro.com", 274565846);

        //Uso de Get y Set
        libroUno.setNombreLibro("La comunidad del anillo");
        libroUno.setAutor(autor);
        libroUno.setEditorial(editorial);
        libroUno.setAnoPublicacion(1954);
        libroUno.setCantidadEjemplares(950);
        libroUno.setCosto(1499.9d);


        libroDos.setNombreLibro("Las dos torres");
        libroDos.setAutor(autor);
        libroDos.setEditorial(editorial);
        libroDos.setAnoPublicacion(1955);
        libroDos.setCantidadEjemplares(1500);
        libroDos.setCosto(1699.9d);

        libroTres.setNombreLibro("El retorno del rey");
        libroTres.setAutor(autor);
        libroTres.setEditorial(editorial);
        libroTres.setAnoPublicacion(1955);
        libroTres.setCantidadEjemplares(689);
        libroTres.setCosto(2199.9d);

        //Mostrar
        System.out.println(libroUno);
        System.out.println("\n---------------------\n");
        System.out.println(libroDos);
        System.out.println("\n---------------------\n");
        System.out.println(libroTres);
        System.out.println("\n---------------------\n");

        double totalPagar = 0.0d; //Variable local
        totalPagar = orden.agregarLibro(libroUno);
        totalPagar = orden.agregarLibro(libroDos);
        totalPagar = orden.agregarLibro(libroTres);
        System.out.println("Total a pagar : $"+totalPagar);
    }
}
