package secao13_Enumeracoes_composicao.Enumeracoes;

import java.util.Date;

public class App {

	public static void main(String[] args) {

		Pedido pedido = new Pedido(1080, new Date(), StatusDoPedido.AGUARDANDO_PAGAMENTO);

		System.out.println(pedido);
		
		
		// Conversão de String para enum
		StatusDoPedido sp1 = StatusDoPedido.ENTREGUE;
		StatusDoPedido sp2 = StatusDoPedido.valueOf("ENTREGUE");
		
		System.out.println(sp1);
		System.out.println(sp2);
		
		
	}

}
