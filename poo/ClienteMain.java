package Poo;

public class ClienteMain
{
	public static void main (String args[]) 
	{
		
		Cliente cl1 = new Cliente ("Giovanna", 28, 123456789, 250);
		System.out.println(cl1.nomeCliente());
		System.out.println(cl1.dadosCliente());
		System.out.println(cl1.saldoCliente);
		
		Cliente  cl2 = new Cliente  ("Rafael", 33, 987654321, 800);
		System.out.println(cl2.nomeCliente());
		System.out.println(cl2.dadosCliente());
		System.out.println(cl2.saldoCliente);
		
		Cliente  cl3 = new Cliente  ("Ricardo", 56, 222222222, 1000);
		System.out.println(cl3.nomeCliente());
		System.out.println(cl3.dadosCliente());
		System.out.println(cl3.saldoCliente);

	}
}
