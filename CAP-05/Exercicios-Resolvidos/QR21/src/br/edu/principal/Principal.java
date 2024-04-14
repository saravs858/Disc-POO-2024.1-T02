package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, soma, qtd, maior, menor, qtd_par, media_par, 
		soma_par, qtd_impar, media, perc;
		
		qtd = 0; qtd_par = 0; soma_par = 0; qtd_impar = 0; soma = 0; maior = 0; menor = 0;
		
		System.out.print("Digite um número: ");
		num = sc.nextInt();
		
		while (num != 30000) {
			if (qtd == 0) {
				maior = num;
				menor = num;
			}
			else {
				if (num > maior) {
					maior = num;
				}
				if (num < menor) {
					menor = num;
				}
			}
			
			soma = soma + num;
			qtd = qtd + 1;
			
			if (num % 2 == 0) {
				soma_par = soma_par + num;
				qtd_par = qtd_par + 1;
			}
			else {
				qtd_impar = qtd_impar + 1;
			}
			
			System.out.print("Digite outro número ou 30000 para finalizar: ");
			num = sc.nextInt();
		}
		
		if (qtd == 0) {
			System.out.println("Nenhum número digitado.");
		}
		else {
			System.out.println("A soma dos números é: " + soma);
			System.out.println("A quatidade de números é: " + qtd);
			media = soma / qtd;
			System.out.println("A media dos números digitados é: " + media);
			System.out.println("O maior número digitado foi: " + maior);
			System.out.println("O menor número digitado foi : " + menor);
			
			if (qtd_par == 0) {
				System.out.println("Nenhum par.");
			}
			else {
				media_par = soma_par / qtd_par;
				System.out.println("A media dos números pares é: " + media_par);
			}
			
			perc = (qtd_impar * 100) / qtd;
			System.out.println("A porcentagem de números impares digitados foi: " + perc);
		}
		
	}

}
