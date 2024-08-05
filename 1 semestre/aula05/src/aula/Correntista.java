package aula;

public class Correntista {
	String nome;
	String cpf;
	String cartaoDeCredito;
	ContaCorrente contaCorrente;
	
	Correntista(String nome, String cpf, String cartaoDeCredito, ContaCorrente contaCorrente){
		this.nome = nome;
		this.cpf = cpf;
		this.cartaoDeCredito = cartaoDeCredito;
		this.contaCorrente = contaCorrente;
	}
	
	String getCartaoDeCredito(){
		return cartaoDeCredito;
	}
}
