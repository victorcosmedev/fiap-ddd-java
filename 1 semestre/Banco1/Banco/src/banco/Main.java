package banco;

import java.util.ArrayList;

import banco.dominio.Banco;
import banco.dominio.ContaCorrente;
import banco.dominio.ContaDeEstudante;
import banco.dominio.ContaPadrao;


public class Main {

	public static void main(String[] args) {
		
		ContaCorrente contaDoTonyStark = new ContaCorrente(100000);
		ContaDeEstudante contaDoVictor = new ContaDeEstudante(100);
		
		ArrayList<ContaPadrao> contas = new ArrayList<>();
		contas.add(contaDoTonyStark);
		contas.add(contaDoVictor);
		
		Banco nubank = new Banco();
		nubank.realizarDepositos(100, contas);
		
		
		nubank.renderContas(contas);
		
		for(ContaPadrao conta : contas) {
			System.out.println(conta.saldo());
		}
		
		
		
		
		try {
			contaDoTonyStark.sacar(999999);	
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Saldo da conta do Homem de Ferro: R$" + contaDoTonyStark.saldo());
	}
}