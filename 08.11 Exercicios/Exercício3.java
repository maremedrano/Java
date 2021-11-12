package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
int segundos, horas, minutos, tempo;

	System.out.println("Quantos segundos durará o evento? ");
	segundos = leia.nextInt();
	
horas = (segundos / 3600);
minutos = ((segundos % 3600) / 60);
segundos = ((segundos % 3600) / 60);

	System.out.println("O evento terá duração de " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
	
	

	}

}
