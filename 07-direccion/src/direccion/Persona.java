package direccion;

public class Persona {
    private String nombre;
    private String apellido;
    private String inicial;
    private int id;

    private Direccion direccion;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setInicial(String inicial) {
        this.inicial = inicial;
    }
    public void setID(int id) {
        this.id = id;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public String toString() {
        return "ID: " + id + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nInicial: " + inicial + "\nDireccion: " + direccion;
    }
}
