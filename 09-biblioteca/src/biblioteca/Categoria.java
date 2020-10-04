package biblioteca;

public class Categoria {
    private String ubicacion;
    private String signatura;

    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public String getSignatura() {
        return signatura;
    }

    public void setSignatura(String signatura) {
        this.signatura = signatura;
    }

    public String toString() {
        return "\nUbicacion: " + ubicacion + "\nSignatura: " + signatura;
    }
}
