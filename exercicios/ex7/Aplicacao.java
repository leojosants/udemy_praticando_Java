package secao10.exercicios.ex2;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		Pensionato[] pensionato = new Pensionato[10];

		System.out.print("\n- Quantos quartos serão alugados [1 a 10]? ");
		int totalQuartos = leitor.nextInt();

		System.out.println("- Entre com os dados abaixo:\n");

		for (int i = 0; i < totalQuartos; i++) {
			System.out.printf("- Estudante # %d%n", (i + 1));

			System.out.print("- Nome: ");
			leitor.nextLine();
			String nome = leitor.nextLine().toUpperCase();

			System.out.print("- Email: ");
			String email = leitor.next();

			System.out.print("- Número do quarto: ");
			int numeroQuarto = leitor.nextInt();

			pensionato[numeroQuarto] = new Pensionato(nome, email);

			System.out.println();
		}

		System.out.println("=-= LISTAGEM =-=");
		for (int i = 0; i < pensionato.length; i++) {
			System.out.printf("%d: %s%n", i, pensionato[i]);
		}

		System.out.println("\n=-= LISTAGEM =-=");
		for (int i = 0; i < pensionato.length; i++) {
			if (pensionato[i] != null) {
				System.out.printf("%d: %s%n", i, pensionato[i]);
			}
		}

		leitor.close();
	}

}
