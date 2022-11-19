import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fiz, kim, turk, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunu gir: ");
        mat = input.nextInt();

        System.out.println("Fizik notunu gir: ");
        fiz = input.nextInt();

        System.out.println("Kimya notunu gir: ");
        kim = input.nextInt();

        System.out.println("Turkce notunu gir: ");
        turk = input.nextInt();

        System.out.println("Tarih notunu gir: ");
        tarih = input.nextInt();

        System.out.println("Muzik notunu gir: ");
        muzik = input.nextInt();

        int toplam = (mat+ fiz+kim+turk+tarih+muzik);
        double sonuc= toplam/6;

        if (sonuc < 50){
            System.out.println("Kaldin");
        }else{
            System.out.println("Gectin");
        }
    }
}
