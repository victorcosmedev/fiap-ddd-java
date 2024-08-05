package banco.dominio;

public class ContaPadrao {

	protected double saldo;
	
	public ContaPadrao(double saldoInicial){
		this.saldo = saldoInicial;
	}
	
	public void sacar(double saque) {
		if(saldo < saque) {
			throw new IllegalArgumentException("Valor do saque maior que o saldo atual. Saque não realizado");
		}
		else {
			saldo -= saque;
		}
	}
	
	public void depositar(double deposito) {
		if(deposito <= 0) {
			System.out.println("Não é possível realizar o depósito");
		}
		else {
			saldo += deposito;	
		}
	}
	
	public double saldo() {
		return saldo;
	}
}
