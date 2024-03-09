package exercicio;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		sc.close();
		
		int next = numero + 1;
		int previous = numero - 1;
		System.out.println("Anterior: " + previous);
		System.out.println("Próximo: " + next);
	}
}
