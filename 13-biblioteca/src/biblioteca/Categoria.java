package biblioteca;

public class Categoria {
    private String ubicacion;
    private String signatura;

    public Categoria(String ubicacion, String signatura){
        this.ubicacion = ubicacion;
        this.signatura = signatura;
    }

    public String toString() {
        return "\nUbicacion: " + ubicacion + "\nSignatura: " + signatura;
    }
}
