import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double toplam = 0;

        System.out.println("N sayisini giriniz: ");
        n = sc.nextInt();

        for (double i = 1; i <= n; i++){
            toplam += 1/i;
        }


       /* while (counter != n){
            n += 1/n;
            counter++;
            n--;
        }
        */

        System.out.println(toplam);
    }
}
