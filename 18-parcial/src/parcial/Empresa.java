package parcial;

public class Empresa {
    private String nombre;
    //Variable primitiva
    private int numeroCuil;
    //Variable de referencia
    private Direccion direccion;

    //Sobrecarga
    public Empresa(String nombre, int numeroCuil,  Direccion direccion){
        this.nombre = nombre;
        this.numeroCuil = numeroCuil;
        this.direccion = direccion;
    }

    public String toString() {
        return nombre+" - Cuil: "+numeroCuil+
                "\n"+direccion+"\n--------------------------------";
    }
}
