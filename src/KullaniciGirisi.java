import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kullanici adini giriniz: ");
        String username = sc.nextLine();

        System.out.println("Sifreyi giriniz: ");
        String password = sc.nextLine();
        
        if (username.equals("patika")  && password.equals("patika123")){
            System.out.println("Giris basarili");
        } else {
            System.out.print("Bilgileriniz hatali, yeni sifre almak isterseniz \"Evet\" yaziniz. Istemiyorsaniz \"Hayir\" yaziniz. ");
            String secenek = sc.nextLine();

            if (secenek.equals("Evet")){
                System.out.println("Sifreyi giriniz: ");
                String newPw = sc.nextLine();

                if (!newPw.equals(password)){
                    password = newPw;
                    System.out.println("Sifreniz degistirildi: " + newPw);
                }else {
                    System.out.println("Sifreniz bir onceki ile ayni olamaz!");
                }
            }else {
                System.out.println("Gorusmek dilegiyle!!!");
            }
        }
    }
}
