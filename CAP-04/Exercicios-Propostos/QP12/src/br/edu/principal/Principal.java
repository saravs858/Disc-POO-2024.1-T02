package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double sal_bruto, valor_rec, imposto, grat;
		
		System.out.print("Digite o seu salario bruto: ");
		sal_bruto = sc.nextDouble();
		
		grat = 0;
		if (sal_bruto <= 350) {
			grat = 100;
		}
		
		if (sal_bruto > 350 && sal_bruto <= 600) {
			grat = 75;
		}
		
		if (sal_bruto > 600 && sal_bruto <= 900) {
			grat = 50;
		}
		
		if (sal_bruto > 900) {
			grat = 35;
		}
		
		imposto = 0.07 * sal_bruto;
		
		valor_rec = sal_bruto + grat - imposto;
		System.out.println("O valor que você deve receber é: " + valor_rec);
	}

}
