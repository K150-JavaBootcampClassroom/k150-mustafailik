package homework2;

import homework2.company.Pegasus;
import homework2.company.Thy;
import homework2.flight.Flight;
import homework2.seat.SeatControl;
import homework2.seat.SeatService;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight();
        Pegasus pegasus = new Pegasus();
        Thy thy = new Thy();
        SeatService seatService = new SeatService();
        SeatControl seatControl = new SeatControl();

        System.out.println(flight.getSeats());

       // System.out.println("Uçuşunuz ekonomik ve Fiyat :"+pegasus.ticketPrice(false));

         System.out.println("Uçuşunuz business ve Fiyat :"+pegasus.ticketPrice(true));

        // System.out.println("Uçuşunuz ekonomik ve Fiyat :"+thy.ticketPrice(false));
        System.out.println("Uçuşunuz ekonomik ve Fiyat :"+thy.ticketPrice(true));
    }
}
