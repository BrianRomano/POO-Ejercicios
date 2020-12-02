package vehiculos;

public class Moto {
    private int cilindrada;
    private final int ruedas = 2;

    public Moto(int cilindrada){
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getRuedas() {
        return ruedas;
    }
}
