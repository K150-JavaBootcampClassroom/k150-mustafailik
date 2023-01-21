package homework1.service;

import homework1.fruit.Fruit;

public class BuyService {


    public void buyFruit(Fruit fruit, double kg) throws Exception{
        if(kg > fruit.getStockAmount()) {
            throw  new Exception("Bu miktarda "+fruit.getFruitName()+" bulunmuyor");
        }
        else{
            System.out.println("istediğiniz "+ fruit.getFruitName()+" " + kg+ " kg alındı.");
        }
    }

}
