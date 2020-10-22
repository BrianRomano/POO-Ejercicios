package libreria;

public class Autor {
    private String nombreAutor;
    private String apellidoAutor;
    private String fechaDeNacimiento;
    private char sexo; //Variable primitiva
    private String emailAutor;

    //Sobrecarga de constructor
    public Autor(String nombreAutor, String apellidoAutor, String fechaDeNacimiento, char sexo, String emailAutor){
        this.nombreAutor = nombreAutor;
        this.apellidoAutor = apellidoAutor;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sexo = sexo;
        this.emailAutor = emailAutor;
    }

    @Override
    public String toString() {
        return  "\n-Nombre: " + nombreAutor +
                "\n-Apellido: " + apellidoAutor +
                "\n-Nacimiento: " + fechaDeNacimiento +
                "\n-Sexo: " + sexo +
                "\n-Email: " + emailAutor;
    }
}
