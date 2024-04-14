package br.edu.principal;
import java.util.Scanner;
import java.lang.Math;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Escolha uma das opções: 1 - Somar dois números 2 - Raiz quadrada de um número");
		Scanner sc = new Scanner(System.in);
		byte escolha = sc.nextByte();
		if (escolha == 1) {
			System.out.println("Escolha o primeiro número na soma");
			float primeironumero = sc.nextFloat();
			System.out.println("Escolha o segundo número na soma");
			float segundonumero = sc.nextFloat();
			System.out.println("A soma é igual a " + (primeironumero + segundonumero));
		} else {
			System.out.println("Escolha um número para ser mostrado sua raíz");
			double numero = sc.nextDouble();
			double raiz = Math.sqrt(numero);
			System.out.println("a raiz é " + raiz);
		}

	}

}
