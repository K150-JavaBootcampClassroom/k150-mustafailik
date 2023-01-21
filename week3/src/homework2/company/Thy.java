package homework2.company;

import homework2.flight.Flight;
import homework2.priceType.PriceService;

public class Thy extends Flight implements PriceService {
    @Override
    public void abroadCatering() {
        System.out.println(" Çay ve kahve Servisimiz Bulunmaktadır !");
    }

    @Override
    public void domesticCatering() {
        System.out.println(" Çay ve kahve Servisimiz Bulunmaktadır !");
    }


    public void domesticTreats() {
        System.out.println(" Yemek Servisimiz Bulunur ! ");
    }

    @Override
    public int ticketPrice(boolean business) {
        setBusiness(business);

        if (isBusiness()) {

            setBusinessPrice(1200);
            int businessPrice = getBusinessPrice();
            return businessPrice;

        } else {
            setEconomicPrice(600);
            return getEconomicPrice();
        }
    }
}
