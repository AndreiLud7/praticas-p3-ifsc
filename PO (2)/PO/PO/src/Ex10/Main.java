package Ex10;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner leitura = new Scanner(System.in);
	
	Animal N = new Animal();
	
	N.nomeCientifico = "Felis catus";	
	N.familia = "Felídeos";
	N.reino = "Animal";
	
	String[] nomePopular = new String[5];	
	nomePopular[0] = "Tom";
	nomePopular[1] = "Simba";
	nomePopular[2] = "Mingau";
	nomePopular[3] = "Pipoca";
	nomePopular[4] = "Luna";
	
	N.nomePopular = nomePopular;
	
	System.out.println("nome cientifico = " + N.nomeCientifico);
	System.out.println("Familia = " + N.familia );
	System.out.println("Reino = " + N.reino);
	
	for (int i = 0; i < 5; i++) {
		System.out.println("os nomes populares são:" + N.nomePopular[i]);
	}
	
}
}