package tarefa06;

import java.util.Scanner;

public class Exercicio06 {

	/*
	 * 6. Efetuar a leitura de três valores (variáveis A, B e C) e apresentá-los
	 * dispostos em ordem crescente.
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor de A: ");
		int a = sc.nextInt();

		System.out.println("Informe o valor de b: ");
		int b = sc.nextInt();

		System.out.println("Informe o valor de C: ");
		int c = sc.nextInt();

		if (a > c) {
			int oc = a;
			a = b;
			b = oc;
		}

		if (b > c) {
			int oc = b;
			b = c;
			c = oc;
		}

		if (a > b) {
			int oc = a;
			a = b;
			b = oc;
		}

		System.out.println("Os valores em ordem crescente são:" + a + ", " + b + ", " + c);

		sc.close();

	}

}
