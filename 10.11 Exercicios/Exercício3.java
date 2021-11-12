package Exercicios;

import java.util.Scanner;

public class Exercício3 {
	
	/* Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	idade for =-99. (WHILE)
	*/
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0;
		int menor21 = 0;
		int mais50 = 0;
		
		while(idade != -99) {
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			
			if(idade < 21 && idade >= 0) {
				menor21++;
			}
			
			else if(idade > 50) {
				mais50++;
			}
			
			
		}
		
		System.out.println(menor21 + " pessoas tem idade inferior a 21 anos e " + mais50 + " pessoas tem idade superior a 50 anos.");
		
		
		

	}

}
