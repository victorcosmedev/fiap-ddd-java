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
	
	String getDisciplina() {
		return disciplina;
	}
	
	String getNomeAula() {
		return nomeAula;
	}
	
	String getConteudo() {
		return conteudo;
	}
	
	void exibirRoteiro() {
		System.out.println("- Disciplina: " + this.getDisciplina() + ". Aula: " + this.getNomeAula() + ". Conteúdo: " + this.getConteudo());	}
	}
