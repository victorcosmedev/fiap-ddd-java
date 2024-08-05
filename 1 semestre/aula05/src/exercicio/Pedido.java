package exercicio;

public class Pedido {
	double somaDosItens;
	
	Pedido(ItemPedido itemPedido1, ItemPedido itemPedido2, ItemPedido itemPedido3){
		this.somaDosItens = itemPedido1.valorProduto + itemPedido2.valorProduto + itemPedido3.valorProduto;
	}
	
	double valor(){
		return somaDosItens;
	}
}
