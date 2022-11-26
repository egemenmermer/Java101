import java.util.Scanner;

public class CiftSayilariBulma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bir sayi giriniz: ");
        int toplam = 0,counter = 0,sayi, avg = 0;


        sayi = sc.nextInt();

        for (int i = 0 ; i <= sayi ; i++){
            if (i % 3 == 0 && i % 4 == 0){
                toplam += i;
                counter++;
            }
        }
         avg = toplam / (counter - 1);
         System.out.println(avg);
    }
}
