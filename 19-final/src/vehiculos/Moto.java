package vehiculos;

public class Moto {
    private int cilindrada;

    public Moto(int cilindrada){
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public String toString() {
        return "Cilindrada["+cilindrada+"cv]";
    }
}
