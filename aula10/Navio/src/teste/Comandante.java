package teste;

public class Comandante {
	private String nomeComandante;
	private Navio navio;
	
	public Comandante(String nomeComandante, Navio navio){
		this.nomeComandante = nomeComandante;
		this.navio = navio;
	}
	
	public Navio getNavio() {
		return navio;
	}
}
