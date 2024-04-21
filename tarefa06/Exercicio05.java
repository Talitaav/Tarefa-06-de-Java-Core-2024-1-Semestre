package tarefa06;

import java.util.Scanner;

public class Exercicio05 {

	/*
	 * 5. Apresentar uma mensagem dizendo que o aluno foi aprovado em exame. Se o
	 * aluno não foi aprovado, indicar uma mensagem informando esta condição.
	 * Apresentar com as mensagens o valor da média do aluno, para qualquer
	 * condição.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor de A:");
		double a = sc.nextDouble();

		if (a == 0) {
			System.out.println("O valor de A deve ser diferente de zero.");
			return;
		}

		System.out.println("Digite o valor de B:");
		double b = sc.nextDouble();

		System.out.println("Digite o valor de C:");
		double c = sc.nextDouble();

		double delta = Math.pow(b, 2) - 4 * a * c;

		if (delta < 0) {
			System.out.println("A equação não possui raízes reais.");
		} else if (delta == 0) {
			double raiz = -b / (2 * a);
			System.out.println("A equação possui uma raiz real: " + raiz);
		} else {
			double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
			double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("A equação possui duas raízes reais:");
			System.out.println("Raiz 1: " + raiz1);
			System.out.println("Raiz 2: " + raiz2);
		}

		sc.close();
	}
}