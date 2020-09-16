package MiEmpresa;

public class Empleado {
    private String nombre;
    private double sueldo;
    private int nLegajo;
    private String email;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    public double getSueldo(){
        return sueldo;
    }
    public void setLegajo(int nLegajo){
        this.nLegajo = nLegajo;
    }
    public int getLegajo(){
        return nLegajo;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre+"\nLegajo: "+nLegajo+"\nSueldo: "+sueldo+"\nEmail: "+email);
    }
}
