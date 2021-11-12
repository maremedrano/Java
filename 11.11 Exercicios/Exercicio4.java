package Aula4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] valores = new int[3][3];
		int soma = 0, somad = 0;
		
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c< 3; c++) {
				System.out.println("Digite os valores da matriz: ");
				valores[l][c] = scan.nextInt();
				
				soma += valores[l][c];
				somad = (valores[0][0]) + valores[1][1] + valores[2][2]; 
			}
		}
		
		System.out.println("\nA A soma da matriz é: " + soma);
		System.out.println("\nA soma da diagonal da matriz é: " + somad);
		scan.close();

	}

}