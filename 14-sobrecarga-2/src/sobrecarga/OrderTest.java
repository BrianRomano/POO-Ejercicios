package sobrecarga;

public class OrderTest {
    public static void main(String[] args) {
        Order ordenUno = new Order();

        Shirt shirtUno = new Shirt();
        Shirt shirtDos = new Shirt();
        Shirt shirtTres = new Shirt();

        double totalCosto = 0;

        shirtUno.idShirt = 1;
        shirtUno.descripcion = "Deportiva";
        shirtUno.codigoColor = 'A';
        shirtUno.precio = 14.00;
        shirtUno.cantidadStock = 100;
        totalCosto = ordenUno.addShirt(shirtUno);
        shirtUno.mostrar();
        System.out.println("\nTotal a pagar: $"+totalCosto);
        System.out.println("---------------------------");

        shirtDos.idShirt = 2;
        shirtDos.descripcion = "Futbol";
        shirtDos.codigoColor = 'B';
        shirtDos.precio = 20.00;
        shirtDos.cantidadStock = 150;
        totalCosto = ordenUno.addShirt(shirtDos);
        shirtDos.mostrar();
        System.out.println("\nTotal a pagar: $"+totalCosto);
        System.out.println("---------------------------");

        shirtTres.idShirt = 3;
        shirtTres.descripcion = "Running";
        shirtTres.codigoColor = 'C';
        shirtTres.precio = 12.00;
        shirtTres.cantidadStock = 200;
        totalCosto = ordenUno.addShirt(shirtTres);
        shirtTres.mostrar();
        System.out.println("\nTotal a pagar: $"+totalCosto);
        System.out.println("---------------------------");
    }
}
