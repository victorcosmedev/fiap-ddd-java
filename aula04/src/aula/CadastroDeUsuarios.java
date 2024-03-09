package aula;

import java.util.Scanner;

public class CadastroDeUsuarios {
	public static void main(String[] args) {
		Scanner leitorDeDados = new Scanner(System.in);
		System.out.println("Informe a idade do usuário:");
		int idade = leitorDeDados.nextInt();
		
		System.out.println("Informe o salário do usuário:");
		double salario = leitorDeDados.nextDouble();
		
		System.out.println("Informe o sexo do usuário:");
		char sexo = leitorDeDados.next().charAt(0);
		
		System.out.println("O usuário é casado?");
		boolean casado = leitorDeDados.nextBoolean();
		
		System.out.println("Informe o nome do usuário:");
		String nome = leitorDeDados.next();
			
		leitorDeDados.close();
		
		Usuario usuario = new Usuario(idade, salario, sexo,
		casado, nome);
		usuario.exibir();
	}
}
