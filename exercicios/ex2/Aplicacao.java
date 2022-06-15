package secao8_IntroducaoPoo.exercicios.ex2;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("\n--> Entre com os dados do Produto:");
		
		System.out.print("- Nome: ");
		String nome = leitor.next().toUpperCase();
		
		System.out.print("- Preço: R$ ");
		double preco = leitor.nextDouble();
		
		System.out.print("- Quantidade no estoque: ");
		int quantidade = leitor.nextInt();
		
		Produto produto = new Produto(nome, preco, quantidade);
		produto.mostrarDados();
		
		System.out.print("- Adicionar quantos produtos em estoque: ");
		int quantidadeAdicionar = leitor.nextInt();
		
		produto.adicionarProduto(quantidadeAdicionar);
		produto.mostrarDados();
		
		System.out.print("- Remover quantos produtos em estoque: ");
		int quantidadeRemover = leitor.nextInt();
		
		produto.removerProduto(quantidadeRemover);
		produto.mostrarDados();
		
		leitor.close();
		
	}//
	
}
