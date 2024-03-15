package livraria;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		ItemPedido item1 = new ItemPedido("item1", 10);
		ItemPedido item2 = new ItemPedido("item2", 20);
		ItemPedido item3 = new ItemPedido("item3", 30);
		
		ArrayList<ItemPedido> itens = new ArrayList<>();
		itens.add(item1);
		itens.add(item2);
		itens.add(item3);
		
		Pedido umPedido = new Pedido(itens);
		
		System.out.println("O valor do pedido é " + umPedido.valor());
	}
}
