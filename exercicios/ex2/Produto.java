package secao8_IntroducaoPoo.exercicios.ex2;

public class Produto {

	private String nome;
	private double preco;
	private int quantidadeEstoque;

	public Produto(String nome, double preco, int quantidadeEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public void adicionarProduto(int quantidade) {
		this.quantidadeEstoque += quantidade;
	}
	
	public void removerProduto(int quantidade) {
		this.quantidadeEstoque -= quantidade;
	}
	
	public double calcularValorTotalEstoque() {
		double valoTotal = 0.0;
		valoTotal = this.preco * this.quantidadeEstoque;
		return valoTotal;
	}
	
	public void mostrarDados() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return String.format("\n---> Dados do Produto: %s, R$ %.2f, %d unidades, Total: R$ %.2f%n", nome, preco, quantidadeEstoque, calcularValorTotalEstoque());
	}

	
}
