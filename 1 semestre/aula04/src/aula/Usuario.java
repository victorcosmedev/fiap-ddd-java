package aula;
class Usuario {
	int idade;
	double salario;
	char sexo;
	boolean casado;
	String nome;
	
	Usuario(int idade, double salario, char sexo, boolean casado, String nome){
		this.idade = idade;
		this.salario = salario;
		this.sexo = sexo;
		this.casado = casado;
		this.nome = nome;
	}
	
	void exibir() {
		System.out.println("As informações da pessoa são:\n " +
					"Nome: " + nome
					+ ", Idade: " + idade
					+ ", Salário: " + salario
					+ ", Sexo: " + sexo
					+ ", Casado: " + casado);
	}
}
