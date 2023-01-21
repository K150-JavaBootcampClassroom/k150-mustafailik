package homework2.seat;

import homework2.flight.Flight;
import java.util.ArrayList;
import java.util.List;
public class SeatService extends Flight {

    public void seats() {

        List<String> seats = new ArrayList();
        seats.add("A1");
        seats.add("A2");
        seats.add("A3");
        seats.add("B1");
        seats.add("B2");
        seats.add("B3");

        setSeats(seats);
    }
}
