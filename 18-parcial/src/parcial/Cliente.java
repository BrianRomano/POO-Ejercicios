package parcial;

public class Cliente {
    //Variable de referencia
    private Datos datos;
    //Variable primitiva
    private int telefono;

    public Datos getDatos() {
        return datos;
    }

    public void setDatos(Datos datos) {
        this.datos = datos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return datos+"\nTelefono: "+telefono;
    }
}
