package pacote;

public class Navio {
	private String nome;
	private double velocidade;
	
	Navio(String nome, double velocidade){
		this.nome = nome;
		this.velocidade = velocidade;
	}
	
	void aumentarVelocidade(double incremento) {
		if((velocidade + incremento) < 100) {
			velocidade += incremento;
			System.out.println("\nA velocidade atual do navio é de: " + velocidade + " nós.");
		}
		else {
			System.out.println("\nNão foi possível aumentar a velocidade");
		}
	}
	
	void diminuirVelocidade(double decremento) {
		velocidade += decremento;
		System.out.println("\nA velocidade atual do navio é de: " + velocidade + " nós.");
	}
}
