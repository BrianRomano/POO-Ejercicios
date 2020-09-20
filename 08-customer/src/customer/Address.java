package customer;

public class Address {
    private String nombre;
    private int altura;
    private String ciudad;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    public int getAltura(){
        return altura;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }

    public String toString() {
        return "Address{" +
                "nombre='" + nombre + '\'' +
                ", altura=" + altura +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
