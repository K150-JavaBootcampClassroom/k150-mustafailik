package homework1;

import homework1.fruit.Apple;
import homework1.fruit.Cherry;
import homework1.fruit.Pear;
import homework1.service.AddService;
import homework1.service.BuyService;

public class Main {
    public static void main(String[] args) throws Exception{
        BuyService buyService = new BuyService();
        AddService addService = new AddService();

        Apple apple = new Apple();

        Pear pear = new Pear();

        Cherry cherry= new Cherry();


        addService.addFruit(apple, 10);
        addService.addFruit(pear, 10);
        addService.addFruit(cherry, 10);

        buyService.buyFruit(apple , 7);
        buyService.buyFruit(pear , 8);
        buyService.buyFruit(cherry , 11);
    }
}