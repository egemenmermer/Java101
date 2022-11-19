import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.0;
        double fiyat;

        Scanner input = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo ?");
        double armutKilo = input.nextDouble();
        System.out.println("Elma Kaç Kilo ?");
        double elmaKilo = input.nextDouble();
        System.out.println("Domates Kaç Kilo ?");
        double domatesKilo = input.nextDouble();
        System.out.println("Muz Kaç Kilo ?");
        double muzKilo = input.nextDouble();
        System.out.println("Patlıcan Kaç Kilo ?");
        double patlicanKilo = input.nextDouble();

        fiyat = armut * armutKilo + elma * elmaKilo + domates * domatesKilo + muz * muzKilo + patlican * patlicanKilo;
        System.out.println("Toplam Tutar :" + fiyat);
    }
}
