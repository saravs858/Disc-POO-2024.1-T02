package br.edu.principal;

import java.util.Scanner;

/**Faça um programa para calcular a área de um triângulo e que não permita a entrada de dados inváli-
*dos, ou seja, medidas menores ou iguais a 0.**/

public class Principal {

	public static void main(String[] args) {
		double base, altura;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Digite a base do triângulo:");
	    base = sc.nextDouble();
	     while (base <= 0){
	      System.out.println("Digite um número maior que 0");
	       base = sc.nextDouble();
	    }
	    System.out.println("Digite a altura do triângulo:");
	    altura = sc.nextDouble();
	    
	    while ( altura <= 0) {
	      System.out.println(" Digite um número maior que 0:");
	       altura = sc.nextDouble();
	    }
	         double area = (base * altura/2);
	        System.out.println("A área do triângulo é :" + area);
       
	}

}
