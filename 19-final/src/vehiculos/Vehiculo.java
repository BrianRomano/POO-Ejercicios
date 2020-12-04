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

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public String getMarca() {
        return marca;
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

    @Override
    public String toString() {
        return "\n    Auto: "+auto+
                "\n    Moto: "+moto;
    }
}
