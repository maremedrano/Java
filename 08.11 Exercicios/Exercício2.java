package br.com.generation.exercicios;

import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
int anos, meses, dias, idade;

	System.out.println("H� quantos dias voc� nasceu? ");
	dias = leia.nextInt();
	
anos = (dias / 365);
meses = ((dias % 365) / 30);
dias = ((dias % 365) % 30);

	System.out.println("Voc� tem " + anos + " anos, " + meses + " meses, e " + dias + " dias.");
	
	}

}
