package sistemaGarage;

import vehiculos.*;

public class GarageTest {
    public static void main(String[] args) {
        Garage garage = new Garage(100, 10);

        /* Ingreso de vehiculos */
        garage.ingresarVehiculos(123, "Ford", 10000);

    }
}
