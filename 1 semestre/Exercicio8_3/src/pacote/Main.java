package pacote;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> numerosInteiros = new ArrayList<>();
		
		numerosInteiros.add(10);
		numerosInteiros.add(66);
		numerosInteiros.add(68);
		numerosInteiros.add(64);
		numerosInteiros.add(22);
		numerosInteiros.add(45);
		numerosInteiros.add(13);
		numerosInteiros.add(19);
		numerosInteiros.add(44);
		numerosInteiros.add(90);
		numerosInteiros.add(2);
		numerosInteiros.add(28);
		numerosInteiros.add(17);
		numerosInteiros.add(22);
		numerosInteiros.add(67);
		
		int maiorNumero = numerosInteiros.get(0);
		
		for(int numero : numerosInteiros) {
			
			if (numero < maiorNumero) {
				maiorNumero = numero;
			}
		}
		
		System.out.println("O maior número é: " + maiorNumero);
	}
}
