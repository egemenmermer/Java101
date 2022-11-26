import java.util.Scanner;

public class BasamaklariToplama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,toplam = 0;

        System.out.println("Bir sayi giriniz: ");
        n = sc.nextInt();

        while (n != 0){
            toplam += n % 10;
            n /= 10;
        }
        System.out.println("Toplam: " + toplam);
    }
}
