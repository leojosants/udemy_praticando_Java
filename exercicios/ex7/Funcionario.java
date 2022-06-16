package secao10_Arrays_Listas.exercicios.ex3;

public class Funcionario {

	private Integer id;
	private String nome;
	private Double salario;

	public Integer getId() {
		return id;
	}

	public Funcionario(Integer id, String nome, Double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual) {
		this.salario += (this.salario / 100 * percentual);
	}

	@Override
	public String toString() {
		return String.format("Id: %d, Nome: %s, Salário: R$ %.2f", id, nome, salario);
	}

}
