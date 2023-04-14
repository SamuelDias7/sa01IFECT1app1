package br.com.IFECT1.app;

import java.util.Scanner;

import br.com.IFECT1.bo.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		Calculo objeto = new Calculo();
		
		System.out.println("Informe o seu ano:");
		objeto.ano = leia.nextInt();
		System.out.println(objeto.ano);
		
		System.out.println("Informe o seu mes:");
		objeto.mes = leia.nextInt();
		System.out.println(objeto.mes);
		
		System.out.println("Informe o dia de nascimento:");
		objeto.dia = leia.nextInt();
		System.out.println(objeto.dia);
		
		objeto.calculo();
		
		
		
	}

}
