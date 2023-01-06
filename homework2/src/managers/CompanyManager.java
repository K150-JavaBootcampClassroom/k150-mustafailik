package managers;

import cars.Car;

public class CompanyManager {

    private Car car;

    public CompanyManager(Car car) {
        this.car = car;
    }
public void rent(Car car){

    System.out.println(car.getBrandName() +" isimli araç şirket tarafından kiralandı");
}
}
