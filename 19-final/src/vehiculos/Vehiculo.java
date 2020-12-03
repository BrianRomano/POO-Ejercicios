package vehiculos;

public class Vehiculo {
    private int idVehiculo;
    private String marca;
    private int kilometraje;
    private Auto auto;
    private Moto moto;

    // Constructor por defecto
    public Vehiculo(){}

    // Sobrecarga de constructor 'Vehiculo'
    public Vehiculo(int idVehiculo, String marca, int kilometraje, Auto auto){
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.kilometraje = kilometraje;
        this.auto = auto;
    }
    public Vehiculo(int idVehiculo, String marca, int kilometraje, Moto moto){
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.kilometraje = kilometraje;
        this.moto = moto;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }


    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public Moto getMoto() {
        return moto;
    }
}
