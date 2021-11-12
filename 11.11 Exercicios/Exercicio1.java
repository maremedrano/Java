package Aula4;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
		// Encontre após a maior pontuação e a apresente.

		Scanner leia = new Scanner(System.in);
		
		double[]pontos = new double[5];
		double maiorvalor = 0.0;

				
		
		for(int i = 0; i < pontos.length; i++){
			System.out.println("Insira o valor da " + (i+1) + "ª pontuação: ");
			pontos[i] = leia.nextDouble();
			
			if(pontos[i] > maiorvalor){
				maiorvalor = pontos[i];
			}
		}
		
		
		System.out.println("Os valores de pontuação foram: ");
			for(int i = 0; i < 5; i++) {
				System.out.print(pontos[i] + " | ");
			}
			
		System.out.println("A maior pontuação foi " + maiorvalor + ".");
		
		leia.close();
	}
		
		
		
}
