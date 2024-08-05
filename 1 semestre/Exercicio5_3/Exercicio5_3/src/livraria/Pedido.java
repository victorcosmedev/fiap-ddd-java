package livraria;

import java.util.ArrayList;

public class Pedido {
	
	double valorTotal;
	ArrayList<ItemPedido> itensPedido;
	
	Pedido(ArrayList<ItemPedido> itens){
		valorTotal = 0;
		this.itensPedido = itens;
	}
	
	double valor() {
//		ItemPedido item1 = itensPedido.get(0);
//		ItemPedido item2 = itensPedido.get(1);
//		
//		valorTotal = item1.valor() + item2.valor();
		
		// Cada elemento do itensPedido é um itemPedido
		// umItem é uma variável que só existe dentro do for loop
		// for (TipoDaVariavel variavel: arrayASerIterado)
		for(ItemPedido umItem: itensPedido) {
			double valorDoItem = umItem.valor();
			valorTotal += valorDoItem;
		}
		
//		for(int i = 0; i < itensPedido.size(); i++) {
//			ItemPedido umItem = itensPedido.get(i);
//			valorTotal += umItem.valor();
//		}
		
		return valorTotal;
	}
}
