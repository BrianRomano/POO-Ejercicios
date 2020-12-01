package vehiculos;

public class Vehiculo {
    private int idVehiculo;
    private String marca;
    private int kilometraje;
    private Auto auto;
    private Moto moto;

    public Vehiculo(int idVehiculo, String marca, int kilometraje){
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.kilometraje = kilometraje;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }
}
