package sobrecarga;

public class EjercicioSobreCarga {
    public int sumar(int num1, int num2){
        return num1 + num2;
    }
    public double sumar(int num1, double num2){
        return num1 + num2;
    }
    public float sumar(float num1, float num2){
        return num1 + num2;
    }
    public float sumar(float num1, int num2){
        return num1 + num2;
    }
    public double sumar(double num1, int num2){
        return num1 + num2;
    }
}
