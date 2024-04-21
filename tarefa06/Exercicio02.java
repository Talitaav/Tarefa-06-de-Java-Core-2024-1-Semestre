package tarefa06;

import java.util.Scanner;

public class Exercicio02 {

	/*
	 * 2. Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o
	 * número lido como sendo um valor positivo, ou seja, o programa deverá
	 * apresentar o módulo de um número fornecido. Lembre-se de verificar se o
	 * número fornecido é menor que zero; sendo, multiplique-o por -1.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um valor interiro positivo ou negativo: ");
		int numero = sc.nextInt();

		int valor_absoluto = Math.abs(numero);

		System.out.println("O valor absoluto do número é: " + valor_absoluto);

		sc.close();
	}

}
