import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int n1,n2, ebob = 0, ekok, i = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Ilk sayiyi giriniz : ");
        n1 = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz : ");
        n2 = input.nextInt();

        while (i <= n1 && i <= n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("EBOB: " + ebob);
        ekok = n1 * n2 / ebob;
        System.out.println("EKOK: " + ekok);
    }
}
