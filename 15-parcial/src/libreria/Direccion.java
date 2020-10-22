package libreria;

public class Direccion {
    private String calle;
    private int alturaCalle; //Variable primitiva
    private String localidad;

    //Sobrecarga de constructor
    public Direccion(String calle, int alturaCalle, String localidad){
        this.calle = calle;
        this.alturaCalle = alturaCalle;
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return  "\n-Calle: " + calle +
                "\n-Altura: " + alturaCalle +
                "\n-Localidad: " + localidad;
    }
}
