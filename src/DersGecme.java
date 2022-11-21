import java.util.Scanner;

public class DersGecme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Matematik notunuz: ");
        int mat = sc.nextInt();

        System.out.println("Fizik notunuz: ");
        int fiz = sc.nextInt();

        System.out.println("Turkce notunuz: ");
        int turk = sc.nextInt();

        System.out.println("Kimya notunuz: ");
        int kimya = sc.nextInt();

        System.out.println("Muzik notunuz: ");
        int muzik = sc.nextInt();

        double avg = (mat + fiz + turk + kimya + muzik) / 5;
            if ((mat >=0) && (mat <= 100) && (fiz >= 0) && (fiz <= 100)&& (turk >= 0) && (turk <= 100)&& (kimya >=0) && (kimya<=100)&& (muzik >=0) && (muzik <=100)) {
                if (avg >= 55){
                    System.out.println("Sinifi gectiniz!");
                }else {
                    System.out.println("Sinifta kaldiniz!!!");
                }
                System.out.println("Ortalamaniz " + avg);
            }else {
                System.out.println("Girilen notlar 0 ile 100 arasında olmalı!\nProgramı başlatıp yeniden not girişi yapınız.");
            }
        }

}
