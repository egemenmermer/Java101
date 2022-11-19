import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        double tutar;
        double kdvliFiyat;
        double kdv;

        Scanner input = new Scanner(System.in);

        System.out.println("Tutar Giriniz: ");
        tutar = input.nextDouble();

        kdvliFiyat = tutar + (tutar * 0.18);
        kdv = tutar * 0.18;

        System.out.println("KDV tutari: " + kdv);
        System.out.println("KDVli Fiyat: " + kdvliFiyat);
    }
}
