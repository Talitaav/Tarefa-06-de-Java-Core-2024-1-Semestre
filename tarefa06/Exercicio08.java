package tarefa06;

import java.util.Scanner;

public class Exercicio08 {

	/*
	 * 8. Efetuar a leitura de cinco números inteiros e identificar o maior e o
	 * menor valores.
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o primeiro valor inteiro: ");
		int primeiro_valor = sc.nextInt();

		System.out.println("Informe o segundo valor inteiro: ");
		int segundo_valor = sc.nextInt();

		System.out.println("Informe o terceiro valor inteiro: ");
		int terceiro_valor = sc.nextInt();

		System.out.println("Informe o quanto valor inteiro: ");
		int quarto_valor = sc.nextInt();

		System.out.println("Informe o quinto valor inteiro: ");
		int quinto_valor = sc.nextInt();

		int maior = primeiro_valor;
		int menor = primeiro_valor;

		if (segundo_valor > maior) {
			maior = segundo_valor;
		} else if (segundo_valor < menor) {
			menor = segundo_valor;
		}

		if (terceiro_valor > maior) {
			maior = terceiro_valor;
		} else if (terceiro_valor < menor) {
			menor = terceiro_valor;
		}

		if (quarto_valor > maior) {
			maior = quarto_valor;
		} else if (quarto_valor < menor) {
			menor = quarto_valor;
		}

		if (quinto_valor > maior) {
			maior = quinto_valor;
		} else if (quinto_valor < menor) {
			menor = quinto_valor;
		}

		System.out.println("O maior valor é: " + maior);
		System.out.println("O menor valor é: " + menor);

		sc.close();
	}

}
