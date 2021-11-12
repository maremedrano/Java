package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercício8 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);

int custo, total;

	System.out.println("Qual o custo de fábrica do veículo? ");
	custo = leia.nextInt();
	
total = ((custo / 100) * 28) + ((custo / 100) * 45) + custo;

	System.out.println("O valor total do carro será de " + total + " reais.");
		
	}

}
