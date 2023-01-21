package homework2.flight;
import java.util.List;
public class Flight {
    private String name;
    private boolean control;
    private boolean business;
    private int businessPrice;
    private int economicPrice;
    private List<String> seats;

    public Flight(){
        super();
    }
    public Flight(String name , boolean control , boolean businnes ,
                  int businessPrice , int economicPrice , List<String> seats){
        this.name=name;
        this.control=control;
        this.business=businnes;
        this.businessPrice=businessPrice;
        this.economicPrice=economicPrice;
        this.seats=seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isControl() {
        return control;
    }

    public void setControl(boolean control) {
        this.control = control;
    }

    public boolean isBusiness() {
        return business;
    }

    public void setBusiness(boolean business) {
        this.business = business;
    }

    public int getBusinessPrice() {
        return businessPrice;
    }

    public void setBusinessPrice(int businessPrice) {
        this.businessPrice = businessPrice;
    }

    public int getEconomicPrice() {
        return economicPrice;
    }

    public void setEconomicPrice(int economicPrice) {
        this.economicPrice = economicPrice;
    }

    public List<String> getSeats() {
        return seats;
    }

    public void setSeats(List<String> seats) {
        this.seats = seats;
    }
}
