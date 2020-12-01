package vehiculos;

public class Auto {
    private int numeroPuertas;
    private final int ruedas = 4;

    public Auto(int numeroPuertas){
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public int getRuedas() {
        return ruedas;
    }
}
