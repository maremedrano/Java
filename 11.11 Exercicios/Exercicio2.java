package Aula4;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		/*
		 * Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.
		 */

	Scanner leia = new Scanner(System.in);
		
	double[]valor = new double[10];
	double soma = 0.0, media = 0.0, maiorvalor = 0.0;
	int x = 0, ocorrencia = 0;
	
	System.out.println("Digite o valor.\n");
		for(x = 0; x < 10; x++) {
			System.out.println((x+1) + "� valor: ");
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
		
		System.out.println("\nA m�dia dos valores: " + media + ".\n");
		System.out.println("\nA maior pontua��o foi " + maiorvalor + ". E foram " + ocorrencia + " pontua��es com esse valor.\n");
		
			
	}

}
