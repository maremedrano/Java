package Exercicios;

import java.util.Scanner;

public class Exerc�cio6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		/*
		 * Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
		 final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
		 */
		
		int numero;
		double media, multiplos = 0.0, soma = 0.0;
		
		
		do {
			System.out.println("Digite um n�mero inteiro: ");
			numero = leia.nextInt();
			
			if(numero % 3 == 0 && numero != 0) {
				multiplos++;
				soma = soma + numero;
			}
		}
		
		while(numero != 0);
		
		media = soma / multiplos;
			
		System.out.println("A m�dia dos n�meros digitados que s�o m�ltiplos de 3 �: " + media);
	
		
		
		
		
		

	}

}
