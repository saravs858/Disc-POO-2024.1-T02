package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    double salario, bonificacao1,bonificacao2, auxilio1,auxilio2, novos1, novos2, novosa1,novosa2,novosa3;
	    auxilio1 = 150;
	    auxilio2 = 100;
	    System.out.println("Digite o valor do seu salário:");
	    salario =sc.nextDouble();

	    if (salario <= 500 ){
	       bonificacao1 = salario * 5/100;
	       novos1= salario + bonificacao1;
	     
	          if(salario <= 500  && salario <= 600){
	          novosa1= novos1 + auxilio1;
	          System.out.printf("O seu novo salário acrescido da bonificação e do auxílio foi: " + novosa1);
	        }
	    }
	       
	   else if (salario > 500 && salario <=1200) {
	      bonificacao2 = salario *12/100;
	      novos2 = salario + bonificacao2;
	     
	      if (salario > 500 && salario <=1200  && salario <= 600){
	        novosa2= novos2 + auxilio1;
	        System.out.printf("O seu novo salário acrescido da bonificação é e do auxílio é: " + novosa2);
	      } else if (salario > 500 && salario <=1200  && salario > 600){
	          novosa2= novos2 + auxilio2;
	          System.out.printf("O seu novo salário acrescido da bonificação e do auxílio é: " + novosa2);
	        }
	    } else if (salario > 1200){
	      novosa3 = salario + auxilio2;
	    System.out.printf("O seu salário não teve bonificação, mas teve auxílio. Então o seu salário agora é: " + novosa3 );
	    }


	}

}
