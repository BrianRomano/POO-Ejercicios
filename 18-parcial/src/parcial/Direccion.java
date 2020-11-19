package parcial;

public class Direccion {
    private String ciudad;
    private String calle;
    //Variable primitiva
    private int alturaCalle;

    //Sobrecarga
    public Direccion(String ciudad, String calle, int alturaCalle){
        this.ciudad = ciudad;
        this.calle = calle;
        this.alturaCalle = alturaCalle;
    }

    public String toString() {
        return ciudad+", "+calle+", "+ alturaCalle;
    }
}
