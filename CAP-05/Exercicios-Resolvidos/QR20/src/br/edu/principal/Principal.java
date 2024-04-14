package br.edu.principal;

import java.util.Scanner;

/** QR20- Faça um programa para ler o código, o sexo (M — masculino; F — feminino) e o número de horas/
aula dadas mensalmente pelos professores de uma universidade, sabendo-se que cada hora/aula vale
R$ 30,00. Emita uma listagem contendo o código, o salário bruto e o salário líquido (levando em
consideração os descontos explicados a seguir) de todos os professores. Mostre também a média dos
salários líquidos dos professores do sexo masculino e a média dos salários líquidos dos professores do
sexo feminino. Considere:
■■ desconto para homens, 10%, e, para mulheres, 5%;
■■ as informações terminarão quando for lido o código = 99999. **/

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	    double quantDeProf,salB,salL,mediaM;
	    double mediaF,hora,totalSalarioF = 0,totalSalarioM = 0;
	    char sexo ;
	    int cod;
	 
	    System.out.print("Digite o código do professor (ou 99999 para sair): ");
	    cod = sc.nextInt();
	    
	    int contF = 0,contM = 0;
	    
	    
	    while(cod != 99999){   
	      
	      System.out.print("Digite o sexo do professor (M/F): ");
	      sexo = sc.next().charAt(0);

	      System.out.print("Digite o número de horas/aula mensais: ");
	      hora = sc.nextDouble();

	      salB = hora * 30.0;
	      if (sexo == 'M') {
	          salL = salB - (salB * 0.10);
	          totalSalarioM += salL;      
	          contM++;
	      } else if (sexo == 'F') {
	          salL = salB - (salB * 0.05);
	          totalSalarioF += salL;
	          contF++;
	      } else {
	          System.out.println("Sexo inválido! Digite M ou F.");
	          continue;
	      }
	      System.out.println("Código: " + cod);
	          System.out.println("Salário bruto: R$" + salB);
	          System.out.println("Salário líquido: R$" + salL);
	          
	     System.out.print("Digite o código do professor (ou 99999 para sair): ");
	  	 cod = sc.nextInt();
	      
	    }

	      if (contM > 0) {
	          double mediaSalM = totalSalarioM / contM;
	          System.out.println("Média dos salários líquidos dos professores do sexo masculino: R$" + mediaSalM);
	      } else {
	          System.out.println("Não há professores do sexo masculino.");
	      }

	      if (contF > 0) {
	          double mediaSalF = totalSalarioF / contF;
	          System.out.println("Média dos salários líquidos dos professores do sexo feminino: R$" + mediaSalF);
	      } else {
	          System.out.println("Não há professoras do sexo feminino.");
	      }
	    }
    }
