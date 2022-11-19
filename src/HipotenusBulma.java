import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("A Kenarini Giriniz: ");
        int a = input.nextInt();

        System.out.println("B Kenarini Giriniz: ");
        int b = input.nextInt();

        System.out.println("C Kenarini Giriniz: ");
        int c = input.nextInt();

        int u;

        u = (a+b+c)/2;
        int cevre = 2 * u;
        int alanKare = (u * (u-a) * (u-b) * (u-c));

        System.out.println("Cevresi: " + cevre);
        System.out.println("Alani: " + Math.sqrt(alanKare));
    }
}
