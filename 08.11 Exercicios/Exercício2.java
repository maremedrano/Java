package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
int anos, meses, dias, idade;

	System.out.println("Há quantos dias você nasceu? ");
	dias = leia.nextInt();
	
anos = (dias / 365);
meses = ((dias % 365) / 30);
dias = ((dias % 365) % 30);

	System.out.println("Você tem " + anos + " anos, " + meses + " meses, e " + dias + " dias.");
	
	}

}
