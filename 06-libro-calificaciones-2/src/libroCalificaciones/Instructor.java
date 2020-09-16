package libroCalificaciones;

public class Instructor {
    private String nombre;
    private int nLegajo;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setNLegajo(int nLegajo){
        this.nLegajo = nLegajo;
    }
    public String toString(){
        return "Nombre: "+nombre+" - Legajo: "+nLegajo;
    }
}
