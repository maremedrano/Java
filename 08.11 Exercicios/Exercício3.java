package br.com.generation.exercicios;

import java.util.Scanner;

public class Exerc�cio3 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
int segundos, horas, minutos, tempo;

	System.out.println("Quantos segundos durar� o evento? ");
	segundos = leia.nextInt();
	
horas = (segundos / 3600);
minutos = ((segundos % 3600) / 60);
segundos = ((segundos % 3600) / 60);

	System.out.println("O evento ter� dura��o de " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
	
	

	}

}
