package biblioteca;

public class PrestamoTest {
    public static void main(String[] args) {

        Categoria categoria_1 = new Categoria("Terror", "T2");

        Libro libro_1 = new Libro("1", "Pet cemetery", "Stephen King", categoria_1);
        libro_1.setDisponible(true);

        Prestamo prestamo_1 = new Prestamo("1");

        Direccion direccion_1 = new Direccion("washintong", "2550");

        Socio socio_1 = new Socio("1", "Laura Sanchez", direccion_1, prestamo_1);

        //////////////////////////////////////////////////////////////////////////////

        Categoria categoria_2 = new Categoria("Fantasia", "F3");

        Libro libro_2 = new Libro("2", "El nombre del Viento", "Patrick Rothfuss", categoria_2);
        libro_2.setDisponible(true);

        Prestamo prestamo_2 = new Prestamo("2");

        Direccion direccion_2 = new Direccion("Ademre", "2550");

        Socio socio_2 = new Socio("2", "Kvothe Kote", direccion_2, prestamo_2);

        ///////////////////////////////////////////////////////////////////////////////

        socio_1.retirar(libro_1, "10/10/19");
        socio_2.retirar(libro_2, "10/10/19");
        socio_1.devolver("10/10/19");

        System.out.println(socio_1);
        System.out.println("--------------");
        System.out.println(socio_2);
    }
}
