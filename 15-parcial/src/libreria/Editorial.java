package libreria;

public class Editorial {
    private String nombreEditorial;
    private int telefonoEditorial; //Variable primitiva
    private Direccion direccion; //Variable de referencia
    private String emailEditorial;
    private int cuit; //Variable primitiva

    //Sobrecarga de constructor
    public Editorial(String nombreEditorial, int telefonoEditorial, Direccion direccion, String emailEditorial, int cuit){
        this.nombreEditorial = nombreEditorial;
        this.telefonoEditorial = telefonoEditorial;
        this.direccion = direccion;
        this.emailEditorial = emailEditorial;
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return  "\n-Nombre: " + nombreEditorial +
                "\n-Telefono: " + telefonoEditorial +
                "\n-Email: " + emailEditorial +
                "\n-CUIT: " + cuit +
                "\nDireccion: " + direccion;
    }
}
