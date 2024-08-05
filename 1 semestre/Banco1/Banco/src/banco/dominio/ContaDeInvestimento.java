package banco.dominio;

public class ContaDeInvestimento extends ContaPadrao implements ContaRentavel{
	public ContaDeInvestimento(double saldo) {
		super(saldo);
	}
	
	public void render() {
		saldo = saldo * 1.01;  
	}
	
	public void liquidar() {
		this.sacar(saldo);
	}
}
