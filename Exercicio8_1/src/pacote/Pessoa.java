package pacote;

public class Pessoa {
	String nome;
	int idade;
	
	Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	boolean ehMaiorDeIdade(){
		// se maior que 18, maior de idade é verdadeiro
		if(idade >= 18) {
			return true;
		}
		
		// por padrão, a função retorna false. A checagem é realizada acima e, se atendida, este return não é executado.
		return false;
	}
	
	String nomeUsuario() {
		return nome;
	}
}
