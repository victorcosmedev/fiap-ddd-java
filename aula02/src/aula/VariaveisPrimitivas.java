package aula;

public class VariaveisPrimitivas {
	public static void main(String[] args) {
		
		int idade = 43;
		double salario = 4532.50;
		char sexo = 'M';
		boolean casado = true;
		String nome = "Antonio das Dores";
		
		int umaVariavel = 45 * 3;
		int outraVariavel = 65;
		int maisOutraVariavel = umaVariavel +
		outraVariavel;
		
		double porcentagemDeAumento = 10;
		double salarioReajustado = salario + (salario / 100
		* porcentagemDeAumento);
		
		System.out.println(idade);
		System.out.println(salario);
		System.out.println(sexo);
		System.out.println(casado);
		System.out.println(nome);
		System.out.println(salarioReajustado);
		System.out.println(maisOutraVariavel);
	}
}
