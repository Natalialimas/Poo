package Poo;

public class Produtomain {
	
	public static void main (String args[]) 
	{
		
		Produtos pr1 = new Produtos ("Iphone", 2009, "branco");
		Produtos pr2 = new Produtos ("Samsung", 2020, "azul");
		System.out.println("Modelo: " + pr1.modeloProduto);
		System.out.println("Ano: " + pr1.anoProduto);
		System.out.println("Cor: " + pr1.corProduto);
		System.out.println("----------------------------");
		System.out.println("Modelo: " + pr2.modeloProduto);
		System.out.println("Ano: " + pr2.anoProduto);
		System.out.println("Cor: " + pr2.corProduto);
		
		

	}

}

