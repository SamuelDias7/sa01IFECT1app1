package br.com.IFECT1.bo;

public class Calculo {
	
	// Declaração de variaveis
	public int ano;
	public int mes;
	public int dia;
	public int total;
	public int totalmes = 0;
	public int totalano = 2023;
	public int resultotal;
	
	public void calculo() {
		totalmes = 30 * 0;
		
		if(this.mes == 1) {
			this.total=+ totalmes;
			this.total = this.dia + this.total;
		}
		
		else if(this.mes == 2) {
			totalmes = 30 * 1;
			
			this.total=+ totalmes;
			this.total = this.dia + this.total;
		}
		else if(this.mes == 3) {
			totalmes = 30 * 2;
			
			this.total=+ totalmes;
			this.total = this.dia + this.total;
		}
		else if(this.mes == 4) {
			totalmes = 30 * 3;
			
			this.total=+ totalmes;
			this.total = this.dia + this.total;
		}
		else if(this.mes == 5) {
			totalmes = 30 * 4;
			
			this.total=+ totalmes;
			this.total = this.dia + this.total;
		}
		else if(this.mes == 6) {
			totalmes = 30 * 5;
			
			this.total=+ totalmes;
			this.total = this.dia + this.total;
		}
		else if(this.mes == 7) {
			totalmes = 30 * 6;
			
			this.total=+ totalmes;
			this.total = this.dia + this.total;
		}
		else if(this.mes == 8) {
			totalmes = 30 * 7;
			
			this.total=+ totalmes;
			this.total = this.dia + this.total;
		}
		else if(this.mes == 9) {
			totalmes = 30 * 8;
			
			this.total=+ totalmes;
			this.total = this.dia + this.total;
		}
			
		else if(this.mes == 10) {
			totalmes = 30 * 9;
			this.total=+ totalmes;
			this.total = this.dia + this.total;
			
		}else{
			System.out.println("Erro");
			
		}
		
		totalano = ano * 365; 
		
		resultotal = totalmes + totalano;
		
		
		
		System.out.println(resultotal);
		
		
		
		
		
	}

}