package secao8_IntroducaoPoo.exercicios.ex4;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		System.out.println("\n-- Entre com os dados do Empregado: ");

		System.out.print("- Nome: ");
		String nome = leitor.nextLine().toUpperCase();

		System.out.print("- Salário bruto: R$ ");
		double salarioBruto = leitor.nextDouble();

		System.out.print("- Imposto: R$ ");
		double imposto = leitor.nextDouble();

		Empregado empregado = new Empregado(nome, salarioBruto, imposto);

		double salarioLiquido = empregado.calcularSalarioLiquido();
		System.out.printf("\n--> Empregado: %s, R$ %.2f%n", empregado.getNome(), salarioLiquido);

		System.out.print("- Entrar com a porcentagem a aumentar no salário: ");
		double percentual = leitor.nextDouble();

		empregado.aumentarSalario(percentual);
		System.out.printf("\n--> Dados atualizados: %s, R$ %.2f%n", empregado.getNome(), empregado.getSalarioBruto());

		leitor.close();
	}

}
