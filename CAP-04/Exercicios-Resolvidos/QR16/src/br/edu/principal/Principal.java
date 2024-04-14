package br.edu.principal;

import java.util.Scanner;

/* Um supermercado deseja reajustar os preços de seus produtos usando o seguinte critério: o produto
poderá ter seu preço aumentado ou diminuído. Para o preço ser alterado, o produto deve preencher
pelo menos um dos requisitos a seguir:

VENdA MédiA MENsAL PrEço ATuAL % dE AuMENTo % dE diMiNuição
< 500 < R$ 30,00 10 –
>= 500 e < 1.200 >= R$ 30,00 e < R$ 80,00 15 –
>= 1.200 >= R$ 80,00 – 20

Faça um programa que receba o preço atual e a venda média mensal do produto, calcule e mostre o
novo preço. */

public class Principal {

	public static void main(String[] args) {
		
		double prAtual, venMen, novPre = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o preço do produto:");
		prAtual = sc.nextDouble();
	
		System.out.println("Informe a venda média mensal do produto:");
		venMen = sc.nextDouble();
		
		if (venMen < 500 || prAtual < 30) {
			
			novPre = prAtual + (prAtual*10/100);
			
		} else if (venMen >= 500 & venMen < 1200 || prAtual >= 30 & prAtual < 80){
			
			novPre = prAtual + (prAtual*15/100);
			
		} else if(venMen >= 1200 || prAtual >= 80) {
		
			novPre = prAtual - (prAtual*20/100);
			
		}

		System.out.printf("O novo preço do produto será R$ %.2f %n", novPre);
		
	}

}
