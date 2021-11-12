package Aula4;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		/*
		 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
		 */

	Scanner leia = new Scanner(System.in);
		
	double[]valor = new double[10];
	double soma = 0.0, media = 0.0, maiorvalor = 0.0;
	int x = 0, ocorrencia = 0;
	
	System.out.println("Digite o valor.\n");
		for(x = 0; x < 10; x++) {
			System.out.println((x+1) + "º valor: ");
			valor[x] = leia.nextDouble();
			
			soma = soma + valor[x];
			
			if(valor[x] >= maiorvalor) {
				ocorrencia++;
			}
			
			if(valor[x] > maiorvalor) {
				ocorrencia = 1;
			}
						
			if(valor[x] > maiorvalor) {
				maiorvalor = valor[x];
			}
			
			
		
		}
	
		media = soma / x;
		
		System.out.println("\nOs valores foram: \n");
		for(x = 0; x < 10; x++) {
			System.out.println(valor[x]);
		}
		
		System.out.println("\nA média dos valores: " + media + ".\n");
		System.out.println("\nA maior pontuação foi " + maiorvalor + ". E foram " + ocorrencia + " pontuações com esse valor.\n");
		
			
	}

}
