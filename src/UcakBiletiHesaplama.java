import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km, age, flightType;

        System.out.println("Mesafeyi km türünden giriniz : ");
        km = sc.nextInt();
        System.out.println("Yaşınızı giriniz : ");
        age = sc.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        flightType = sc.nextInt();

        double price = km * 0.10;

        if(km > 0 && age > 0 && (flightType == 1 || flightType == 2)){
            if(age < 12){
                if (flightType == 1){
                    System.out.println(price / 2+ " TL");
                }else {
                    System.out.println(price - (price * 0.20)+ " TL");
                }
            } else if (age >= 12 && age < 24) {
                if (flightType == 1){
                    System.out.println(price - (price * 0.10)+ " TL");
                }else {
                    System.out.println(price - (price * 0.10) - (price * 0.20)+ " TL");
                }
            } else if (age > 65) {
                if (flightType == 1){
                    System.out.println(price - (price * 0.30)+ " TL");
                }else {
                    System.out.println(price - (price * 0.30)- (price * 0.20) + " TL");
                }
            }
        }else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
