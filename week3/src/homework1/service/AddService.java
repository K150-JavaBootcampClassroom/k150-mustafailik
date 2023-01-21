package homework1.service;

import homework1.fruit.Fruit;

public class AddService {
    public void addFruit(Fruit fruit , double kg){
        fruit.setStockAmount(kg);
    }
}
