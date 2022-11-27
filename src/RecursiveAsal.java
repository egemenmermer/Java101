import java.util.Scanner;

public class RecursiveAsal {
    static int i = 2;

    static boolean isPrimeNumber(int a){
        if( a == 1 || a == 2 || a == 3){
            return true;
        }
        if (a % i == 0) {
            return false;
        }
        i++;
        if(i < a){
            return isPrimeNumber(a);
        }else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        int i = sc.nextInt();
        System.out.println(isPrimeNumber(i));
    }
}
