package secao13_Enumeracoes_composicao.Composicao.Exercicio1.Entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import secao13_Enumeracoes_composicao.Composicao.Exercicio1.Entidades.Enum.NivelDoTrabalhador;

public class Trabalhador {

	private String nome;
	private NivelDoTrabalhador nivel;
	private Double SalarioBase;

	private Departamento departamento;
	private List<ContratoPorHora> contratos = new ArrayList<ContratoPorHora>();

	public Trabalhador() {
	}

	public Trabalhador(String nome, NivelDoTrabalhador nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.SalarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelDoTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelDoTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return SalarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		SalarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoPorHora> getContratos() {
		return contratos;
	}

	public void adicionarContrato(ContratoPorHora contrato) {
		contratos.add(contrato);
	}

	public void removerContrato(ContratoPorHora contrato) {
		contratos.remove(contrato);
	}
	
	public double renda(int ano, int mes) {
		double soma = SalarioBase;
		Calendar cal = Calendar.getInstance();
		
		for (ContratoPorHora contrato : contratos) {
			cal.setTime(contrato.getData());
			int contrato_ano = cal.get(Calendar.YEAR);
			int contrato_mes = 1 + cal.get(Calendar.MONTH);
			
			if (ano == contrato_ano && mes == contrato_mes) {
				soma += contrato.valorTotal();				
			}
		}
		
		return soma;
	}

}
