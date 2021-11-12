package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercício5 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
double notaA, notaB, notaC, notaAtotal, notaBtotal, notaCtotal, media;

	System.out.println("Primeira nota: ");
	notaA = leia.nextDouble();
	
	System.out.println("Segunda nota: ");
	notaB = leia.nextDouble();
	
	System.out.println("Terceira nota: ");
	notaC = leia.nextDouble();
	
notaAtotal = (notaA * 2);
notaBtotal = (notaB * 3);
notaCtotal = (notaC * 5);

media = (notaAtotal + notaBtotal + notaCtotal) / 10;

	System.out.println("A média do aluno é " + media + ".");
		

	}

}
