import java.util.Scanner;

public class DeseneGoreMetot {
    static int pozitif(int num,int y){

        if(num>y){
            return num;
        }else{
            System.out.print(num+ " ");
            return pozitif(num+5,y);
        }
    }
    static int negatif(int num){

        if(num<=0){
            return num;
        }else{
            System.out.print(num + " ");
            return negatif(num-5);
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Sayiyi giriniz : ");
            num = input.nextInt();

            pozitif(negatif(num),num);

            if (num == 0){
                break;
            }
            break;
        }
    }
}