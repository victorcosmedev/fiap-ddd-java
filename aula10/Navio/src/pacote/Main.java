package pacote;

import teste.Navio;
import teste.Comandante;

public class Main {
	public static void main(String[] args) {
		Navio navioUm = new Navio("Belize", 85);
		Navio navioDois = new Navio("Titanic", 99);
		
		Comandante comandante1 = new Comandante("Cleverson", navioUm);
		Comandante comandante2 = new Comandante("Olhos", navioDois);
		
		navioUm.aumentarVelocidade(16);
		navioDois.aumentarVelocidade(1);
		
		
	}
}
