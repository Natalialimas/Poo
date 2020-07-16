package Poo;

public class AnimalMain
{

	 public static void main (String args []) 
	 {
		 Cachorro Cuscuz = new Cachorro ("Cuscuz", 2);
		 Cavalo Pente = new Cavalo ("Pente", 5);
		 Preguica Soneca = new Preguica ("Soneca", 20);
		 
		
		 System.out.println(Cuscuz.getNome());
		 System.out.println(Cuscuz.getIdade());
		 Cuscuz.movimento();
		 Cuscuz.emitirSom();
		 System.out.println();
		 System.out.println("---------------------");
		 
	
		 System.out.println( Pente.getNome());
		 System.out.println( Pente.getIdade());
		 Pente.movimento();
		 Pente.emitirSom();
		 System.out.println();
		 System.out.println("---------------------");
		 
		 
		 System.out.println( Soneca.getNome());
		 System.out.println( Soneca.getIdade());
		 Soneca.movimento();
		 Soneca.emitirSom();
		 System.out.println();
		 System.out.println("---------------------");
		 
		 
		 
	 }
	 
}
