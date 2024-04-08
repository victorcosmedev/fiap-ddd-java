package pacote;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bem vindo, professor! Por favor, digite seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Olá, professor " + nome);
		Professor professor = new Professor(nome);
		System.out.println("\nCerto. Informe também o nome da aula: ");
		sc.close();
	}
}
