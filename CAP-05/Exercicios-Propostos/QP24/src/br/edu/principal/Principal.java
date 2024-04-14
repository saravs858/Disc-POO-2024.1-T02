package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, maior, menor;
		
		maior = 0; menor = 0;
		
		System.out.print("Digite um número inteiro e positivo: ");
		num = sc.nextInt();
		
		menor = num;
		maior = num;
		
		while (num != 0) {
			if (num < 0) {
				System.out.println("Número invalido.");
			}
			
			if (num > maior) {
				maior = num;
			}
			
			if (num < menor && num > 0) {
				menor = num;
			}
			
			System.out.print("Digite outro número inteiro e positivo ou 0 para finalizar: ");
			num = sc.nextInt();
		}
		
		System.out.println("O maior número que você digitou foi: " + maior);
		System.out.println("O menor número que você digitou foi: " + menor);
	}
}
