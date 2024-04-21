package tarefa06;

import java.util.Scanner;

public class Exercicio04 {

	/*
	 * 4. Ler quatro valores referentes a quatro notas escolares de um aluno e
	 * imprimir uma mensagem dizendo que o aluno foi aprovado, se o valor da média
	 * escolar for maior ou igual a 7. Se o valor da média for menor que 7,
	 * solicitar a nota de exame, somar com o valor da média e obter nova média. Se
	 * a nova média for maior ou igual a 5, apresentar uma mensagem dizendo que o
	 * aluno foi aprovado em exame. Se o aluno não foi aprovado, indicar uma
	 * mensagem informando esta condição. Apresentar com as mensagens o valor da
	 * média do aluno, para qualquer condição.
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

		System.out.println("Média: " + media);

		if (media >= 7) {
			System.out.println("O aluno foi aprovado!");

		} else {
			System.out.println("Informe a nota do exame: ");
			double exame = sc.nextDouble();

			double novam = (media + exame) / 2;

			System.out.println("A nova média é: " + novam);

			if (novam > -5) {
				System.out.println("O aluno foi aprovado em exame! ");

			} else {
				System.out.println("O aluno foi reprovado.");

			}

		}

	}

}
