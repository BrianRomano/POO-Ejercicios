package MiEmpresa;

public class EmpleadoTest {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        Empleado otroEmpleado = new Empleado();
        //Uso de Set - Empleado
        empleado.setNombre("Brian");
        empleado.setSueldo(1000);
        empleado.setLegajo(123);
        empleado.setEmail("brianromano@gmail.com");
        //Uso de Set - otroEmpleado
        otroEmpleado.setNombre("Romano");
        otroEmpleado.setSueldo(10000);
        otroEmpleado.setLegajo(456);
        otroEmpleado.setEmail("brianromano@outlook.com");
        //Mostrar datos captados con GET
        System.out.println("Nombre: "+empleado.getNombre()+"\nLegajo: "+empleado.getLegajo()+"\nSueldo: "+empleado.getSueldo()+"\nEmail: "+empleado.getEmail());
        //Mostrar datos
        otroEmpleado.mostrarDatos();
    }
}
