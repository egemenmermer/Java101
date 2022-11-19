import java.util.Scanner;

public class DaireAlanVeCevre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;

        System.out.println("Yari capi giriniz: ");
        int r = input.nextInt();
        System.out.println("Dairenin merkez açısının ölçüsü nedir: ");
        int derece = input.nextInt();

        double alan = (pi * r * r * derece) / 360;

        if (derece == 360){
            double cevre = 2 * pi * r;
            System.out.println("Cevre : " + cevre);
            System.out.println("Alan : " + alan);
        }else {
            System.out.println("Alan : " + alan);
        }

    }
}
