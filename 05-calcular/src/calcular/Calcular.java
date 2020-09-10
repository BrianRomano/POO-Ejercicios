package calcular;

public class Calcular {
    public double mostrarCalculo(){
        int acumulador = 0;
        int contador = 1;
        while(contador != 11){
            acumulador += contador;
            contador++;
        }
        return acumulador;
    }
}
