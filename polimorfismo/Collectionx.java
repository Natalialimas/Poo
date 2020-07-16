package Poo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Collectionx 
{
 public static void main (String args[])
 {   //adicionar dados
	 Collection<String> estoque = new <String> ArrayList();
	 estoque.add("Tv");
	 estoque.add("Pc");
	 estoque.add("Mouse");
	 System.out.println("Item adicionados: " + estoque);
	 
	 //Remover dados
	 estoque.remove("Tv");
	 System.out.println("Itens sem TV: " + estoque);
	 
	 //Atualizar dados
	 Collection<String> estoque1 = Arrays.asList("Copo");
	 estoque.addAll(estoque1);
	 System.out.println("Itens atualizados: " + estoque);
	 
	 //Acrecentar
	 for (String itens: estoque)
	 {
		 System.out.println("Apresentar itens: " + itens);
	 }
 }
 
}
