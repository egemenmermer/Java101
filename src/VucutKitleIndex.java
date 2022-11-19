import java.util.Scanner;

public class VucutKitleIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        double boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz :");
        double kilo = input.nextDouble();

        double bmi = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz :" + bmi);

        if (bmi < 20){
            System.out.println("Biraz kilo alman lazim!");
        } else if (20 <= bmi && bmi < 25) {
            System.out.println("Harikasin!");
        } else if (25 <= bmi && bmi < 30) {
            System.out.println("Azcik kilo ver!");
        } else if (bmi > 30) {
            System.out.println("Obezsin kanka!");
        }
    }
}
