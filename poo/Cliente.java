package Poo;

public class Cliente 
{
	
			public String nomeCliente;
			public int idadeCliente;
			public int cpfCliente;
			public float saldoCliente;
			
			
			public Cliente (String nomeC,int idadeC,int cpfC, float saldoC ) 
			{
				
				nomeCliente = nomeC;
				idadeCliente = idadeC;
				cpfCliente = cpfC;
				saldoCliente = saldoC;
			}
			
			public String nomeCliente ()
			{
				String nomeDoCliente = "\nNome do cliente: "+ nomeCliente; 
				return nomeDoCliente;
			}
			
			public String saldoCliente ()
			{
				String saldoClientePrograma = "\nSaldo do cliente é: " + Float.toString(saldoCliente)+ "reais";
				return saldoClientePrograma;
			}
			
			public String dadosCliente () 
			{
				String dadosClientePrograma = "\nIdade do Ciente: " + idadeCliente + "\nCpf do cliente "+cpfCliente;
				return dadosClientePrograma;
			}
		}



