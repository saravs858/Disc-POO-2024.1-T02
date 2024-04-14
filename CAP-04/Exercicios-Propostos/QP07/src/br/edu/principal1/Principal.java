package br.edu.principal1;

import java.util.Scanner;

/**QP07- Uma empresa decide dar um aumento de 30% aos funcionários com salários inferiores a R$ 500,00. Faça um
*programa que receba o salário do funcionário e mostre o valor do salário reajustado ou uma mensagem, caso
*ele não tenha direito ao aumento.**/

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double sal, newsal; 
		
		System.out.println("Informe seu salário:");
		sal = sc.nextInt();
		
		if (sal < 500) {
			newsal = sal + (sal * 0.3);
			System.out.printf("O novo salário é %.2f %n ", newsal);
		} else {
			System.out.println("Seu salário é igual ou superior a R$ 500,00, então você não recebeu aumento!");
		}

	}

}
