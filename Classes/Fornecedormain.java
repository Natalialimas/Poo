package Poo;

public class Fornecedormain 

{
	public static void main (String args[])
	{
		
		Fornecedor leticia = new Fornecedor ();
		leticia.setNome("Nome: Let�cia");
		leticia.setEndere�o("Rua 3");
		leticia.setTelefone("555555");
		leticia.setValorCredito(500);
		leticia.setValorDivida(100);
		
		System.out.println(leticia.getNome());
		System.out.println(leticia.getEndere�o());
		System.out.println(leticia.getTelefone());
		System.out.println(leticia.obterSaldo());

	}
}
