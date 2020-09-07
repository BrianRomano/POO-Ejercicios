package MiEmpresa;

public class Empleado {
    private String nombre;
    private double sueldo;
    private int nLegajo;
    private String email;

    public void setNombre(String nombreE1){
        nombre = nombreE1;
    }
    public void setSueldo(double sueldoE1){
        sueldo = sueldoE1;
    }
    public void setLegajo(int legajoE1){
        nLegajo = legajoE1;
    }
    public void setEmail(String emailE1){
        email = emailE1;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre+"\nLegajo: "+nLegajo+"\nSueldo: "+sueldo+"\nEmail: "+email);
    }
}
