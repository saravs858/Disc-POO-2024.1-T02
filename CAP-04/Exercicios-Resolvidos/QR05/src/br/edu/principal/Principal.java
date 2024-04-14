package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Digite 3 numeros em ordem crescente. " );
		Scanner sc = new Scanner (System.in); 
		System.out.println("Digite o primeiro numero: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		int num2 = sc.nextInt();
		System.out.println("Digite o terceiro numero: ");
		int num3 = sc.nextInt();
		System.out.println("Digite um numero (fora de ordem): ");
		int num4 = sc.nextInt();
       
		if (num4> num3) {
			System.out.println("A ordem decrescente é: "+ num4 + "-"+num3 + "-" + num2 + "-" + num1);
		} if (num4 > num2 && num4 <num3){
		System.out.println("A ordem decrescente é: "+ num3 + "-"+num4 + "-" + num2 + "-" + num1);
		}if (num4 > num1 && num4 <num2){
			System.out.println("A ordem decrescente é: "+ num3 + "-"+num2 + "-" + num4 + "-" + num1);
			}
		if (num4<num1) {
			System.out.println("A ordem decrescente é: "+ num3 + "-"+num2 + "-" + num1 + "-" + num4);
		}
	}

}
