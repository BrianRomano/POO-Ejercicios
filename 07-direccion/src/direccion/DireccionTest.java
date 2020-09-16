package direccion;

public class DireccionTest {
    public static void main(String[] args) {
        //Objetos
        Persona objPersona = new Persona();
        Direccion objDireccion = new Direccion();

        //Set
        objPersona.setNombre("Brian");
        objPersona.setInicial("BR");
        objPersona.setApellido("Romano");
        objPersona.setID(1);
        objPersona.setDireccion(objDireccion);
        objDireccion.setDireccion("CABA");

        //Mostrar
        System.out.println(objPersona);
    }
}
