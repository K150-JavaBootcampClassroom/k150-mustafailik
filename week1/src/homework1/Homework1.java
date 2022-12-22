package homework1;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen yapmak istediğiniz işlemin kodunu giriniz(1 para çekme, 2 para yatırma, 3 bakiye öğrenme, diğer kodlar sistemden çkmak için kullanılabilir.):");
        int n = scanner.nextInt();
        int bakiye = 100;
        if(n == 1){
            System.out.println("Lütfen  çekmek istediğiniz tutarı giriniz:");
            int cekme = scanner.nextInt();
            bakiye = bakiye-cekme;
            if(bakiye < 0){
                System.out.println("Bakiye 0'dan küçük olamaz.");
            }
             else{ System.out.println("Para çekme işlemi tamamlandı. Yeni bakiye: " + bakiye); }
        }

        else if (n == 2){
            System.out.println("Lütfen yatırmak istediğiniz tutarı giriniz:");
            int yatirma = scanner.nextInt();
            bakiye+=yatirma;
            System.out.println("Para yatırma işlemi tamamlandı. Yeni bakiye: " +bakiye);
        }

        else if(n == 3 ){
            System.out.println("Güncel bakiyeniz: " +bakiye);
        }

        else {
            System.out.println("Sistemden çıkış yapılıyor.");
        }
    }
}