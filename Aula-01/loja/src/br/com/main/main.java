package br.com.main;

import br.com.classes.vaiculo;

public class main {

	public static void main(String[] args) {
		
		vaiculo carro = new veiculo();
		carro.nome = "lamborghini";
		carro.cor =  "Preto";	
		carro.motor = "640cv";
		carro.velocidade = 310;
		carro.modelo = "Huracan";	
		
		System.out.println("Nome:" + carro.nome);
		System.out.println("cor:" + carro.cor);
		System.out.println("Motor:" + carro.motor);
		System.out.println("velocidade:" + carro.velocidade);
		System.out.println("Modelo:" + carro.modelo);
		
		carro.ligar();

		
	}

}
