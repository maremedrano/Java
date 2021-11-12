package Exercícios;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite três números: \n");
		n1 = leia.nextInt();
		n2 = leia.nextInt();
		n3 = leia.nextInt();
		
		if(n1 >= n2 && n1 >= n3) {
			System.out.println("O maior número é: " + n1);
		}
		
		if(n2 >= n1 && n2 >= n3) {
			System.out.println("O maior número é: " + n2);
		}
		
		if(n3 >= n1 && n3 >= n2) {
			System.out.println("O maior número é: " + n3);
		}

	}

}
