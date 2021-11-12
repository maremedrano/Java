package Exercícios;

import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
double numero;
		
		System.out.println("Digite um número: ");
		numero = leia.nextDouble();

		
		if((numero % 2) == 0) {
			System.out.println("O número é par. Sua raíz quadrada é " + Math.sqrt(numero));
		}
		else {
			System.out.println("O número é ímpar. " + numero + "² é: " + (numero * numero));
		}
		}

	}

