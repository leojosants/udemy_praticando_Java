package secao10_Arrays_Listas.exercicios.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		List<Funcionario> lista = new ArrayList<Funcionario>();

		System.out.print("\nEntre com um número 'N': ");
		int n = leitor.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf(" DADOS DO %dº FUNCIONÁRIO %n", (i + 1));

			System.out.print("- ID: ");
			int id = leitor.nextInt();

			while (verificarId(lista, id)) {
				System.out.print("-> ID já  existe, informe novamente: ");
				id = leitor.nextInt();
			}
			
			System.out.print("- Nome: ");
			String nome = leitor.next();
			
			System.out.print("- Salario: R$ ");
			double salario = leitor.nextDouble();
			
			lista.add(new Funcionario(id, nome, salario));
			
			System.out.println();
		}
		
		System.out.print("- Entre com o id do funcionário a receber aumento: ");
		int id = leitor.nextInt();
		
		Funcionario func = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (func == null) {
			System.out.println("--> Funcionário inexistente.");
		}
		else {
			System.out.print("- Entre com a porcentagem de aumento: ");
			double porcentagem = leitor.nextDouble();
			
			func.aumentarSalario(porcentagem);
		}
		
		System.out.println("\n-=- RELAÇÃO DE FUNCIONÁRIOS -=-");
		for (Funcionario func2 : lista) {
			System.out.println(func2);
		}

		leitor.close();

	} // fim main

	public static boolean verificarId(List<Funcionario> lista, int id) {
		Funcionario funcionario = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return funcionario != null;
	}
}