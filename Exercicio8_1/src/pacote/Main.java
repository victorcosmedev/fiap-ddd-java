package pacote;

public class Main {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("José", 18);
		Pessoa pessoa2 = new Pessoa("Maria", 16);
		
		if (pessoa1.ehMaiorDeIdade() == true && pessoa2.ehMaiorDeIdade() == true) {
			System.out.println(pessoa1.nomeUsuario() + " é maior de idade\n");
			System.out.println(pessoa2.nomeUsuario() + " é maior de idade\n");
		}
		else if (pessoa1.ehMaiorDeIdade() == true){
			System.out.println(pessoa1.nomeUsuario() + " é maior de idade\n");
			System.out.println(pessoa2.nomeUsuario() + " é menor de idade\n");
		}
		else {
			System.out.println(pessoa1.nomeUsuario() + " é menor de idade\n");
			System.out.println(pessoa2.nomeUsuario() + " é maior de idade\n");
		}
	}
}
