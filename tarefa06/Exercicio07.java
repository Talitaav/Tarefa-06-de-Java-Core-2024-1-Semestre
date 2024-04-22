package tarefa06;

import java.util.Scanner;

public class Exercicio07 {

	/*
	 * 7. Efetuar a leitura de quatro números inteiros e apresentar os números que
	 * são divisíveis por 2 e 3.
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o primeiro número:");
		int num1 = sc.nextInt();

		System.out.println("Informe o segundo número:");
		int num2 = sc.nextInt();

		System.out.println("Informe o terceiro número:");
		int num3 = sc.nextInt();

		System.out.println("Informe o quarto número:");
		int num4 = sc.nextInt();

		System.out.print("Os números divisíveis por 2 e 3 é: ");

		if (num1 % 2 == 0 && num1 % 3 == 0) {
			System.out.print(num1 + " ");
		}

		if (num2 % 2 == 0 && num2 % 3 == 0) {
			System.out.print(num2 + " ");
		}

		if (num3 % 2 == 0 && num3 % 3 == 0) {
			System.out.print(num3 + " ");
		}

		if (num4 % 2 == 0 && num4 % 3 == 0) {
			System.out.print(num4 + " ");
		}

		sc.close();
	}

}
