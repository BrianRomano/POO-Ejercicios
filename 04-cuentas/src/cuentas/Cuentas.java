package cuentas;

public class Cuentas {
    private double saldo;

    public void setSaldo(double saldoInicial){
        if(saldoInicial > 0.0){
            saldo = saldoInicial;
        }
    }
    public void abonar(double monto){
        saldo += monto;
    }
    public double obtenerSaldo() {
        return saldo;
    }
    public void retirar(double retirar){
        if(retirar < saldo){
            saldo -= retirar;
        } else {
            System.out.println("No es posible hacer ese retiro");
        }
    }
}
