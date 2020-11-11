package dateThree;

public class DateThreeTest {
    public static void main(String[] args) {
        DateThree fecha = new DateThree();

        fecha.setDay(18);
        fecha.setMonth(11);
        fecha.setYear(2020);

        System.out.println(fecha.getDay()+"-"+ fecha.getMonth()+"-"+ fecha.getYear());
    }
}
