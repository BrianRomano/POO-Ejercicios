package sobrecarga;

public class Order {
    public double totalPagar;

    public double addShirt(Shirt shirt){
        totalPagar += shirt.precio;
        return totalPagar;
    }
}
