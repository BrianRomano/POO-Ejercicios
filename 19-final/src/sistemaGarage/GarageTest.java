package sistemaGarage;

import vehiculos.*;

public class GarageTest {
    public static void main(String[] args) {
        Garage garage = new Garage(100, 12);

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
        Moto motoCuatro = new Moto(125);
        garage.ingresarVehiculos(753, "Zanella", 5000, motoCuatro);
        Moto motoCinco = new Moto(250);
        garage.ingresarVehiculos(975, "Benelli", 20000, motoCinco);

        //Retiro de auto y moto
        garage.retirarVehiculos(autoSiete);
        garage.retirarVehiculos(motoCinco);

        // Total Promedio Km
        int totalKm = 0;

        // Mostrar
        System.out.println(garage);
        System.out.println("\n------------- Ingresos -------------");

        for(int i = 0; i < garage.getCantidadVehiculos(); i++){
            Vehiculo vehiculo = garage.getVehiculo(i);
            System.out.println(("\nId Vehiculo: "+vehiculo.getIdVehiculo()+"\nMarca: "+vehiculo.getMarca()+"\nKilometraje: "+
                    vehiculo.getKilometraje()+"\nTipo de vehiculo: "+vehiculo));
            totalKm += vehiculo.getKilometraje();
        }

        System.out.println("\n------------ Disponibile ------------");
        System.out.println("\nEspacio disponible: "+ garage.plazasDisponibles());
        System.out.println("\n------------ Promedio KM ------------");
        int promedioKm = totalKm/ garage.getCantidadVehiculos();
        System.out.println("\nPromedio kilometraje: "+promedioKm+"Km");
        System.out.println("\n---------- Cambio de ruedas ---------");
        System.out.println("\nCosto cambio de ruedas: $"+ garage.calcularCosto());
        System.out.println("\n-------------------------------------");
    }
}
