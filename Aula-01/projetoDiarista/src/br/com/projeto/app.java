package br.com.projeto;

import br.com.classes.Cliente;
import br.com.classes.Diarista;

public class app {

	public static void main(String[] args) {
		
		Diarista diarista = new Diarista();
		
		diarista.nome = "João da Silva";
		diarista.telefone = "(11) 98757-7859";	
		diarista.endereco = "Av Cajamar, N 111";
		diarista.chavaPix = "123";
		
		
		System.out.println("Nome Diarista: " +  diarista.nome);
		System.out.println("Telefone Diarista: " +  diarista.telefone);
		System.out.println("Endereço Diarista:" +  diarista.chavePix);
		diarista.atende("Daniel");
		
		
		
		Cliente cliente = new Cliente();
		
		cliente.nome = "Daniel";
		cliente.telefone = "(11) 98757-7859";
		cliente.endereco = " Av Cajamar, N 111";
		cliente.saldo = 100.0;
		
		
		System.out.println("Nome Cliente: " +  cliente.nome);
		System.out.println("Telefone Cliente: " +  cliente.telefone);
		System.out.println("Endereço Cliente:" +  cliente.endereco);
		System.out.println("Saldo Cliente:" +  cliente.saldo);
	}

}
