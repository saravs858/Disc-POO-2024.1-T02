package br.edu.principal;

import java.util.Scanner;

// QR17 - Faça um programa para resolver equações do 2o grau.

public class Principal {

	public static void main(String[] args) {
		
		double a, b, c, delta, x1, x2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor de a:");
		a = sc.nextDouble();
		
		System.out.println("Informe o valor de b:");
		b = sc.nextDouble();
		
		System.out.println("Informe o valor de c:");
		c = sc.nextDouble();
		
		if (a == 0) {
			
			System.out.println("Isso não é uma equação da 2° grau!");
		} else {
			
			delta = Math.pow(b, 2) - (4 * a * c);
			
			if (delta < 0) {
				
				System.out.println("Não há raiz real!");
				
			} else if (delta == 0) {
				
				x1 = (-b) / (2 * a);
				System.out.printf("Só existe uma raiz, ou seja, x¹ e x² são iguais a ", x1);
				
			} else if (delta > 0) {
				 
				x1 = (-b + Math.sqrt(delta))/ (2 * a);
				x2 = (-b - Math.sqrt(delta))/ (2 * a);
				
				System.out.printf("As raizes da equação são iguais a " + x1 + " e " + x2);
				
			}
		}
	}

}
