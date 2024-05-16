package banco.dominio;

public class ContaCorrente extends ContaPadrao implements ContaRentavel{
	
	public ContaCorrente(double saldo) {
		super(saldo);
	}
	
	public void render() {
		saldo = saldo * 1.01;  
	}
}
