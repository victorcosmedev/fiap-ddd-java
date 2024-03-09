package exercicio;

public class Main {
	public static void main(String args[]) {
		ItemPedido livroUm = new ItemPedido("1984", 60.00);
		ItemPedido livroDois = new ItemPedido("Grokking Algorithms", 250.00);
		ItemPedido livroTres = new ItemPedido("Percy Jackson e o Ladrão de Raios", 100.00);
		
		Pedido pedidoUm = new Pedido(livroUm, livroDois, livroTres);
		
		System.out.println("O valor total do pedido é de: " + pedidoUm.somaDosItens);
	}
}
