package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double pre, valor_adic, imposto, pre_custo, desconto, novo_pre;
		char tipo, refrig;
		
		System.out.print("Digite o preço do produto: ");
		pre = sc.nextDouble();
		System.out.print("Digite o tipo do produto (A - Alimentação, L - Limpeza ou V - Vestuário): ");
		tipo = sc.next().charAt(0);
		System.out.print("Digite se o produto precisa de refrigeração (S - sim ou N - Não): ");
		refrig = sc.next().charAt(0);
		
		valor_adic = 0;
		
		if (refrig == 'N') {
			if (tipo == 'A') {
				if (pre < 15) {
					valor_adic = 2;
				}
				else {
					valor_adic = 5;
				}
			} else if (tipo == 'L') {
				if (pre < 10) {
					valor_adic = 1.50;
				}
				else {
					valor_adic = 2.50;
				}
			} else if (tipo == 'V') {
				if (pre < 30) {
					valor_adic = 3;
				}
				else {
					valor_adic = 2.50;
				}
			}
		}
		else {
			if (tipo == 'A') {
				valor_adic = 8;
			} else if (tipo == 'L') {
				valor_adic = 0;
			} else if (tipo == 'V') {
				valor_adic = 0;
			}
		}
		System.out.println("O valor adicional do produto é: " + valor_adic);
		
		if (pre < 25) {
			imposto = 0.05 * pre;
		}
		else {
			imposto = 0.08 * pre;
		}
		System.out.println("O valor do imposto do produto é: " + imposto);
		
		pre_custo = pre + imposto;
		System.out.println("O preço de custo do produto é: " + pre_custo);
		
		if (tipo != 'A' && refrig != 'S') {
			desconto = 0.03 * pre_custo;
		}
		else {
			desconto = 0;
		}
		System.out.println("O desconto do produto é: " + desconto);
		
		novo_pre = pre_custo + valor_adic - desconto;
		System.out.println("O novo preço do produto é: " + novo_pre);
		
		if (novo_pre <= 50) {
			System.out.println("Barato.");
		}
		else {
			if (novo_pre < 100) {
				System.out.println("Normal.");
			}
			else {
				System.out.println("Caro.");
			}
		}
	}
}
