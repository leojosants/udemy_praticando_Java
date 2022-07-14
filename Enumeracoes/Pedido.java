package secao13_Enumeracoes_composicao.Enumeracoes;

import java.util.Date;

public class Pedido {

	private Integer id;
	private Date instante;
	private StatusDoPedido status;
	
	public Pedido() {}

	public Pedido(Integer id, Date instante, StatusDoPedido status) {
		this.id = id;
		this.instante = instante;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getInstante() {
		return instante;
	}

	public void setInstante(Date instante) {
		this.instante = instante;
	}

	public StatusDoPedido getStatus() {
		return status;
	}

	public void setStatus(StatusDoPedido status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "\nPedido [id=" + id + ", instante=" + instante + ", status=" + status + "]";
	}
	
	
}
