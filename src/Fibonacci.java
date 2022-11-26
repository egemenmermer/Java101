import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fibo, n = 1, n1 = 1, n2;

        System.out.println("Fibonacci: ");
        fibo = sc.nextInt();
        System.out.print("0,");

        for (int i = 1; i <= fibo; i++){
            if (i == 1 || i == 2) {
                System.out.print("1,");

            }else {
                n2 = n + n1;
                System.out.print(n2 + ",");
                n = n1;
                n1 = n2;
            }
        }
    }
}
