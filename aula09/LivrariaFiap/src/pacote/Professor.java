package pacote;

import java.util.ArrayList;

public class Professor {
	String nome;
	ArrayList<Roteiro> listaDeRoteiros;
	
	Professor(String nome) {
		this.nome = nome;
		this.listaDeRoteiros = new ArrayList<>();
	}
	
	String getNome() {
		return nome;
	}
	
	void addRoteiro(Roteiro roteiro) {
		listaDeRoteiros.add(roteiro);
	}
	
	void exibirRoteiros() {
		System.out.println("Os roteiros cadastrados foram: ");
		for(Roteiro roteiro : listaDeRoteiros) {
			roteiro.exibirRoteiro();
		}
	}
}
