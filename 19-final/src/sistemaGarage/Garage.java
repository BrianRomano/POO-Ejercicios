package sistemaGarage;

import vehiculos.*;

public class Garage {
    private double precioRueda;
    private int capacidadMaxima;
    private Vehiculo[] vehiculo;
    private int cantidadVehiculos;

    public Garage(double precioRueda, int capacidadMaxima) {
        this.precioRueda = precioRueda;
        this.capacidadMaxima = capacidadMaxima;
        vehiculo = new Vehiculo[10];
        cantidadVehiculos = 0;
    }

    public double getPrecioRueda() {
        return precioRueda;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public Vehiculo[] getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo[] vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    // Sobrecarga de método 'ingresarVehiculos'
    public void ingresarVehiculos(int idVehiculo, String marca, int kilometraje, Auto auto){
        int i = cantidadVehiculos ++;
        vehiculo[i] = new Vehiculo(idVehiculo, marca, kilometraje, auto);
    }
    public void ingresarVehiculos(int idVehiculo, String marca, int kilometraje, Moto moto){
        int i = cantidadVehiculos ++;
        vehiculo[i] = new Vehiculo(idVehiculo, marca, kilometraje, moto);
    }
}
