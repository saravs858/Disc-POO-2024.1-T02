package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		  System.out.println("Digite a nota do trabalho de laboratorio: ");
			int notaTrabalho = sc.nextInt();
		  System.out.println("Digite a nota da avaliação semestral: ");
		 int avalSemestral = sc.nextInt();
		 System.out.println("Digite a nota do exame final: ");
		 int exame = sc.nextInt();
		 System.out.println("Digite a nota do trabalho de laboratorio: ");
		 int medianum = (notaTrabalho*2 + avalSemestral*3+ exame*5)/10;
		 System.out.println("A media ponderada é: " + medianum);
		 
		    if (medianum >= 8 && medianum<=10) {
		    	System.out.println("Obteve conceito A") ;
		    }else if (medianum >= 7 && medianum<8) {
			    	System.out.println("Obteve conceito B") ;
		    }if (medianum >= 6 && medianum <7) {
				    	System.out.println("Obteve conceito C");
			     } else if (medianum >= 5 && medianum<6) {
		    	System.out.println("Obteve conceito D");
		    	             }
			     if (medianum >= 0 && medianum<5) {
		    	System.out.println("Obteve conceito E");
		    	}
		    
		    }
	}

