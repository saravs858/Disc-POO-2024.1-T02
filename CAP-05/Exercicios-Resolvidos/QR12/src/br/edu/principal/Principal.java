package br.edu.principal;

import java.util.Scanner;

/** QR12- Em uma fábrica trabalham homens e mulheres divididos em três classes:
■■ trabalhadores que fazem até 30 peças por mês — classe 1;
■■ trabalhadores que fazem de 31 a 50 peças por mês — classe 2;
■■ trabalhadores que fazem mais de 50 peças por mês — classe 3.
A classe 1 recebe salário mínimo. A classe 2 recebe salário mínimo mais 3% deste salário por peça,
acima das 30 peças iniciais. A classe 3 recebe salário mínimo mais 5% desse salário por peça, acima das 30
peças iniciais.
Faça um programa que receba o número do operário, o número de peças fabricadas no mês, o sexo do
operário, e que também calcule e mostre:
■■ o número do operário e seu salário;
■■ o total da folha de pagamento da fábrica;
■■ o número total de peças fabricadas no mês;
■■ a média de peças fabricadas pelos homens;
■■ a média de peças fabricadas pelas mulheres; e
■■ o número do operário ou operária de maior salário.
A fábrica possui 15 operários.**/

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num_op=0, pecas_op=0, num_maior=0, cont_m=0, cont_f=0, tot_pecas=0, cont=0, media_m=0, salario_maior=0, media_f=0, salario_op=0, tot_folha=0;
		String sexo_op;
		
		for (cont = 1; cont <= 15; cont++) {
			System.out.println("Digite o número do " + cont + "º operário: ");
			num_op = sc.nextDouble();
			
			System.out.println("Digite o sexo do operário, F ou M: ");
			sexo_op = sc.next().toUpperCase();
			
			System.out.println("Digite o total de peças fabricadas pelo " + cont + "º operário: ");
			pecas_op = sc.nextDouble();
			
			if (pecas_op <=30) {
				salario_op = 450;
			}
			if (pecas_op > 30 && pecas_op <= 50) {
				salario_op = 450 + ((pecas_op-30)*3/100*450);
			}
			if (pecas_op > 50) {
				salario_op = 450 + ((pecas_op-30)*5/100*450);
			}
			System.out.println("O operário de número " + num_op + " recebe o salário de " + salario_op);
			
			tot_folha = tot_folha + salario_op;
			tot_pecas = tot_pecas + pecas_op;
			
			if (sexo_op.equals("M")) {
				media_m = media_m + pecas_op;
				cont_m = cont_m +1;
			} else {
				media_f = media_f + pecas_op;
				cont_f = cont_f +1;
				
			}
			if (cont == 1) {
				salario_maior = salario_op;
				num_maior = num_op;
			} else {
				if (salario_op > salario_maior) {
					salario_maior = salario_op;
					num_maior = num_op;
				}
			}		
			}
		System.out.println("O total da folha de pagamento será de R$" + tot_folha);
		System.out.println("O total de peças fabricadas no mês foi " + tot_pecas);
		
		if (cont_m == 0) {
			System.out.println("NENHUM HOMEM");
		} else {
			media_m = media_m / cont_m;
			System.out.println("A média de peças fabriadas por homens foi " + media_m);
		}

		if (cont_f == 0) {
			System.out.println("NENHUMA MULHER");
		} else {
			media_f = media_f / cont_f;
			System.out.println("A média de peças fabriadas por mulheres foi " + media_f);
		}
		System.out.println("O número do operário com maior salário é " + num_maior);

		sc.close();
			
	}
		
}


