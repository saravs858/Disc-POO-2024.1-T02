package br.edu.principal;

import java.util.Scanner;

/** QR20 - Faça um programa que receba:
■■ O código de um produto comprado, supondo que a digitação do código do produto seja sempre
válida, isto é, um número inteiro entre 1 e 10.
■■ O peso do produto em quilos.
■■ O código do país de origem, supondo que a digitação do código seja sempre válida, isto é, um nú-
mero inteiro entre 1 e 3.


Calcule e mostre:
■■ o peso do produto convertido em gramas;
■■ o preço total do produto comprado;
■■ o valor do imposto, sabendo que ele é cobrado sobre o preço total do produto comprado e depende
do país de origem;
■■ o valor total, preço total do produto mais imposto. **/

public class Principal {

	public static void main(String[] args) {
		
		double codPro, codPais, pesoKg, pesoG, imposto = 0, valorTotal, preTotal, precoG = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o código do produto:");
		codPro = sc.nextDouble();
		
		System.out.println("Informe o código do país:");
		codPais = sc.nextDouble();
		
		System.out.println("Informe o peso do produto em kilogramas:");
		pesoKg = sc.nextDouble();
		
		pesoG = pesoKg * 1000;
		System.out.printf("\n \nO peso do produto em gramas é %.2f %n ", pesoG);
		
		System.out.println();
		
		if (codPro >= 1 && codPro <= 4) {
			precoG = 10;
		} else if (codPro >= 5 && codPro <= 7) {
			precoG = 25;
		} else if (codPro >= 8 && codPro <= 10) {
			precoG = 35;
		}
		
		preTotal = pesoG * precoG;
		System.out.printf("O preço total do produto é %.2f %n ", preTotal);
	
		if (codPais == 1) {
			imposto = 0;
		} else if (codPais == 2) {
			imposto = preTotal * 15/100;
		}else if (codPais == 3) {
			imposto = preTotal * 25/100;
		}
		
		System.out.println();
		System.out.printf("O imposto é igual a %.2f %n ", imposto);
		
		valorTotal = preTotal + imposto;
		
		System.out.println();
		System.out.printf("O valor total do produto comprado é %.2f %n ", valorTotal);
		
	}
	
}
