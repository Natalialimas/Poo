package Poo;

public class Avi�o
{

		private String modelo;
		private String companhia;
		
		public Avi�o (String mod, String comp) 
		
		{
			modelo = mod;
			companhia = comp;
			
		}
		
		public String dadosAvi�o() 
		{
			String dadosAvi�o = modelo + " " + companhia; 
			return dadosAvi�o;
		}
	}
