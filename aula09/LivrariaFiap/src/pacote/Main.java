package pacote;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo, professor! Por favor, digite seu nome: ");
		String nome = sc.nextLine();
		Professor professor = new Professor(nome);
		System.out.println("Olá, professor " + professor.getNome());
		
		ArrayList<Roteiro> listaDeRoteiros = new ArrayList<>();
		
		int opcao = 0;
		do {
			System.out.println("Digite a disciplina a ser ministrada: ");
			String disciplina = sc.nextLine();
			
			System.out.println("Certo. Informe também o nome da aula: ");
			String nomeAula = sc.nextLine();
			
			System.out.println("Por último, informe o conteúdo da aula: ");
			String conteudo = sc.nextLine();
			
			Roteiro roteiro = new Roteiro(disciplina, nomeAula, conteudo);
			professor.addRoteiro(roteiro);
			
			System.out.println("Roteiro cadastrado, Prof. " + professor.getNome() + ". Deseja cadastrar mais algum roteiro?\n1 - Sim, 2 - Não");
			opcao = sc.nextInt();
			sc.nextLine();
		} 
		while(opcao == 1);
		
		System.out.println("\n");
		professor.exibirRoteiros();

		sc.close();
	}
}
