package Poo;

public  class Cachorro extends Animal
{
  public Cachorro (String nome, int idade)
  {
	super(nome, idade);	
  }

  public void emitirSom()
  {
	  System.out.println("Au au au ");
  }
  
  public void movimento ()
  {
	  System.out.println("Corre corre corre");
  }
}
