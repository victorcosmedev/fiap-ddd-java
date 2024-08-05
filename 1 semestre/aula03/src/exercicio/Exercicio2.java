package exercicio;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá! Digite seu nome: ");
		String nome = sc.next();
		
		System.out.println("Qual seu salário? ");
		double salario = sc.nextDouble();
		
		sc.close();
		
		double salarioReajustado = salario * 1.1;
		System.out.println("Olá, " + nome + "! Seu novo salário será de R$" + salarioReajustado);
	}
}
