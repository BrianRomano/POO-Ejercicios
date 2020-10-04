package biblioteca;

public class PrestamoTest {
    public static void main(String[] args) {
        Categoria categoria_1 = new Categoria();
        categoria_1.setSignatura("Terror");
        categoria_1.setUbicacion("T2");

        Libro libro_1 = new Libro();
        libro_1.setId("1");
        libro_1.setTitulo("Pet cemetery");
        libro_1.setAutor("Stephen King");
        libro_1.setCategoria(categoria_1);
        libro_1.setDisponible(true);

        Prestamo prestamo_1 = new Prestamo();
        prestamo_1.setId("1");
        prestamo_1.setFecha("15/03/1996");
        prestamo_1.setCantidad(1);

        Direccion direccion_1 = new Direccion();
        direccion_1.setCalle("washintong");
        direccion_1.setNumero("2550");

        Socio socio_1 = new Socio();
        socio_1.setNsocio("1");
        socio_1.setNombre("Laura Sanchez");
        socio_1.setDireccion(direccion_1);
        socio_1.setPrestamo(prestamo_1);

        Categoria categoria_2 = new Categoria();
        categoria_2.setSignatura("Fantasía");
        categoria_2.setUbicacion("F3");

        Libro libro_2 = new Libro();
        libro_2.setId("2");
        libro_2.setTitulo("El Nombre del Viento");
        libro_2.setAutor("Patrick Rothfuss");
        libro_2.setCategoria(categoria_2);
        libro_2.setDisponible(true);

        Prestamo prestamo_2 = new Prestamo();
        prestamo_2.setId("2");
        prestamo_2.setFecha("15/03/1996");
        prestamo_2.setCantidad(2);

        Direccion direccion_2 = new Direccion();
        direccion_2.setCalle("Ademre");
        direccion_2.setNumero("2550");

        Socio socio_2 = new Socio();
        socio_2.setNsocio("2");
        socio_2.setNombre("Kvothe Kote");
        socio_2.setDireccion(direccion_2);
        socio_2.setPrestamo(prestamo_2);

        socio_1.retirar(libro_1, "10/10/19");
        socio_2.retirar(libro_2, "10/10/19");
        socio_1.devolver("10/10/19");
        socio_1.retirar(libro_2, "10/10/19");
        socio_1.retirar(libro_1, "10/10/19");
        socio_1.retirar(libro_2, "10/10/19");
        socio_1.retirar(libro_2, "10/10/19");
        socio_2.retirar(libro_2, "10/10/19");
        socio_2.retirar(libro_2, "10/10/19");
        socio_2.retirar(libro_2, "10/10/19");
        socio_2.retirar(libro_2, "10/10/19");
        socio_2.retirar(libro_2, "10/10/19");
        socio_2.retirar(libro_2, "10/10/19");
        socio_2.retirar(libro_2, "10/10/19");
        socio_2.retirar(libro_2, "10/10/19");
        socio_2.retirar(libro_2, "10/10/19");
        socio_2.retirar(libro_2, "10/10/19");

        System.out.println(socio_1.toString());
        System.out.println("--------------");
        System.out.println(socio_2);
    }
}
