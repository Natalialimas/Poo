package Poo;

public class Avião
{

		private String modelo;
		private String companhia;
		
		public Avião (String mod, String comp) 
		
		{
			modelo = mod;
			companhia = comp;
			
		}
		
		public String dadosAvião() 
		{
			String dadosAvião = modelo + " " + companhia; 
			return dadosAvião;
		}
	}
