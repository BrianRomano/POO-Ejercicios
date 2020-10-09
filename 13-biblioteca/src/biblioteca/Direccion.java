package biblioteca;

public class Direccion {
    private String calle;
    private String numero;

    public Direccion(String calle, String numero){
        this.calle = calle;
        this.numero = numero;
    }

    public String toString() {
        return calle + " " + numero;
    }
}
