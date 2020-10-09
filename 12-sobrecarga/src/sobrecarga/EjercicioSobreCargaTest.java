package sobrecarga;

public class EjercicioSobreCargaTest {
    public static void main(String[] args) {
        EjercicioSobreCarga objetoSuma = new EjercicioSobreCarga();

        System.out.println("B: " + objetoSuma.sumar(10, 12.5));
        System.out.println("-------------");
        System.out.println("A: " + objetoSuma.sumar(2,2));
        System.out.println("-------------");
        System.out.println("D: " + objetoSuma.sumar(10.55f,1));
        System.out.println("-------------");
        System.out.println("E: " + objetoSuma.sumar(2.2, 4));
        System.out.println("-------------");
        System.out.println("C: " + objetoSuma.sumar(3.33f, 3.33f));
    }
}
