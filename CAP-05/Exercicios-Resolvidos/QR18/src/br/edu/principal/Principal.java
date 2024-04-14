package br.edu.principal;

import java.util.Scanner;

/**QR18- Faça um programa que leia um conjunto não determinado de valores e mostre o valor lido, seu quadra-
*do, seu cubo e sua raiz quadrada. Finalize a entrada de dados com um valor negativo ou zero. */

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    double quad = 0, cubo = 0, raiz = 0;
	    
	    System.out.println("Digite um número diferente de zero:");
	    int num = sc.nextInt();
	  
	    for(; num > 0 ; num--){
	      quad = num*num;
	      cubo = quad*num;
	      raiz = Math.sqrt(num);
	      System.out.println("O número digitado foi: "+ num + ", seu quadrado vale: "+ quad+ ", seu cubo vale: "+ cubo+ " e sua raíz é: "+ raiz );
	    }
   
	}

}
