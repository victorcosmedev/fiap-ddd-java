package exercicio;

public class ContaCorrente {
	double saldo;
	
	ContaCorrente(double saldo){
		this.saldo = saldo;
	}
	
	void saque(double valor){
		saldo = saldo - valor;
	}
	
	void deposito(double valor) {
		saldo = saldo + valor;
	}
	
	double saldo() {
		return saldo;
	}
	
	void render() {
		saldo = saldo * 1.01;
	}
}
