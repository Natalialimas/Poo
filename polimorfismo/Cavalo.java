package Poo;

public  class Cavalo extends Animal 
{
  public Cavalo(String nome, int idade) 
	
	  {
		super(nome, idade);		
	  }
	  public void emitirSom()
	  {
		  System.out.println("Richar");
	  }
	  
	  public void movimento()
	  {
		  System.out.println("potoc potoc potoc");
	  }
	
}