import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,toplam = 0;

        System.out.println("Bir sayı giriniz: ");
        n = input.nextInt();

        for (int i = 1; i < n; i++){
            if(n % i == 0){
                toplam += i;
            }
        }
        if(toplam == n){
            System.out.println(n + " Mükemmel sayıdır!");
        }else {
            System.out.println(n + " Mükemmel sayı değildir.");
        }
    }
}
