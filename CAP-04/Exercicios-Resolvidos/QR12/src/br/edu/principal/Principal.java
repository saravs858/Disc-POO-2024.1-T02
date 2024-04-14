package br.edu.principal;

import java.util.Scanner;

/** QR12 - Faça um programa que receba o código correspondente ao cargo de um funcionário e seu salário atual
e mostre o cargo, o valor do aumento e seu novo salário. Os cargos estão na tabela a seguir.

Código CArgo PErCENTuAL
1 Escriturário 50%
2 Secretário 35%
3 Caixa 20%
4 Gerente 10%
5 Diretor Não tem aumento
 * 
 */

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 double codigo, novos1, novos2, novos3, novos4, novos5, aumento1, aumento2, aumento3, aumento4, aumento5;
		 System.out.println("Digite o código de seu cargo (1 a 5):");
		 codigo = sc.nextDouble();
		   
		  double salarioatual = 0;
		     System.out.println("Digite o seu salário:");
		     salarioatual = sc.nextDouble();
		   
		 if (codigo ==1){
		 novos1 = salarioatual + (salarioatual* 50/100);
		 aumento1 = salarioatual* 50/100;
		   System.out.println("Olá, você é um escrituario, teve um aumento de " + aumento1 + " e seu novo salário é:" + novos1);
		 }
		 
		   else if (codigo ==2){
		     novos2 = salarioatual + (salarioatual* 35/100);
		     aumento2 = salarioatual* 35/100;
		       System.out.println("Olá, você é um secretário, teve um aumento de " + aumento2 + " e seu novo salário é:" + novos2);
		     }

		    else if (codigo ==4){
		       novos4 = salarioatual + (salarioatual* 10/100);
		       aumento4 = salarioatual* 10/100;
		         System.out.println("Olá, você é um gerente, teve um aumento de " + aumento4 + " e seu novo salário é:" + novos4);
		    }
		   
		   else if (codigo ==3){
		       novos3 = salarioatual + (salarioatual* 20/100);
		       aumento3 = salarioatual* 20/100;
		         System.out.println("Olá, você é um caixa, teve um aumento de " + aumento3 + " e seu novo salário é:" + novos3);
		  }
		     
		   else if (codigo == 5){
		       novos5 = salarioatual + 0 ;
		       aumento5 = 0;
		         System.out.println("Olá, você é um diretor, teve um aumento de " + aumento5 + " " + "e seu o seu salário continua:" + novos5);
		    }

	}

}
