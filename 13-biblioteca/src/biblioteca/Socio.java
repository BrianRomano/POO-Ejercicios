package biblioteca;

public class Socio {
    private String nSocio;
    private String nombre;
    private Direccion direccion;
    private Prestamo prestamo;

    public Socio(String nSocio, String nombre, Direccion direccion, Prestamo prestamo){
        this.nSocio = nSocio;
        this.nombre = nombre;
        this.direccion = direccion;
        this.prestamo = prestamo;
    }

    public void retirar(Libro libro, String fecha) {
        if (!superaLimite()) {
            prestamo.setCantidad(prestamo.getCantidad() + 1);
            prestamo.setLibro(libro);
            prestamo.setFecha(fecha);
            prestamo.getLibro().setDisponible(false);
        } else {
            System.out.println("Ha alcanzado el limite de libros permitidos");
        }
    }

    public void devolver(String devolucion) {
        if (prestamo.getCantidad() != 0) {
            prestamo.setCantidad(prestamo.getCantidad() - 1);
            prestamo.getLibro().setDisponible(true);
            prestamo.setDevolucion(devolucion);
        } else {
            System.out.println("Ha devuelto todos los libros");
        }
    }

    public boolean superaLimite() {
        return prestamo.getCantidad() == 10;
    }

    public String toString() {
        return "Numero Socio: " + nSocio + "\nNombre: " + nombre
                + "\nDireccion: " + direccion + "\nPrestamo: "
                + prestamo;
    }
}
