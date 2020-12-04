package sistemaGarage;

import vehiculos.*;

import java.util.Arrays;

public class Garage {
    private double precioRueda;
    private int capacidadMaxima;
    private Vehiculo[] vehiculo;
    private int cantidadVehiculos;
    private int cantidadRuedas = 0;
    private double costoCambio = 0;

    public Garage(double precioRueda, int capacidadMaxima) {
        this.precioRueda = precioRueda;
        this.capacidadMaxima = capacidadMaxima;
        vehiculo = new Vehiculo[100];
        cantidadVehiculos = 0;
    }

    public double getPrecioRueda() {
        return precioRueda;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public Vehiculo getVehiculo(int index) {
        return vehiculo[index];
    }

    public void setVehiculo(Vehiculo[] vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    // Sobrecarga de método 'ingresarVehiculos'
    public void ingresarVehiculos(int idVehiculo, String marca, int kilometraje, Auto auto) {
        if (cantidadVehiculos < capacidadMaxima) {
            cantidadRuedas += 4;
            int i = cantidadVehiculos++;
            vehiculo[i] = new Vehiculo(idVehiculo, marca, kilometraje, auto);
        } else {
            aviso();
        }

    }

    public void ingresarVehiculos(int idVehiculo, String marca, int kilometraje, Moto moto) {
        if (cantidadVehiculos < capacidadMaxima) {
            cantidadRuedas += 2;
            int i = cantidadVehiculos++;
            vehiculo[i] = new Vehiculo(idVehiculo, marca, kilometraje, moto);
        } else {
            aviso();
        }
    }

    public void retirarVehiculos(Auto auto){
        cantidadVehiculos--;
        cantidadRuedas -= 4;
        System.out.println("------ Se ha retirado un auto -------");
    }

    public void retirarVehiculos(Moto moto){
        cantidadVehiculos--;
        cantidadRuedas -= 2;
        System.out.println("------ Se ha retirado una moto ------");
    }

    public int plazasDisponibles() {
        return (capacidadMaxima - cantidadVehiculos);
    }

    public void aviso() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("\nNo hay espacio disponible en el Garage");
        System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public double calcularCosto() {
        costoCambio = cantidadRuedas * precioRueda;
        return costoCambio;
    }

    @Override
    public String toString() {
        return "\n-------------- Garage --------------" +
                "\n\nPrecio cambio de rueda: $" + precioRueda +
                "\nCapacidad Maxima: " + capacidadMaxima+
                "\nCantidad de autos: "+cantidadVehiculos;
    }
}
