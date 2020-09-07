package MiEmpresa;

public class EmpleadoTest {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.setNombre("Brian");
        empleado.setSueldo(1000);
        empleado.setLegajo(123);
        empleado.setEmail("brianromano@gmail.com");
        empleado.mostrarDatos();
    }
}
