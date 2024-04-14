package br.edu.principal;

import java.util.Scanner;

/** QP20- Faça um programa que apresente o menu de opções a seguir:
Menu de opções:
1. Média aritmética
2. Média ponderada
3. Sair
Digite a opção desejada.
Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
Na opção 3: sair do programa. **/

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int esc;
		do { 	
			System.out.println("Menu de opções:\r\n"
					+ "1. Média aritmética\r\n"
					+ "2. Média ponderada\r\n"
					+ "3. Sair");
			esc = sc.nextInt();

			if (esc == 1) {
				System.out.println("Digite o 1º número:");
				int x = sc.nextInt();
				
				System.out.println("Digite o 2º número:");
				int y = sc.nextInt();
				
				double mediaA = (x+y) /2;
				
				System.out.printf("A média aritmética entre os números é %.2f %n ", mediaA);
				
				
			}else if (esc == 2) {
				System.out.println("Digite o 1º número:");
				int x = sc.nextInt();
				
				System.out.println("Digite o 2º número:");
				int y = sc.nextInt();
				
				System.out.println("Digite o 3º número:");
				int z = sc.nextInt();
				
				System.out.println("Digite o peso da 1ª nota:");
				int pesoX = sc.nextInt();
				
				System.out.println("Digite o peso da 2ª nota::");
				int pesoY = sc.nextInt();
				
				System.out.println("Digite o peso da 3ª nota::");
				int pesoZ = sc.nextInt();
				
				
				double mediaP = ((x * pesoX) + (y * pesoY) + (z * pesoZ)) / (pesoX + pesoY + pesoZ);
				
				System.out.printf("A média ponderada entre os números é %.2f %n ", mediaP);
				
			}
		
		}while (esc != 3);
		


	}

}
