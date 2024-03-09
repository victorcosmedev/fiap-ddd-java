package exercicio;


public class Banco {
	public static void main(String[] args) {
		ContaCorrente umaConta = new ContaCorrente(1000);
		ContaCorrente outraConta = new ContaCorrente(2000);
		
		umaConta.saque(100);
		outraConta.deposito(200);
		
		System.out.println("Saldo de umaConta: " +
		umaConta.saldo());
		System.out.println("Saldo de outraConta: " +
		outraConta.saldo());
		
		umaConta.render();
		System.out.println("\numaConta após rendimentos: " + umaConta.saldo());
		outraConta.render();
		System.out.println("outraConta após rendimentos: " + outraConta.saldo());
	}
}
