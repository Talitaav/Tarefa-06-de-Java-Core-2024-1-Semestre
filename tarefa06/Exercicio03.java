package tarefa06;

import java.util.Scanner;

public class Exercicio03 {
	/*
	 * 3. Ler quatro valores referentes a quatro notas escolares de um aluno e
	 * imprimir uma mensagem dizendo que o aluno foi aprovado, 7 se o valor da média
	 * escolar for maior ou igual a 5. Se o aluno não foi aprovado, indicar uma
	 * mensagem informando esta condição. Apresentar junto das mensagens o valor da
	 * média do aluno para qualquer condição.
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a primeira nota: ");
		double nota1 = sc.nextDouble();

		System.out.println("Informe a segunda nota: ");
		double nota2 = sc.nextDouble();

		System.out.println("Informe a terceira nota: ");
		double nota3 = sc.nextDouble();

		System.out.println("Informe a quarta nota: ");
		double nota4 = sc.nextDouble();

		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("A média do aluno é: " + media);

		if (media >= 5) {
			System.out.println("O aluno foi aprovado!");

		} else {
			System.out.println("O aluno foi reprovado.");
		}

		sc.close();

	}

}
