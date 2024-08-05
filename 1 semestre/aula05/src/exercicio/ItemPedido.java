package exercicio;

public class ItemPedido {
	String nomeProduto;
	Double valorProduto;
	
	ItemPedido(String nomeProduto, double valorProduto){
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorProduto;
	}
	
	double valor() {
		return valorProduto;
	}
}
