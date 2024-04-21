package tarefa06;

import java.util.Scanner;

public class Exercicio01 {

	/*
	 * 1) Ler dois valores numéricos inteiros e apresentar o resultado da diferença
	 * do maior pelo menor valor.
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o primeirol valor inteiro: ");
		int v1 = sc.nextInt();

		System.out.println("Informe o segundo valor inteiro: ");
		int v2 = sc.nextInt();

		int verifique_diferenca;

		if (v1 > v2) {
			verifique_diferenca = v1 - v2;
		} else {
			verifique_diferenca = v2 - v1;

		}

		System.out.println("A diferença entre o maior e menor valor é: " + verifique_diferenca);

		sc.close();
	}
}
