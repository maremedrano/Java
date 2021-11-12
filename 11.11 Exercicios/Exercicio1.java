package Aula4;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma atividade e o escreva em seguida. 
		// Encontre ap�s a maior pontua��o e a apresente.

		Scanner leia = new Scanner(System.in);
		
		double[]pontos = new double[5];
		double maiorvalor = 0.0;

				
		
		for(int i = 0; i < pontos.length; i++){
			System.out.println("Insira o valor da " + (i+1) + "� pontua��o: ");
			pontos[i] = leia.nextDouble();
			
			if(pontos[i] > maiorvalor){
				maiorvalor = pontos[i];
			}
		}
		
		
		System.out.println("Os valores de pontua��o foram: ");
			for(int i = 0; i < 5; i++) {
				System.out.print(pontos[i] + " | ");
			}
			
		System.out.println("A maior pontua��o foi " + maiorvalor + ".");
		
		leia.close();
	}
		
		
		
}
