package br.edu.principal;

import java.util.Scanner;

/** QR19- Faça um programa que leia um número não determinado de pares de valores [m,n], todos inteiros e
positivos, um par de cada vez, e que calcule e mostre a soma de todos os números inteiros entre m e n
(inclusive). A digitação de pares terminará quando m for maior ou igual a n. **/

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int somaP=0,n,m, i;
	    
	   System.out.println("Digite o valor de m:");
	    m = sc.nextInt();
	    System.out.println("Digite o valor de n:");
	    n = sc.nextInt();
	    
	     if(m<0 || n<0) {
	       System.out.println("Os valores precisam ser positivos, digite novamente");
	     }          
	       
	     while(m<n){
	         somaP =0;
	         
	         for(i=m;i<=n;i++){
	           somaP= somaP+i;
	         }
     
	     System.out.println("A soma de números inteiros entre a e b é:" + somaP);
	    System.out.println("Digite o valor de M:");
	    m=sc.nextInt();
	    System.out.println("Digite o valor de N:");
	    n=sc.nextInt();
	       }

	}

}
