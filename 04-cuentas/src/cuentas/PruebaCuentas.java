package cuentas;

public class PruebaCuentas {
    public static void main(String[] args) {
        //Objetos
        Cuentas cuentaUno = new Cuentas();
        Cuentas cuentaDos = new Cuentas();

        //Cuenta 1
        cuentaUno.setSaldo(100);
        System.out.println("El saldo inicial de cuenta 1 es: "+cuentaUno.obtenerSaldo());
        cuentaUno.abonar(100);
        System.out.println("El nuevo saldo de la cuenta 1 es: "+cuentaUno.obtenerSaldo());
        cuentaUno.retirar(50);
        System.out.println("El nuevo saldo de la cuenta 1 es:"+cuentaUno.obtenerSaldo());

        System.out.println("--------------------------");

        //Cuenta 2
        cuentaDos.setSaldo(200);
        System.out.println("El saldo inicial de cuenta 2 es: "+cuentaDos.obtenerSaldo());
        cuentaDos.abonar(100);
        System.out.println("El nuevo saldo de la cuenta 2 es: "+cuentaDos.obtenerSaldo());
        cuentaDos.retirar(25);
        System.out.println("El nuevo saldo de la cuenta 2 es: "+cuentaDos.obtenerSaldo());
    }
}
