package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sal, qtd, tipo, valor_kw, gasto, acres, total, tot_geral, qtd_cons;
		
		tot_geral = 0; qtd_cons = 0; acres = 0;
		
		System.out.print("Digite o valor do salario minimo: ");
		sal = sc.nextInt();
		System.out.print("Digite a quantidade de quilo-watts gasta pelo consumidor (inteiro): ");
		qtd = sc.nextInt();
		
		valor_kw = sal / 8;
		System.out.println("O valor do kilo-watt é: " + valor_kw);
		
		while (qtd != 0) {
			gasto = qtd * valor_kw;
			
			System.out.print("Digite o tipo de consumidor (1 - Residencial, 2 - Comercial e 3 - Industrial): ");
			tipo = sc.nextInt();
			
			if (tipo == 1) {
				acres = (gasto * 5) / 100;
			}
			if (tipo == 2) {
				acres = (gasto * 10) / 100;
			}
			if (tipo == 3) {
				acres = (gasto * 15) / 100;
			}
			
			total = gasto + acres;
			tot_geral = tot_geral + total;
			
			if (total >= 500 && total <= 1000) {
				qtd_cons = qtd_cons + 1;
			}
			
			System.out.println("O gasto do consumidor foi: " + gasto);
			System.out.println("O acrescimo sobre o valor gasto foi: " + acres);
			System.out.println("O valor a ser pago pelo consumidor é : " + total + "\n");
			
			System.out.print("Digite a quantidade de quilo-watts gasta por outro consumidor (inteiro) ou 0 para sair: ");
			qtd = sc.nextInt();
		}
		
		System.out.println("O faturamento da empresa é: " + tot_geral);
		System.out.println("A quantidade de consumidores que pagam entre 500 e 1000 é: " + qtd_cons);
	}

}
