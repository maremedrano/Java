package Exerc�cios;

import java.util.Scanner;

public class Exerc�cio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
double numero;
		
		System.out.println("Digite um n�mero: ");
		numero = leia.nextDouble();

		
		if((numero % 2) == 0) {
			System.out.println("O n�mero � par. Sua ra�z quadrada � " + Math.sqrt(numero));
		}
		else {
			System.out.println("O n�mero � �mpar. " + numero + "� �: " + (numero * numero));
		}
		}

	}

