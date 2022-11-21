import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ilk sayiyi giriniz: ");
        int n1 = sc.nextInt();

        System.out.println("Ikinci sayiyi giriniz: ");
        int n2 = sc.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.println("Seciminiz: ");
        int selection = sc.nextInt();

        switch (selection){
            case 1:
                System.out.println("Sonuc: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Sonuc: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Sonuc: " + (n1 * n2));
                break;
            case 4:
                if(n2 != 0){
                    System.out.println("Sonuc: " + (n1 / n2));
                    break;
                }else {
                    System.out.println("Bir sayi sifira bolunemez!");
                }
                break;
            default:
                System.out.println("Hatali secim yaptiniz!!!");
        }
    }
}
