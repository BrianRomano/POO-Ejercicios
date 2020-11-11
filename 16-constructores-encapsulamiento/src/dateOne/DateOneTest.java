package dateOne;

public class DateOneTest {
    public static void main(String[] args) {
        DateOne fecha = new DateOne();

        fecha.day = 18;
        fecha.month = 11;
        fecha.year = 2020;

        System.out.println(fecha.day+"-"+ fecha.month+"-"+ fecha.year);
    }
}
