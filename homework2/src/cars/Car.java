package cars;

public abstract class Car {
    private int id;
    private String brandName;
    private String color;
    private int baggageCapacity;
    private int dailyPrice;


    public Car(int id, String brandName, String color, int baggageCapacity, int dailyPrice) {
        this.id = id;
        this.brandName = brandName;
        this.color = color;
        this.baggageCapacity = baggageCapacity;
        this.dailyPrice = dailyPrice;

    }

    public Car(){

    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBaggageCapacity() {
        return baggageCapacity;
    }

    public void setBaggageCapacity(int baggageCapacity) {
        this.baggageCapacity = baggageCapacity;
    }

    public int getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(int dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

}
