package aula;

import java.util.Scanner;

public class EntradaESaida {
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
		
		int umaVariavel = 45 * 3;
		int outraVariavel = 65;
		int maisOutraVariavel = umaVariavel + outraVariavel;
		System.out.println(maisOutraVariavel);
		
		double porcentagemDeAumento = 10;
		double salarioReajustado = salario + (salario / 100 *
		porcentagemDeAumento);
		
		System.out.println(idade);
		System.out.println(salario);
		System.out.println(sexo);
		System.out.println(casado);
		System.out.println(nome);
		System.out.println(salarioReajustado);
		
		System.out.println("As informações da pessoa são:\n " +
		"Nome: " + nome
		+ ", Idade: " + idade
		+ ", Salário: " + salario
		+ ", Sexo: " + sexo
		+ ", Casado: " + casado);
	}
}
