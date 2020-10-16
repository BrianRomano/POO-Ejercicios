package sobrecarga;

public class Shirt {
    public int idShirt;
    public String descripcion;
    public char codigoColor;
    public double precio;
    public int cantidadStock;

    public void mostrar(){
        System.out.println("ID: "+idShirt);
        System.out.println("\nDescripcion: "+descripcion);
        System.out.println("\nCodigo color: "+codigoColor);
        System.out.println("\nPrecio: $"+precio);
        System.out.println("\nCantidad en stock: "+cantidadStock);
    }
}
