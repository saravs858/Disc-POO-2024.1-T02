package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	   Scanner sc = new Scanner (System.in);
	   System.out.println("Digite sua primeira nota: ");
	   int N1= sc.nextInt();
	   System.out.println("Digite sua segunda nota: ");
	   int N2= sc.nextInt();
	   System.out.println("Digite sua terceira nota: ");
	   int N3= sc.nextInt();
	   System.out.println("Digite sua quarta nota: ");
	   int N4= sc.nextInt();
	   double media = (N1+N2+N3+N4)/4;
	    if (media>=7) {
	    	System.out.println("Aprovado!");
	    	System.out.println("Sua media foi: " + media);
	    } else {
	    	System.err.println("Reprovado");
	    	System.out.println("Sua media foi: " + media);
	    }
	}

}
