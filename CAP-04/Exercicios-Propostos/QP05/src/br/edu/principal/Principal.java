package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    double n1,n2,resultado;
	   
	    System.out.println("Digite um primeiro número:");
	    n1 = sc.nextDouble();
	 
	    System.out.println("Digite um segundo número:");
	    n2 = sc.nextDouble();
	    
	    System.out.println("Escolha uma opção(1,2,3,4):");
	    double escolha =sc.nextDouble();
	    
	    if( escolha == 1){
	      resultado = (n1 + n2)/2;
	      System.out.println("A média foi de:" + resultado);
	    }
	    else if (escolha == 2){
	       if (n1>n2){
	         resultado= n1-n2;
	           System.out.println("A diferença foi de:" + resultado);
	       }
	      else if (n2>n1){
	        resultado = n2-n1;
	         System.out.println("A diferença foi de:" + resultado);
	       }
	    }
	     else if(escolha==3){
	      resultado=(n1*n2);
	      System.out.println("O produto foi de:"+ resultado);
	    }
	   else if(escolha == 4){
	     if (n2!=0){
	       resultado=n1/n2;
	       System.out.println("A divisão foi de:" + resultado); }
	        else if(n2==0){
	       System.out.println("Não foi possível efetuar a divisão");
	       
	     }
	     
	   }

	}

}
