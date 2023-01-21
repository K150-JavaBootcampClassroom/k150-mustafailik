package homework2.seat;

import homework2.flight.Flight;

public class SeatControl extends Flight {
    public void seatsControl(){
        if(!super.isControl()){
            for (String seat : super.getSeats()) {
                System.out.println("Boş Koltukları Seçiniz: "+seat);
            }
        }
        else{
            System.out.println("Üzgünüz boş koltuğumuz kalmadı :( ");

        }

    }
}
