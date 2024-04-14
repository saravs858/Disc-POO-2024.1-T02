package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Digite o primeiro numero: ");
	int num1= sc.nextInt();
	System.out.println("Digite o segundo numero: ");
	int num2= sc.nextInt();
	
	if (num1 > num2){
	   System.out.println("O numero maior é: " + num1);
	}else { 
	   System.out.println("O numero maior é: " + num2);
	}
	if  (num1 == num2) {
		System.out.println("Os numeros são iguais");
	}
	}

}
