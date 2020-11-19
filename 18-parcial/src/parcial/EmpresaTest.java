package parcial;

import java.util.Date;

public class EmpresaTest {
    public static void main(String[] args) {
        Direccion direccion = new Direccion("Buenos Aires", "Caseros", 1000);
        Empresa empresa = new Empresa("Mercado Libre", 1234567890, direccion);
        System.out.println(empresa);

        //Datos Empleado Uno
        System.out.println("*** Empleados ***");
        Datos datosUno = new Datos();
        datosUno.setNombre("Brian");
        datosUno.setApellido("Romano");
        datosUno.setEdad(22);
        Direccion direccionUno = new Direccion("Buenos Aires", "25 de mayo", 600);
        datosUno.setDireccion(direccionUno);
        Empleado empleadoUno = new Empleado();
        empleadoUno.setDatos(datosUno);
        empleadoUno.setSueldo(100000);
        Categoria categoriaUno = new Categoria();
        categoriaUno.setCategoria("Junior");
        empleadoUno.setCategoria(categoriaUno);

        //Datos empleados
        Datos datosDos = new Datos();
        datosDos.setNombre("Lionel");
        datosDos.setApellido("Messi");
        datosDos.setEdad(31);
        Direccion direccionDos = new Direccion("Barcelona", "Villa", 1500);
        datosDos.setDireccion(direccionDos);
        Empleado empleadoDos = new Empleado();
        empleadoDos.setDatos(datosDos);
        empleadoDos.setSueldo(1000000);
        Categoria categoriaDos = new Categoria();
        categoriaDos.setCategoria("Senior");
        empleadoDos.setCategoria(categoriaDos);

        System.out.println(empleadoUno+"\n");
        System.out.println(empleadoDos);
        System.out.println("--------------------------------");

        //Datos Clientes
        System.out.println("*** Clientes ***");
        Datos datosTres = new Datos();
        datosTres.setNombre("Carlos");
        datosTres.setApellido("Tevez");
        datosTres.setEdad(35);
        Direccion direccionTres = new Direccion("Buenos Aires", "Apache", 100);
        datosTres.setDireccion(direccionTres);
        Cliente clienteUno = new Cliente();
        clienteUno.setDatos(datosTres);
        clienteUno.setTelefono(1123456789);

        Datos datosCuatro = new Datos();
        datosCuatro.setNombre("Fernando");
        datosCuatro.setApellido("Gago");
        datosCuatro.setEdad(34);
        Direccion direccionCuatro = new Direccion("Buenos Aires", "Liniers", 800);
        datosCuatro.setDireccion(direccionCuatro);
        Cliente clienteDos = new Cliente();
        clienteDos.setDatos(datosCuatro);
        clienteDos.setTelefono(1132654987);

        System.out.println(clienteUno+"\n");
        System.out.println(clienteDos);
        System.out.println("--------------------------------");
    }
}
