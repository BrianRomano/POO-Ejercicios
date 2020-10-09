package biblioteca;

public class Libro {
    private String id;
    private String titulo;
    private String autor;
    private Categoria categoria;
    private boolean disponibilidad;

    public Libro(String id, String titulo, String autor, Categoria categoria){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    public void setDisponible(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String toString() {
        return "\nCodigo: " + id + "\nTitulo: " + titulo +
                "\nAutor: " + autor + "\nDisponibilidad: " + disponibilidad +
                "\n" + categoria;
    }
}
