package Poo;

public class Pessoa 
{
	public String nome;
	public String endereço; //atributos
	public String telefone;
	
	public Pessoa (String nome, String endereço, String telefone)
	{
		this.nome = nome;
		this.endereço = endereço;   //construtor
		this.telefone = telefone;
		
	}  //atributo   // parametro
	
	
	public Pessoa ()
	{
		//Construtor generico
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {  //método
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
