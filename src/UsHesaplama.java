import java.util.Scanner;

public class UsHesaplama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ,r,toplam = 1;

        System.out.println("Ussu alinacak sayiyi giriniz: ");
        n = sc.nextInt();
        System.out.println("Us olacak sayiyi giriniz: ");
        r = sc.nextInt();

        for (int i = 1; i <= r; i++){
         toplam *= n;
        }
        System.out.println("Sonuc: " + toplam);
    }
}
