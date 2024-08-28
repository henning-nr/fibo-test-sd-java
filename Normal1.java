import java.util.Scanner;

public class Fibonacci {
		public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);

				while (true) {
						System.out.print("Digite o número de termos da sequência Fibonacci (ou 'x' para sair): ");
						String input = scanner.next();

						if (input.equalsIgnoreCase("x")) {
								System.out.println("Encerrando a execução.");
								break;
						}

						try {
								int n = Integer.parseInt(input);
								System.out.println("Sequência Fibonacci:");
								for (int i = 0; i < n; i++) {
										System.out.print(nonOptimizedFibonacci(i) + " ");
								}
								System.out.println();
						} catch (NumberFormatException e) {
								System.out.println("Por favor, insira um número válido ou 'x' para sair.");
						}
				}
		}

		static int nonOptimizedFibonacci(int n) {
				if (n <= 1) {
						return n;
				} else {
						return nonOptimizedFibonacci(n - 1) + nonOptimizedFibonacci(n - 2);
				}
		}
}
