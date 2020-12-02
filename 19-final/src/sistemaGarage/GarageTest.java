package sistemaGarage;

import vehiculos.*;

public class GarageTest {
    public static void main(String[] args) {
        Garage garage = new Garage(100, 10);

        // Ingreso de vehiculos - Autos
        Auto autoUno = new Auto(5);
        garage.ingresarVehiculos(123, "Ford", 10000, autoUno);
        Auto autoDos = new Auto(5);
        garage.ingresarVehiculos(789, "Chevrolet", 20000, autoDos);
        Auto autotres = new Auto(147);
        garage.ingresarVehiculos(147, "BMW", 30000, autotres);
        Auto autoCuatro = new Auto(3);
        garage.ingresarVehiculos(258, "Fiat", 15000, autoCuatro);
        Auto autoCinco = new Auto(3);
        garage.ingresarVehiculos(369, "Peugeot", 50000, autoCinco);
        Auto autoSeis = new Auto(5);
        garage.ingresarVehiculos(963, "Renault", 7000, autoSeis);
        Auto autoSiete = new Auto(3);
        garage.ingresarVehiculos(951, "Dodge", 100000, autoSiete);

        // Ingreso de vehiculos - Motos
        Moto motoUno = new Moto(125);
        garage.ingresarVehiculos(456, "Honda", 10000, motoUno);
        Moto motoDos = new Moto(250);
        garage.ingresarVehiculos(741, "Yamaha", 5000, motoDos);
        Moto motoTres = new Moto(500);
        garage.ingresarVehiculos(852, "Kawasaki", 1000, motoTres);
    }
}
