package homework2.company;

import homework2.flight.Flight;
import homework2.priceType.PriceService;

public class Pegasus extends Flight implements PriceService {
    @Override
    public void abroadCatering() {
        System.out.println(" Herhangi bir Servisimiz Bulunmamaktadır !");
    }


    @Override
    public void domesticCatering() {

    }

    @Override
    public int ticketPrice(boolean business) {
        setBusiness(business);

        if (isBusiness()) {

            setBusinessPrice(1000);
            int businessPrice = getBusinessPrice();
            return businessPrice;

        } else {
            setEconomicPrice(500);
            return getEconomicPrice();
        }
    }
}
