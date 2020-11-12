package rectangulo;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectanguloUno = new Rectangle();
        rectanguloUno.getArea();
        rectanguloUno.draw();

        System.out.println("-----------------------------------------");

        Rectangle rectanguloDos = new Rectangle(15, 5);
        rectanguloDos.getArea();
        rectanguloDos.draw();
    }
}
