package br.edu.principal;

import java.util.Scanner;

/** QR15- Faça um programa que receba o preço unitário, a refrigeração (S para os produtos que necessitem de
refrigeração e N para os que não necessitem) e a categoria (A — alimentação; L — limpeza; e V —
vestuário) de doze produtos, e que calcule e mostre:
■■ O custo de estocagem, calculado de acordo com a tabela a seguir.
■■ O imposto calculado de acordo com as regras a seguir:
Se o produto não preencher nenhum dos requisitos a seguir, seu imposto será de 2% sobre o preço
unitário; caso contrário, será de 4%.
Os requisitos são: categoria — A e refrigeração — S.
■■ O preço final, ou seja, preço unitário mais custo de estocagem mais imposto.
■■ A classificação calculada usando a tabela a seguir
■■ A média dos valores adicionais, ou seja, a média dos custos de estocagem e dos impostos dos doze
produtos.
■■ O maior preço final.
■■ O menor preço final.
■■ O total dos impostos.
■■ A quantidade de produtos com classificação barato.
■■ A quantidade de produtos com classificação caro.
■■ A quantidade de produtos com classificação normal.
 * 
 */

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double i, preco , custo_est = 0 , imp , preco_final , adicional = 0 , maior_p = 0 , menor_p = 0 , tot_imp = 0 , qtd_b =0  , qtd_n = 0 , qtd_c =0;
		char refri, categ;
		
		for(i=1;i<=12;i++) {
			System.out.println("Digite o preço unitário do " +i+ "ª produto:");
			preco=sc.nextDouble();
			System.out.println("Digite se necessita de refrigeração ou não (S/N).");
			refri=sc.next().charAt(0);
			System.out.println("Insira a categoria do produto(A — alimentação; L — limpeza; e V —vestuário)");
			categ=sc.next().charAt(0);

		if(preco <= 20) {
			if(categ=='A') {
				custo_est = 2;
			}else if (categ == 'L') {
		custo_est = 3;
			} else if(categ=='V') {
		custo_est = 4;
			}
		}
		
		if(preco > 20 && preco <= 50) {
			if(refri=='S') {
				custo_est = 6;
			}else {
				custo_est =0;
			}
		}
		
		if(preco > 50) {
			if(refri=='S') {
				if(categ=='A') {
					custo_est = 5;
				}else if(categ=='L') {
					custo_est = 2;
				}else if(categ=='V') {
					custo_est = 4;
				}
			} else {
				if(categ=='A' || categ=='V') {
					custo_est = 0;
				}else if(categ=='L') {
					custo_est = 1;
				}
			}
		}

		if(categ!='A' && refri !='S') {
			imp = preco * 2 / 100;
		} else {
			imp = preco * 4 / 100;
		}

		preco_final = preco + custo_est + imp;
		System.out.println("Preço de estocagem: " +custo_est);
		System.out.println("Preço do imposto: " +imp);
		System.out.println("Preço final: " +preco_final);

		if(preco_final <= 20) {
			qtd_b = qtd_b + 1;
			System.out.println("Classificação barato. \n");
		}
		
		if(preco_final > 20 && preco_final <= 100) {
			qtd_n = qtd_n + 1;
			System.out.println("Classificação Normal. \n");
		}
		
		if(preco_final > 100) {
			qtd_c = qtd_c + 1;
			System.out.println("Classificação caro. \n");
		}

		adicional = adicional + custo_est + imp;
		tot_imp = tot_imp = imp;

		if(i==1) {
			maior_p = preco_final;
			menor_p = preco_final;
		} else {
			if(preco_final > maior_p) {
				maior_p = preco_final;
			}else if (preco_final < menor_p) {
				menor_p = preco_final;
			}
		}
	}

		adicional = adicional / 12;

		System.out.printf("Adicionais: %.2f %n", adicional);
		System.out.println("Maior preço final: " + maior_p);
		System.out.println("Menor preço final: " + menor_p);
		System.out.println("Total dos impostos: "+ tot_imp);
		System.out.println("A quantidade de produtos com classificação barato: " + qtd_n);
		System.out.println("A quantidade de produtos com classificação caro: "+ qtd_c);
		System.out.println("A quantidade de produtos com classificação normal: "+ qtd_n);

	}
		
}