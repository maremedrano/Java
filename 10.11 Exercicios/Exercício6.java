package Exercicios;

import java.util.Scanner;

public class Exercício6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		/*
		 * Escrever um programa que receba vários números inteiros no teclado. E no
		 final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
		 */
		
		int numero;
		double media, multiplos = 0.0, soma = 0.0;
		
		
		do {
			System.out.println("Digite um número inteiro: ");
			numero = leia.nextInt();
			
			if(numero % 3 == 0 && numero != 0) {
				multiplos++;
				soma = soma + numero;
			}
		}
		
		while(numero != 0);
		
		media = soma / multiplos;
			
		System.out.println("A média dos números digitados que são múltiplos de 3 é: " + media);
	
		
		
		
		
		

	}

}
