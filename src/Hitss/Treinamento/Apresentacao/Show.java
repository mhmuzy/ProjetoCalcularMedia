package Hitss.Treinamento.Apresentacao;

import java.util.Scanner;

public class Show {
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("         Hitss Treinamento");
		System.out.println("");
		try {
			System.out.println("Digite a Nota do Trabalho do Laborat�rio do Aluno:");
			double n1, n2, n3, m;
			Scanner teclado = new Scanner(System.in);
			n1 = teclado.nextDouble();
			System.out.println("");
			System.out.println("Digite a Nota da Avalia��o semestral do Aluno:");
			n2 = teclado.nextDouble();
			System.out.println("");
			System.out.println("Digite a Nota do Exame Final do Aluno:");
			n3 = teclado.nextDouble();
			System.out.println("");
			m = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
			
			if (m >= 8.1) {
				System.out.println("A m�dia ponderada do Aluno � A.");
			} else if (m >= 7.1 && m <= 8.0) {
				System.out.println("A m�dia ponderada do Aluno � B.");
			} else if (m >= 6.1 && m <= 7.0) {
				System.out.println("A m�dia ponderada do Aluno � C.");
			} else if (m >= 5.1 && m <= 6.0) {
				System.out.println("A m�dia ponderada do Aluno � D.");
			} else {
				System.out.println("A m�dia ponderada do Aluno � E.");
			}
			
		} catch (Exception e) {
			System.out.println("Erro de processamento: " + e.getMessage());
		}
	}
}
