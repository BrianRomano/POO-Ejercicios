package rectangulo;

public class Rectangle {
    private int width;
    private int heigth;

    public Rectangle(){
        width = 25;
        heigth = 10;
        System.out.println("Default rectangle created: width = 25 - heigth = 10");
    }
    public Rectangle(int width, int heigth){
        if(width >= 1 && width <= 29 && heigth >= 1 && heigth <= 29){
            this.width = width;
            this.heigth = heigth;
            System.out.println("Se ha creado un rectangulo con los valores asignados | width: "+width+" - heigth: "+heigth);
        } else {
            System.out.println("Medidas no validas");
        }
    }
    public void getArea(){
        int area = width * heigth;
        System.out.println("El área del rectangulo es: "+area);
    }
    public void draw(){
        for(int fila = 0; fila < heigth; fila ++){
            for (int columna = 0; columna < width; columna++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
