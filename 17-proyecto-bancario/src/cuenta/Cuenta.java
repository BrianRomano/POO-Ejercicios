package cuenta;

public class Cuenta {
    private double balance;

    public Cuenta(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void depositar(double monto) {
        balance += monto;
    }

    public void retirar(double monto){
        if (monto <= balance) {
            balance -= monto;
        } else {
            System.out.println("No dispone de esa cantidad de dinero");
        }
    }
}
