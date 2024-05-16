package banco.dominio;

import java.util.ArrayList;

public class Banco {
	public void renderContas(ArrayList<ContaPadrao> contas) {
		for(ContaPadrao conta : contas) {
			if(conta instanceof ContaRentavel) {
				conta.render();
			}
		}
	}
	
	public void realizarDepositos(double valor, ArrayList<ContaPadrao> contas) {
		for(ContaPadrao conta : contas) {
			conta.depositar(valor);
		}
	}
}
