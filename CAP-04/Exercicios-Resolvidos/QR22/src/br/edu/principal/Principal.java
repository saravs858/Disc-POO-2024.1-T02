package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double sal_base, imposto, grat,  sal_liq;
		int tempo;
		
		System.out.print("Digite o seu salario base: ");
		sal_base = sc.nextDouble();
		System.out.print("Digite o tempo em que você trabalha: ");
		tempo = sc.nextInt();
		
		if (sal_base < 200) {
			imposto = 0;
		}
			else if (sal_base <= 450) {
				imposto = 0.03 * sal_base;
			} 
			else if (sal_base < 700) {
				imposto = 0.08 * sal_base;
			}
		else {
			imposto = 0.12 * sal_base;
		}
		System.out.println("O imposto sobre o salario é: " + imposto);
		
		if (sal_base > 500) {
			if (tempo <= 3) {
				grat = 20;
			}
			else {
				grat = 30;
			}
		}
		else {
			if (tempo <= 3) {
				grat = 23;
			}
				else if (tempo < 6) {
					grat = 35;
				}
			else {
				grat = 33;
			}
		}
		System.out.println("A sua gratificação é: " + grat);
		
		sal_liq = sal_base - imposto + grat;
		
		System.out.println("O seu salario liquido é: " + sal_liq);
		
		if (sal_liq <= 350) {
			System.out.println("A sua classificação é: A");
		}
			else if (sal_liq < 600) {
				System.out.println("A sua classificação é: B");
			}
		else {
			System.out.println("A sua classificação é: C");
		}
	}
}
