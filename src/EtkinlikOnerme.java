import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hava kac derece?");
        int derece = sc.nextInt();

        if (derece < 5){
            System.out.println("Kayak yapmaya ne dersiniz?");
        } else if (derece < 15 && derece > 5) {
            System.out.println("Tam sinemaya gitmelik hava!");
        } else if (derece < 25 && derece > 15) {
            System.out.println("Tam piknik havasi!");
        }else {
            System.out.println("Yuzmeye ne dersiniz?");
        }
    }
}
