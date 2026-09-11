import java.util.Scanner;

public class fibonacciSeries {
        static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print(fibonacciRecursive(i) + " ");
            }

        } catch (Exception e) {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
