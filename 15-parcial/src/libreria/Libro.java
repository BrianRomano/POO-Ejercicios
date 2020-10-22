package libreria;

public class Libro {
    private String nombreLibro;
    private Autor autor; //Variable de referencia
    private Editorial editorial; //Variable de referencia
    private int anoPublicacion; //Variable primitiva
    private int cantidadEjemplares; //Variable primitiva
    private double costo; //Variable primitiva

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Libro: " +
                "\n-Nombre: "+ nombreLibro +
                "\n-Publicacion: " + anoPublicacion +
                "\n-Ejemplares: " + cantidadEjemplares +
                "\n-Costo: $" + costo +
                "\nAutor: " + autor +
                "\nEditorial: " + editorial;
    }
}
