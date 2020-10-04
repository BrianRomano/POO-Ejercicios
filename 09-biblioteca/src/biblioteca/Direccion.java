package biblioteca;

public class Direccion {
    private String calle;
    private String numero;


    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String toString() {
        return calle + " " + numero;
    }
}
