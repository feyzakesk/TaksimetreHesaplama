import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Taksimetre km başına 2.20 TL tutmaktadır
        //Min ödenecek tutar 20 TLdir. 20 Tl nin altındaki ücretlerde 20 TL alınacaktır.
        // Taksimetre açılış ücrei 10 tldir.
        int km ;
        double perkm = 2.20 , total, startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi km cinsinden giriniz : ");
        km = input.nextInt();

        total =  (km * perkm);
        total = total + startPrice;

        total = (total < 20) ? 20 : total;
        System.out.println("Toplam Tutar" + total);

    }
}
