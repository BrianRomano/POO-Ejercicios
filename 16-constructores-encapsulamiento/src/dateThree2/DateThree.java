package dateThree2;

public class DateThree {
    private int day;
    private int month;
    private int year;

    public void setDate(int day, int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                this.month = month;
                if (day >= 1 && day <= 31) {
                    this.day = day;
                } else {
                    System.out.println("Dia no valido");
                    this.day = 0;
                }
                break;
            case 2:
                this.month = month;
                if (day >= 1 && day < 29) {
                    this.day = day;
                } else if(day == 29){
                    if((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0)){
                        this.day = day;
                    } else {
                        System.out.println("Dia no valido");
                        this.day = 0;
                    }
                } else {
                    System.out.println("Dia no valido");
                    this.day = 0;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                this.month = month;
                if (day >= 1 && day <= 30) {
                    this.day = day;
                } else {
                    System.out.println("Dia no valido");
                    this.day = day;
                }
                break;
            default:
                System.out.println("Mes no valido");
                this.month = 0;
                break;
        }
        if (year >= 1) {
            this.year = year;
        } else {
            System.out.println("Año no valido");
            this.year = 0;
        }
    }

    public void displayDate(){
        if((day == 0 ) || (month == 0) || (year == 0)){
            System.out.println("Fecha no valida");
        } else {
            System.out.println("La fecha es: "+day+"-"+month+"-"+year);
        }
    }
}
