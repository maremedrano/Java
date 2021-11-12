package Aula4;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		/*
		 Escreva um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
	das matrizes N1 e N2;
	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
	posição das matrizes N1 e N2.
		 */
		
		Scanner leia = new Scanner(System.in);		

		int[][] n1 = new int[4][6];
		int[][] n2 = new int[4][6];
		int[][] m1 = new int[4][6];
		int[][] m2 = new int[4][6];

		for(int l = 0; l < 4; l++){
				for(int c = 0; c < 6; c++){
					
				System.out.println("Valores de N1: ");
				n1[l][c] = leia.nextInt();
				
				System.out.println("Valores de N2: ");
				n2[l][c] = leia.nextInt();

			
				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];
			}		
		}
		
		
		
		System.out.println("\n");
		System.out.println("Resultado da matriz M1: ");
		for(int l = 0; l < 4; l++){
				for(int c = 0; c < 6; c++){
					System.out.print(m1[l][c] + " | ");
				}
				System.out.print("\n");				
		}

		System.out.println("Resultado da matriz M2: ");
		for(int l = 0; l < 4; l++){
				for(int c = 0; c < 6; c++){
					System.out.print(m2[l][c] + " | ");
				}
			System.out.print("\n");
		}
		
		leia.close();
	}
}