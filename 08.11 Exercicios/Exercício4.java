package br.com.generation.exercicios;
import java.util.Scanner;

public class Exerc�cio4 {

	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	int a, b, c, d, r, s;
	
	System.out.println("Escreva o valor de A: ");
	a = leia.nextInt();
	
	System.out.println("Escreva  o valor de B: ");
	b = leia.nextInt();
	
	System.out.println("Escreva o valor de C: ");
	c = leia.nextInt();
	
r = (int) Math.pow(a + b, 2.0); //(a + b) * (a + b);
s = (int) Math.pow(b + c, 2);//(b + c) * (b + c);
d = (r + s) / 2;

	leia.close();

	System.out.println("O resultado da express�o �: " + d);
	}
	
	

}
