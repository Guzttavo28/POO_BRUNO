package br.com.classes;

public class Atendimento {
	
	private int hora;

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if (hora >= 1 && hora <=12) {
			
		System.out.println("Parabéns Atendimento Realizado");	
		this.hora = hora;
		
		}else {
			
		System.out.println("Atemdimento fora do Horário comercial");
		this.hora = hora;
		}
		
		
	}
	
	

}
