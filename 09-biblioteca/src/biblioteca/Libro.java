package biblioteca;

public class Libro {
    private String id;
    private String titulo;
    private String autor;
    private Categoria categoria;
    private boolean disponibilidad;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public boolean isDisponible() {
        return disponibilidad;
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
