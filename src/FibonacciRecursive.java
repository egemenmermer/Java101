import java.util.Scanner;

public class FibonacciRecursive {

    static int Fibonacci(int n){
        int temp = 0;
        if (n == 1 || n == 2){
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(5));
    }
}
