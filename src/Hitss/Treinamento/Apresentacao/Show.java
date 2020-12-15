package Hitss.Treinamento.Apresentacao;

import java.util.Scanner;

public class Show {
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("         Hitss Treinamento");
		System.out.println("");
		try {
			System.out.println("Digite a Nota do Trabalho do Laboratório do Aluno:");
			double n1, n2, n3, m;
			Scanner teclado = new Scanner(System.in);
			n1 = teclado.nextDouble();
			System.out.println("");
			System.out.println("Digite a Nota da Avaliação semestral do Aluno:");
			n2 = teclado.nextDouble();
			System.out.println("");
			System.out.println("Digite a Nota do Exame Final do Aluno:");
			n3 = teclado.nextDouble();
			System.out.println("");
			m = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
			
			if (m >= 8.1) {
				System.out.println("A média ponderada do Aluno é A.");
			} else if (m >= 7.1 && m <= 8.0) {
				System.out.println("A média ponderada do Aluno é B.");
			} else if (m >= 6.1 && m <= 7.0) {
				System.out.println("A média ponderada do Aluno é C.");
			} else if (m >= 5.1 && m <= 6.0) {
				System.out.println("A média ponderada do Aluno é D.");
			} else {
				System.out.println("A média ponderada do Aluno é E.");
			}
			
		} catch (Exception e) {
			System.out.println("Erro de processamento: " + e.getMessage());
		}
	}
}
