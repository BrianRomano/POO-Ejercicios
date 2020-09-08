package MiEmpresa;

public class EmpleadoTest {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        //Uso de Set
        empleado.setNombre("Brian");
        empleado.setSueldo(1000);
        empleado.setLegajo(123);
        empleado.setEmail("brianromano@gmail.com");
        //Mostrar datos captados con GET
        System.out.println("Nombre: "+empleado.getNombre()+"\nLegajo: "+empleado.getLegajo()+"\nSueldo: "+empleado.getSueldo()+"\nEmail: "+empleado.getEmail());
        //empleado.mostrarDatos();
    }
}
