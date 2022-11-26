import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,r,facto1 = 1,facto2 = 1,facto3 = 1;
        long sonuc;

        System.out.println("N Değerini Giriniz: ");
        n = sc.nextInt();
        System.out.println("R Değerini Giriniz: ");
        r = sc.nextInt();

        if(n<r){

            System.out.println("N Sayısı R Sayısından Büyük Olmalıdır. Lütfen Tekrar N Değerini Giriniz.");
            n = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            facto1 *= i;
        }
        for (int j = 1; j <= r; j++) {
            facto2 *= j;
        }
        for (int k = 1; k <= (n-r); k++){
            facto3 *= k;
        }
        sonuc = facto1 / (facto2 * facto3);
        System.out.println("Sonuc: " +  sonuc);
    }
}
