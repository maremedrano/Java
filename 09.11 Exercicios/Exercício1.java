package Exerc�cios;

import java.util.Scanner;

public class Exerc�cio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite tr�s n�meros: \n");
		n1 = leia.nextInt();
		n2 = leia.nextInt();
		n3 = leia.nextInt();
		
		if(n1 >= n2 && n1 >= n3) {
			System.out.println("O maior n�mero �: " + n1);
		}
		
		if(n2 >= n1 && n2 >= n3) {
			System.out.println("O maior n�mero �: " + n2);
		}
		
		if(n3 >= n1 && n3 >= n2) {
			System.out.println("O maior n�mero �: " + n3);
		}

	}

}
