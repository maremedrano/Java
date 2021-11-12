package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);

int anos, meses, dias, idade;

	System.out.println("Quantos anos você tem? ");
	anos = leia.nextInt();
	
	System.out.println("Há quantos meses você completou " + anos + " anos? ");
	meses = leia.nextInt();
	
	System.out.println("Há quantos dias você completou " + anos + " anos e " + meses + " meses.");
	dias = leia.nextInt();
	
idade = (365 * anos) + (30 * meses) + dias;

	System.out.println("Você nasceu há " + idade + " dias.");
	

	}

}
