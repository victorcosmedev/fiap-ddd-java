package pacote;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Pessoa> listaPessoas = new ArrayList<>();
		Pessoa pessoa1 = new Pessoa("Ana", 12);
        Pessoa pessoa2 = new Pessoa("Bruno", 18);
        Pessoa pessoa3 = new Pessoa("Carla", 30);
        Pessoa pessoa4 = new Pessoa("Diego", 15);
        Pessoa pessoa5 = new Pessoa("Fernanda", 16);
        Pessoa pessoa6 = new Pessoa("Gabriel", 35);
        Pessoa pessoa7 = new Pessoa("Helena", 28);
        Pessoa pessoa8 = new Pessoa("Igor", 19);
        Pessoa pessoa9 = new Pessoa("Juliana", 24);
        Pessoa pessoa10 = new Pessoa("Lucas", 17);
        
        listaPessoas.add(pessoa1);
        listaPessoas.add(pessoa2);
        listaPessoas.add(pessoa3);
        listaPessoas.add(pessoa4);
        listaPessoas.add(pessoa5);
        listaPessoas.add(pessoa6);
        listaPessoas.add(pessoa7);
        listaPessoas.add(pessoa8);
        listaPessoas.add(pessoa9);
        listaPessoas.add(pessoa10);
        listaPessoas.add(pessoa10);
        
        for(Pessoa pessoa : listaPessoas) {
        	System.out.println(pessoa.nomeUsuario() + " " + pessoa.ehMaiorDeIdade());
        }
	}
}