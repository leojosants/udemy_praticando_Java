package secao10.exercicios.ex1;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		double soma = 0.0;
		double media = 0.0;
		
		System.out.print("\n- Quantos produtos serão informados? ");
		int n = leitor.nextInt();
		
		Produto[] produto = new Produto[n];
		
		for (int i = 0; i < produto.length; i++) {
			System.out.printf("- Entre com os dados do # %d Produto:%n", (i + 1));
			
			System.out.print("- Nome: ");
			leitor.nextLine().toUpperCase();
			String nome = leitor.nextLine();
			
			System.out.print("- Preço: R$ ");
			double preco = leitor.nextDouble();
			
			produto[i] = new Produto(nome, preco);
			System.out.println();
		}
		
		System.out.println("-=- LISTAGEM -=-");
		for (int i = 0; i < produto.length; i++) {
			System.out.printf("Nome: %s%n", produto[i].getNome());
			System.out.printf("Preço: R$ %.2f%n%n", produto[i].getPreco());
			soma += produto[i].getPreco();
		}
		
		media = soma / produto.length;
		System.out.printf("--> Média de preço: R$ %.2f%n", media);
		
		leitor.close();
	}

}
