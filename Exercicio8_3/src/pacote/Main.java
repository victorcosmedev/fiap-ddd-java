package pacote;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> inteiros = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 15; i++) {
			inteiros.add(i);
		}
		
		System.out.println(inteiros);
		
		
		for(Integer inteiro : inteiros) {
			int menorNumero = inteiro;
			
			if(inteiro < menorNumero) {
				menorNumero = inteiro;
			}
		}
		
		System.out.println(menorNumero);
	}
}
