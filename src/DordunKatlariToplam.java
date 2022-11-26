import java.util.Scanner;

public class DordunKatlariToplam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sayi;
        int toplam = 0;

        do {
            System.out.println("Sayi Giriniz: ");
            sayi = sc.nextInt();
            if (sayi % 4 == 0){
                toplam += sayi;
            }
        }while (sayi % 2 != 1);
        System.out.println("Toplam: " + toplam);
    }
}
