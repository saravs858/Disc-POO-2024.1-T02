package br.edu.principal;

import java.util.Scanner;

/** QR17- Faça um programa que receba o salário de um funcionário chamado Carlos. Sabe-se que outro fun-
*cionário, João, tem salário equivalente a um terço do salário de Carlos. Carlos aplicará seu salário 
*integralmente na caderneta de poupança, que rende 2% ao mês, e João aplicará seu salário inte-gralmente no fundo de renda fixa, que rende 5% ao mês. O programa deverá calcular e mostrar a quantidade de meses necessários para que o valor pertencente a João iguale ou ultrapasse o valor
*pertencente a Carlos. */

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Olá Carlos, informe seu salário:");
	    double salC = sc.nextDouble();
	    double salJ = salC/3;
	    int i;
	    for (i =0; salJ <= salC; i++){
	      salC = salC + (salC*0.02);
	      salJ = salJ + (salJ*0.05);
	    }
	    System.out.println("Foi preciso " + i + " meses para que o valor do salário de João se igualasse ao de Carlos " );

	}

}
