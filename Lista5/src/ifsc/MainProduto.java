package ifsc;

import java.util.ArrayList;
import java.util.Iterator;

public class MainProduto {
	
	public static void main(String[] args) {
	
		ArrayList <Produto> P = new ArrayList<>();
		
		Produto a = new Produto();
		a.setNome("Teclado");
		a.setPreco(25.75);
		a.setFornecedor("Americanas");
		a.setCodBarras(45496l);
		P.add(a);
		    
		Produto b = new Produto();
		b.setNome("Mouse");
		b.setPreco(54.55);
		b.setFornecedor("Americanas");
		b.setCodBarras(654654l);
		P.add(b);
		   
		Produto c = new Produto();
		c.setNome("Monitor");
		c.setPreco(44.65);
		c.setFornecedor("Americanas");
		c.setCodBarras(45545l);
		P.add(c);
		
		
		for (int i = 0; i < P.size(); i++) {
			
			System.out.println(P.get(i).getNome());
			System.out.println(P.get(i).getPreco());
			System.out.println(P.get(i).getFornecedor());
			System.out.println(P.get(i).getCodBarras());
			System.out.println("\n");
		
		}
		
		
		
	}
}
