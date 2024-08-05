package exercicio;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int a = sc.nextInt();
		
		System.out.println("Digite um segundo número: ");
		int b = sc.nextInt();
		
		System.out.println("Digite um terceiro número: ");
		int c = sc.nextInt();
		
		sc.close(); // always close the scanner
		
		double media = (a + b + c) / 3;
		int multi = a * b * c;
		
		System.out.println("====================\nO resultado da média é: " + media);
		System.out.println("O resultado da multiplicação é: " + multi);
	}
}
