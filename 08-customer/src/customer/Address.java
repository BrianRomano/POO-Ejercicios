package customer;

public class Address { //Tipo de dato 'No primitivo'
    private String nombre; //Tipo de dato 'No primitivo'
    private int altura; //Tipo de dato 'Primitivo'
    private String ciudad; //Tipo de dato 'No primitivo'
    private int probando;

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

    public String toString() { //Tipo de dato 'No primitivo'
        return "Address{" +
                "nombre='" + nombre + '\'' +
                ", altura=" + altura +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
