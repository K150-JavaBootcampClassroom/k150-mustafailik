package homework2;

import java.util.Random;

public class Homework2 {

    public static void main(String[] args) {
        Random random = new Random();
        int sayac =0;
        int sayi=0;
        while (sayi<50 || sayi>100){
            System.out.println(sayi);
            sayac++;
            sayi = random.nextInt(0,500);
        }
        System.out.println(sayac + ". denemede bulundu: " + sayi);
}
  }