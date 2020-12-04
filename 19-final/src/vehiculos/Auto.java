package vehiculos;

public class Auto {
    private int numeroPuertas;

    public Auto(int numeroPuertas){
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String toString() {
        return "Numero de Puertas["+numeroPuertas+"]";
    }
}
