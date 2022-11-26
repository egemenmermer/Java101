import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = sc.nextInt();

        for (int i = n; i >= 0; i--){
            for (int j = 0; j < (n - i + 1 ); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= (2 * i -2); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
