package br.com.projeto;

import br.com.classes.Atendimento;
import br.com.classes.Clientes;
import br.com.classes.Diarista;

public class App {

	public static void main(String[] args) {

		Diarista  diarista = new Diarista();
		diarista.setNome("João da Silva");
		diarista.setTelefone("(11)99523-8879"); 
		diarista.setEndereco("Av Cajamar, N 111"); 
		diarista.setChavePix("123");
		diarista.setSaldo(200);
		
		
		System.out.println("Nome Diarista: "+ diarista.getNome());
		System.out.println("Telefone Diarista: "+ diarista.getEndereco());
		System.out.println("Endereço Diarista: "+ diarista.getEndereco());
		System.out.println("Chave Pix Diarista "+ diarista.getChavePix());
		System.out.println("Saldo cliente:"+ diarista.getSaldo());
		diarista.depositar(30);
		diarista.sacar(10);
		System.out.println("Saldo atualizado:"+ diarista.getSaldo());
		diarista.atender("Daniel");
		
		System.out.println("====================================================================================================");
		
		Clientes cliente = new Clientes();
		cliente.setNome("Daniel"); 
		cliente.setTelefone("(11)995238879");
		cliente.setEndereco("Av Osasco, N 41");
		cliente.setSaldo(100.0);
				
		
		
		
		System.out.println("Nome Cliente: "+ cliente.getNome());
		System.out.println("Telefone Cliente: "+ cliente.getTelefone());
		System.out.println("Endereço Cliente: "+ cliente.getEndereco());	
		System.out.println("Saldo cliente:"+ cliente.getSaldo());
		cliente.depositar(30);
		cliente.sacar(10);
		System.out.println("Saldo atualizado:"+ cliente.getSaldo());
		
		
		
		Atendimento atendimento = new Atendimento();
		
		atendimento.setHora(0);
		System.out.println(atendimento.getHora());
			
		
	}

}
