package tarefa06;

import java.util.Scanner;

public class Exercicio09 {

	/*
	 * 9. Elaborar um programa que efetue a leitura de um número inteiro e
	 * apresentar uma mensagem informando se o número é par ou ímpar.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um número inteiro: ");
		int nu = sc.nextInt();

		if (nu % 2 == 0) {

			System.out.println("O número " + nu + "é par.");

		} else {

			System.out.println("O número " + nu + "é impar.");

		}

		sc.close();
	}

}
