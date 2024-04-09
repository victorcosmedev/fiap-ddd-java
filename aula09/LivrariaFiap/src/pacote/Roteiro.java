package pacote;

public class Roteiro {
	private String disciplina;
	private String nomeAula;
	private String conteudo;
	
	public Roteiro(String disciplina, String nomeAula, String conteudo) {

		this.disciplina = disciplina;
		this.nomeAula = nomeAula;
		this.conteudo = conteudo;
	}



	void exibirRoteiro() {
		System.out.println("- Disciplina: " + this.disciplina + ". Aula: " + this.nomeAula + ". Conteúdo: " + this.conteudo);	}
	}
