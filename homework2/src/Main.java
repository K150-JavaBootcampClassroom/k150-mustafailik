import cars.Car;
import cars.Hatchback;
import cars.Sedan;
import cars.Suv;
import managers.CompanyManager;
import managers.IndividualManager;

public class Main {
    private Car[] cars;

    public static void main(String[] args) {

        Suv suv = new Suv();
        suv.setYear(5);
        suv.setId(1);
        suv.setBaggageCapacity(650);
        suv.setColor("blue");
        suv.setBrandName("Audi");
        suv.setDailyPrice(200);

        Sedan sedan = new Sedan();
        sedan.setId(2);
        sedan.setBaggageCapacity(500);
        sedan.setColor("Orange");
        sedan.setBrandName("Mercedes");
        sedan.setDailyPrice(300);

        Hatchback hatchback = new Hatchback();
        hatchback.setBaggageCapacity(350);
        hatchback.setColor("Black");
        hatchback.setId(3);
        hatchback.setDailyPrice(150);
        hatchback.setBrandName("Ford");

        CompanyManager companyManager = new CompanyManager(new Suv());
        companyManager.rent(suv);

        CompanyManager companyManager1 = new CompanyManager(new Sedan());
        companyManager1.rent(sedan);

        CompanyManager companyManager2 = new CompanyManager(new Sedan());
        companyManager2.rent(hatchback);

        IndividualManager individualManager = new IndividualManager(new Hatchback());
        individualManager.rent(hatchback);


    }

}