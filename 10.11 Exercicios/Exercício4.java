package Exercicios;

import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, sexo, caracteristicas;
		int calmo = 0, mulheresnervosas = 0, homensagressivos = 0, outroscalmos = 0, quarentanervoso = 0, menorescalmos = 0;
		int habitante = 1;
		
		while(habitante <= 5) {
			
			System.out.println("\n");
			
			System.out.println(habitante + "ª pessoa: \n");
			
			System.out.println("Idade: ");
			idade = leia.nextInt();
			
			System.out.println("Sexo (digite 1 para feminino | 2 para masculino | 3 para outros)");
			sexo = leia.nextInt();
			
			System.out.println("Características (digite 1 para calmo | 2 para nervoso | 3 para agressivo)");
			caracteristicas = leia.nextInt();
			
			habitante++;
			
			
			if(caracteristicas == 1) {
				calmo++;
			}
			
			if(sexo == 1 && caracteristicas == 2) {
				mulheresnervosas++;
			}
			
			if(sexo == 2 && caracteristicas == 3) {
				homensagressivos++;
			}
			if(sexo == 3 && caracteristicas == 1) {
				outroscalmos++;
			}
			if(idade > 40 && caracteristicas == 2) {
				quarentanervoso++;
			}
			if(idade < 18 && caracteristicas == 1) {
				menorescalmos++;
			}
		}

		
		System.out.println("\nDentre os habitantes que fizeram parte desta pesquisa: \n");
		System.out.println(calmo + " pessoas se consideram calmas;");
		System.out.println(mulheresnervosas + " mulheres se consideram nervosas;");
		System.out.println(homensagressivos + " homens se consideram agressivos;");
		System.out.println(outroscalmos + " pessoas de outros gêneros se consideram calmas; ");
		System.out.println(quarentanervoso + " pessoas com mais de 40 anos se consideram nervosas;");
		System.out.println(menorescalmos + " pessoas com menos de 18 anos se consideram calmas.");
		
	}

}
