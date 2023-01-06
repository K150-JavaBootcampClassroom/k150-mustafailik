package cars;

public class Suv extends Car{
    private int year;
    private int monthlyPrice;
    public Suv(int monthlyPrice, int year) {
        super();
        this.monthlyPrice = monthlyPrice;
        this.year=year;
    }
    public Suv(){

    };

    public int getMonthlyPrice() {
        return monthlyPrice=getDailyPrice() + (30*(getYear()/10)*300);
    }


    public int getYear() {
        return year;
    }

    public void setYear( int year) {
        this.year = year;
    }
}
