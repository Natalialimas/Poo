package Poo;

public class Empregadomain {

	public static void main (String args []) {
		
		Empregado Angela = new Empregado ();
		Angela.setNome("Nome: Angela");
		Angela.setEndereço("Endereço: Rua 123");
		Angela.setTelefone("Telefone: 22222222");
		Angela.setCodigoSetor(4444);
		Angela.setSalarioBase(4923);
		Angela.setImposto(15);
		
		System.out.println(Angela.getNome());
		System.out.println(Angela.getEndereço());
		System.out.println(Angela.getTelefone());
		System.out.println(Angela.getCodigoSetor());
		System.out.println(Angela.calcularSalario());
		
	}
	
	
}
