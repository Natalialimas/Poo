package Poo;

public class Produtos 
{
	public String modeloProduto;
	public int anoProduto;
	public String corProduto;
	
	
	public Produtos (String modelo, int ano, String cor ) 
	{
		this.modeloProduto = modelo;
		this.anoProduto = ano;
		this.corProduto = cor;
		
	}
		
	public String modelo()
	{
		String modelo = "\nModelo: "+modeloProduto; 
		return modelo;
	}
	
	public String ano()
	{
		String ano = "\nAno: "+ Integer.toString(anoProduto); 
		return ano;
	}
	
	public String cor()
	{
		String cor = "\nCor: "+corProduto; 
		return cor;
	}
}

