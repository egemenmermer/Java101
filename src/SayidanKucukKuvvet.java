import java.util.Scanner;

public class SayidanKucukKuvvet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Sayi Giriniz: ");
        n = sc.nextInt();
        System.out.println("4'un katlari");
        for (int i = 1; i <= n; i *= 4){
            System.out.println(i);
        }
        System.out.println("5'un katlari");
        for (int i = 1; i <= n; i *= 5){
            System.out.println(i);
        }
    }
}
