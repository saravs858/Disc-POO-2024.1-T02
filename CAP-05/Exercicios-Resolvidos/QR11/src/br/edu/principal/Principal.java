package br.edu.principal;

import java.util.Scanner;

/**QR11- Faça um programa que receba um número inteiro maior que 1, verifique se o número fornecido é pri-
*mo ou não e mostre uma mensagem de número primo ou de número não primo.
*Um número é primo quando é divisível apenas por 1 e por ele mesmo. */

public class Principal {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		int num,i,qtdd=0;
		
	    System.out.println("Informe um número interiro maior que 0:");
	    num = sc.nextInt();
	     	    
	    for(i = 1; i <= num ; i++) {
	        if (num % i==0){
	         qtdd = qtdd+1;
	        }
	    }
	        if(qtdd>2){
	          System.out.println("Não é primo");
	        } else if(qtdd==2){
	          System.out.println("É primo");
	        }
	}

}
