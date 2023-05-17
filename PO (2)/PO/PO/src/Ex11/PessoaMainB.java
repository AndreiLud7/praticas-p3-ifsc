package Ex11;


import java.util.Scanner;

public class PessoaMainB {
	
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		Pessoa[] pessoas = new Pessoa[3];
		
		for (int i = 0; i < pessoas.length; i++) {
			
			Pessoa p = new Pessoa();
			p.nome = leitura.nextLine();
			p.cpf = leitura.nextLine();
			p.nascimento = leitura.nextLine();
			pessoas[i] = p; // armazena no vetor
			
		}
		for (int i = 0; i < pessoas.length; i++) {
			System.out.println("a pesssoa " + pessoas[i].nome + " tem o cpf nº " + pessoas[i].cpf + " e nasceu no dia " + pessoas[i].nascimento);
		}		
		
		 
	}
}
        