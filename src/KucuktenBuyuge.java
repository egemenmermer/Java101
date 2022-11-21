import java.util.Scanner;

public class KucuktenBuyuge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Birinci sayi: ");
        n1 = sc.nextInt();

        System.out.println("Ikinci sayi: ");
        n2 = sc.nextInt();

        System.out.println("Ucuncu sayi: ");
        n3 = sc.nextInt();

        if ((n1 > n2) && (n1 > n3)) {
            if (n2 > n3) {
                System.out.println("n1 > n2 > n3");
            } else {
                System.out.println("n1 > n3 > n2");
            }
        } else if ((n2 > n1) && (n2 > n3)) {
            if (n1 > n3) {
                System.out.println("n2 > n1 > n3");
            } else {
                System.out.println("n2 > n3 > n2");
            }

        } else if ((n3 > n1) && (n3 > n2)) {
            if (n1 > n2) {
                System.out.println("n3 > n1 > n2");
            } else {
                System.out.println("n3 > n2 > n1");
            }
        }
    }
}
