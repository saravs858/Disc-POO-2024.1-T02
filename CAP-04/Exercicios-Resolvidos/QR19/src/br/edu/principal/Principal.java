package br.edu.principal;

import java.util.Scanner;

/* QR19 - Faça um programa que receba a altura e o peso de uma pessoa. De acordo com a tabela a seguir, veri-
fique e mostre a classificação dessa pessoa.*/

public class Principal {

	public static void main(String[] args) {
		
		double peso, altura;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe sua altura:");
		altura = sc.nextDouble();
		
		System.out.println("Informe seu peso:");
		peso = sc.nextDouble();
		
		if (altura < 1.20) {
			if (peso <= 60) {
				System.out.println("Classe A");
			} else if (peso > 60 && peso <= 90) {
				System.out.println("Classe D");
			} else if (peso > 90) {
				System.out.println("Classe G");
			}
		} else if (altura >= 1.20 && altura <= 1.70) {
			if (peso <= 60) {
				System.out.println("Classe B");
			} else if (peso > 60 && peso <= 90) {
				System.out.println("Classe E");
			} else if (peso > 90) {
				System.out.println("Classe H");
			}
		} else if (altura > 1.70) {
			if (peso <= 60) {
				System.out.println("Classe C");
			} else if (peso > 60 && peso <= 90) {
				System.out.println("Classe F");
			} else if (peso > 90) {
				System.out.println("Classe I");
			}
		}
		

	}

}
