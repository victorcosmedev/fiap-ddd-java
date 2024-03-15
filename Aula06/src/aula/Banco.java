package aula;

public class Banco {
	public static void main(String[] args) {
		ContaCorrente umaConta = new ContaCorrente(50.0);
//		ContaCorrente outraConta = new ContaCorrente(2000);
		
		umaConta.saque(20);
		System.out.println("Saldo de umaConta: " + umaConta.saldo());
		umaConta.saque(20);
		System.out.println("Saldo de umaConta: " + umaConta.saldo());
		umaConta.saque(10);
		System.out.println("Saldo de umaConta: " + umaConta.saldo());
		umaConta.saque(10);
		
		umaConta.deposito(0.01);
		System.out.println("Saldo de umaConta: " + umaConta.saldo());
		umaConta.deposito(0);
		umaConta.deposito(-0.01);
//		outraConta.deposito(200);
		
		
//		System.out.println("Saldo de outraConta: " +
//		outraConta.saldo());
	}
}
