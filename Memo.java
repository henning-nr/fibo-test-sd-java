import java.util.Scanner;
import java.util.HashMap;

public class FibonacciMemoization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos da sequência de Fibonacci desejada: ");
        int n = scanner.nextInt();

        System.out.println("Sequência de Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i, new HashMap<Integer, Integer>()) + " ");
        }

        scanner.close();
    }

    public static int fibonacci(int n, HashMap<Integer, Integer> memo) {
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        } else {
            int fib = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
            memo.put(n, fib);
            return fib;
        }
    }
}