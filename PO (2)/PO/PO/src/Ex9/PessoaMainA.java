package Ex9;

import java.util.Scanner;



public class PessoaMainA {
	
	public static void main(String[] args) {
		

			Pessoa p = new Pessoa();
			p.nome = "marcos";
			p.nascimento = "10/10/05";
			p.cpf = 7772227711l;
		
			System.out.println("nome = " + p.nome + " nascimento = " + p.nascimento + " Cpf = " + p.cpf );

	}
}
