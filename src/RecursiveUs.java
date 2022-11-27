import java.util.Scanner;

public class RecursiveUs {
    static int power(int a, int b){
        if(a == 0 || b == 0)
            return 1;
        return a * power(a,b-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Taban değeri giriniz : ");
        int n1 = sc.nextInt();
        System.out.println("Üs değeri giriniz : ");
        int n2 = sc.nextInt();

        System.out.println("Sonuc: " + power(n1,n2));
    }
}
