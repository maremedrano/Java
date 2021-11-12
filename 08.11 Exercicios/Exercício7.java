package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercício7 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
		
double na, nb, nc, nd, ne, nf, v1, v2, v3, v4, v5, v6, x, y;

	System.out.println("Valor A: ");
	na = leia.nextDouble();
	
	System.out.println("Valor B: ");
	nb = leia.nextDouble();
	
	System.out.println("Valor C: ");
	nc = leia.nextDouble();
	
	System.out.println("Valor D: ");
	nd = leia.nextDouble();
	
	System.out.println("Valor E: ");
	ne = leia.nextDouble();
	
	System.out.println("Valor F: ");
	nf = leia.nextDouble();
	
v1 = nc * ne;
v2 = nb * nf;
v3 = na * ne;
v4 = nb * nd;

v5 = na * nf;
v6 = nc * nd;

x = (v1 - v2) / (v3 - v4);
y = (v5 - v6) / (v3 - v4);

	System.out.println("O valor de x é " + x + " e o valor de y é " + y);

	}

}
