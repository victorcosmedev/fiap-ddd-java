package aula;

public class ContaCorrente {
	double saldo;
	
	public ContaCorrente(double saldo){
		this.saldo = saldo;
	}
	
	void saque(double saque){
		// se saque for maior que o saldo, não realizar saque
		if(saque > saldo) {
			System.out.println("Não é possível realizar o saque.");
		} 
		// Caso contrário, realize o saque.
		else { 
			saldo -= saque;
		}
		
	}
	
	void deposito(double deposito) {
		
		// se depósito for menor ou igual a zero
		if(deposito <= 0) {
			System.out.println("Não é possível realizar o depósito");
		}
		// caso contrário, realize o depósito
		else {
			saldo += deposito;
		}
		
		// se depósito for menor que zero
//		if(deposito < 0) {
//			System.out.println("Não é possível realizar o depósito");
//		}
//		// se depósito for igual a zero
//		else if(deposito == 0) {
//			System.out.println("Não é possível realizar o depósito");
//		}
//		// caso contrário, realize o depósito
//		else {
//			saldo += deposito;
//		}
	}
	
	double saldo() {
		return saldo;
	}
}
