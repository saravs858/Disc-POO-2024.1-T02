package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double sal_min, nht, coeficiente, sal_bruto, imposto, grat, auxilio, sal_liq;
		char turno, categoria;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do salario minimo: ");
		sal_min = sc.nextDouble();
		System.out.print("Digite o seu turno de trabalho (M - Matutino, V - Vespertino e N - Noturno): ");
		turno = sc.next().charAt(0);
		System.out.print("Digite a sua categoria: ");
		categoria = sc.next().charAt(0);
		System.out.print("Digite o seu numero de horas trabalhadas: ");
		nht = sc.nextDouble();
		
		if (turno == 'M') {
			coeficiente = 0.10 * sal_min;
		}
			else if (turno == 'V') {
				coeficiente = 0.15 * sal_min;
			}
			else if (turno == 'N') {
				coeficiente = 0.12 * sal_min;
			}
		else {
			coeficiente = 0;
			System.out.println("O turno digitado é invalido.");
		}
		System.out.println("O coeficiente do seu salario é: " + coeficiente);
		
		sal_bruto = nht * coeficiente;
		System.out.println("O seu salario bruto é: " + sal_bruto);
		
		if (categoria == 'O') {
			if (sal_bruto >= 300) {
				imposto = 0.05 * sal_bruto;
			}
			else {
				imposto = 0.03 * sal_bruto;
			}
		}
		else {
			if (sal_bruto >= 400) {
				imposto = 0.06 * sal_bruto;
			}
			else {
				imposto = 0.04 * sal_bruto;
			}
		}
		System.out.println("O imposto sobre o seu salario bruto é: " + imposto);
		
		if (turno == 'O' && nht > 80) {
			grat = 50;
		}
		else {
			grat = 30;
		}
		System.out.println("A sua gratificação é: " + grat);
		
		if (turno == 'O' || coeficiente <= 25) {
			auxilio = (1 / 3) * sal_bruto;
		}
		else {
			auxilio = (1 / 2) * sal_bruto;
		}
		System.out.println("O valor do seu auxilio é: " + auxilio);
		
		sal_liq = sal_bruto - imposto + grat + auxilio;
		System.out.println("O seu salario liquido é: " + sal_liq);
		
		if (sal_liq < 350) {
			System.out.println("Mal remunerado.");
		}
			else if (sal_liq >= 350 && sal_liq <= 600) {
				System.out.println("Normal.");
			}
				else if (sal_liq > 600) {
					System.out.println("Bem remunerado.");
				}
	}

}
