package parcial;

public class Empleado {
    //Variable de referencia
    private Datos datos;
    //Variable primitiva
    private double sueldo;
    //Variable de referencia
    private Categoria categoria;

    public Datos getDatos() {
        return datos;
    }

    public void setDatos(Datos datos) {
        this.datos = datos;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String toString() {
        return datos+"\nSueldo: "+sueldo+
                "\n"+categoria;
    }
}
