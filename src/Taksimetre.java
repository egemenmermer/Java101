import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tutar = 10;

        System.out.println("Kilometre Giriniz: ");
        float km = input.nextInt();

        tutar += km * 2.20;

        if (tutar < 20){
            tutar = 20;
            System.out.println("Odeyeceginiz tutar: " + tutar);
        }else {
            System.out.println("Odeyeceginiz tutar: " + tutar);
        }
    }
}
