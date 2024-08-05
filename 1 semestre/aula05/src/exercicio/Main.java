package exercicio;

import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
		ItemPedido livroUm = new ItemPedido("1984", 60.00);
		ItemPedido livroDois = new ItemPedido("Grokking Algorithms", 250.00);
		ItemPedido livroTres = new ItemPedido("Percy Jackson e o Ladrão de Raios", 100.00);
		
		ArrayList<ItemPedido> itens = new ArrayList<>();
		itens.add(item1);
		itens.add(item2);
		
		Pedido pedidoUm = new Pedido(itens);
		
		System.out.println("O valor total do pedido é de: " + pedidoUm.somaDosItens);
	}
}
