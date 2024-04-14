package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		 int opcao = 0;
		 System.out.println("Digite o numero correspondente a opção desejada (1.imposto, 2.novo salário, 3.classificação): ");
		 opcao = sc.nextInt();
		 double imposto1, imposto2, imposto3, diminui1, diminui2, diminui3 ;

		    if ( opcao == 1) {
		       int salario = 0;
		       System.out.println("Qual o valor do seu salário?");
		       salario = sc.nextInt();
		          if (salario < 500){
		           imposto1= salario * 5/100 ;
		           diminui1 =  salario * 95/100 ;
		        System.out.printf("O valor do seu imposto foi de :" + imposto1 + " e o valor do seu novo salário foi de: "+ diminui1);
		          }
		           else if (salario >=  500 && salario <= 850){
		             imposto2 = salario * 10/100 ;
		              diminui2 =  salario * 90/100 ;
		              System.out.printf("O valor do seu imposto foi de :" + imposto2 + " e o valor do seu novo salário foi de: " + diminui2);
		      }
		           else if (salario > 850){
		             imposto3= salario * 15/100 ;
		              diminui3 =  salario * 85/100 ;
		              System.out.printf("O valor do seu imposto foi de :" + imposto3 + " e o valor do seu novo salário foi de: " + diminui3 );
		           }
		 } else if (opcao == 2){
		   double sal, novosa1 , novosa2, novosa3, novosa4;
		   System.out.printf("Digite o valor do seu salário:") ;
		   sal = sc.nextDouble();
		  if (sal > 1500){
		    novosa1 = sal + 25;
		    System.out.printf("O seu novo salário é de: " + novosa1);
		  } else if (sal >=750 &&  sal <=1500){
		      novosa2 = sal + 50;
		      System.out.printf("O seu novo salário é de: " + novosa2);    } else if (sal >= 450 && sal < 750){
		      novosa3 = sal + 75;
		     System.out.printf("o seu novo salário é de: " + novosa3);
		  } else if (sal < 450){
		    novosa4 = sal + 100;
		    System.out.printf("O seu novo salário é de: " + novosa4);
		  }
		}  
		else if(opcao == 3){
		  double salar ;
		  System.out.printf("Digite o valor do seu salário:");
		  salar = sc.nextDouble();
		  if( salar <= 700){
		    System.out.println( "Classificação: mal remunerado");
		  }
		   else if( salar > 700){
		    System.out.println( "Classificação: bem remunerado");
		  }
		}
		    else{
		      System.out.println("Escolha uma das opções recomendadas.");
		    }


	}

}
