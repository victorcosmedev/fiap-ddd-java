package livraria;

public class ItemPedido {

	String nomeProduto;
	double valor;
	
	ItemPedido(String nomeProduto, double valor) {
		this.nomeProduto = nomeProduto;
		this.valor = valor;
	}
	
	double valor() {
		return valor;
	}
}
