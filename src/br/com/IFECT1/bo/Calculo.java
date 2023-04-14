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
		totalmes = 30 * 2;
		
		if(this.mes == 3) {
			this.total=+ totalmes;
			this.total = this.dia + this.total;
			System.out.println("Total1: "  + this.total);
		}
		
		else if(this.mes == 4) {
			totalmes = 30 * 3;
			
			this.total=+ totalmes;
			this.total = this.dia + this.total;
			System.out.println("Total1: "  + this.total);
		}
			
		else if(this.mes == 5) {
			totalmes = 30 * 4;
			this.total=+ totalmes;
			this.total = this.dia + this.total;
			System.out.println("Total1: "  + this.total);
			
		}else{
			System.out.println("Erro");
			
		}
		
		totalano = totalano - ano; 
		totalano *= 365;
		
		resultotal = totalmes + totalano;
		
		
		
		System.out.println(resultotal);
		
		
		
		
		
	}

}
