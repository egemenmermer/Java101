import java.util.Scanner;

public class ArtıkYıl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;

        System.out.println("Yıl Giriniz : ");
        year = sc.nextInt();

        if ((year % 100 == 0)) {
            if (year % 400 == 0) {
                System.out.print(year + " bir artık yıldır");
            } else {
                System.out.print(year + " bir artık yıl değildir");
            }
        } else if (year % 4 == 0) {
            System.out.print(year + " bir artık yıldır");
        } else System.out.print(year + " bir artık yıl değildir");
    }
}
