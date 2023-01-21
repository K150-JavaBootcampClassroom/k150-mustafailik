package homework1.fruit;

public class Fruit {
    private double kg;
    private String fruitName;

    private double stockAmount;

    public Fruit() {
    }

    public Fruit(double kg, String fruitName, double stockAmount) {
        this.kg = kg;
        this.fruitName = fruitName;
        this.stockAmount = stockAmount;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public double getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(double stockAmount) {
        this.stockAmount = stockAmount;
    }
}
