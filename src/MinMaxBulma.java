
import java.util.Scanner;

public class MinMaxBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0, i = 1, temp,min = 0, max = 0;

        System.out.println("Kac sayi gireceksiniz: ");
        counter = input.nextInt();

        while (i <= counter){
            System.out.println(i + ". Sayıyı giriniz: ");
            temp = input.nextInt();
            if(temp > 0){
                if (temp > max){
                    max = temp;
                }else if (temp < max && max > min){
                    min = temp;
                }i++;
            }

        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En kucuk sayı: " + min);
    }
}
