package cuenta;

public class CuentaTest {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1500);
        cuenta.depositar(1000);
        cuenta.retirar(500);
        Cliente cliente = new Cliente("Brian", "Romano");
        cliente.setCuenta(cuenta);

        System.out.println("Nombre: "+cliente.getNombre()+"\nApellido: "+cliente.getApellido()+"\nDinero: $"+cuenta.getBalance());
    }
}
