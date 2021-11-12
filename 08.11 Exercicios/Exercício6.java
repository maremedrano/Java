package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercício6 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);

int x1, y1, x2, y2, valorA, valorB, d;

	System.out.println("Qual o valor x do primeiro ponto? ");
	x1 = leia.nextInt();
	
	System.out.println("Qual o valor y do primeiro ponto? ");
	y1 = leia.nextInt();
	
	System.out.println("Qual o valor x do seugndo ponto? ");
	x2 = leia.nextInt();
	
	System.out.println("Qual o valor y do segundo ponto? ");
	y2 = leia.nextInt();
	
valorA = (x2 - x1) * (x2 - x1);
valorB = (y2 - y1) * (y2 - y1);

d = (int) Math.sqrt(valorA + valorB);

	System.out.println("A distância entre um ponto e outro é " + d + ".");

	
		
	}
}
