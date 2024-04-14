package br.edu.principal;

import java.util.Scanner;

/** QR15 - Faça um programa que receba o valor do salário mínimo, o número de horas trabalhadas, o número
de dependentes do funcionário e a quantidade de horas extras trabalhadas. Calcule e mostre o salário
a receber do funcionário de acordo com as regras a seguir:
■■ O valor da hora trabalhada é igual a 1/5 do salário mínimo.
■■ O salário do mês é igual ao número de horas trabalhadas multiplicado pelo valor da hora traba-
lhada.
■■ Para cada dependente, acrescentar R$ 32,00.
■■ Para cada hora extra trabalhada, calcular o valor da hora trabalhada acrescida de 50%.
■■ O salário bruto é igual ao salário do mês mais o valor dos dependentes mais o valor das horas
extras.
■■ Calcular o valor do imposto de renda retido na fonte de acordo com a tabela a seguir: 
■■ O salário líquido é igual ao salário bruto menos IRRF.
■■ A gratificação é de acordo com a tabela a seguir:
■■ O salário a receber do funcionário é igual ao salário líquido mais a gratificação.**/

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    double salariomin, horatrab, ndependente,dependente ,horaextra, vhoraextra,imposto,salarioL, salarioFim;
	   
	    System.out.println("Digite o valor do seu salário:");
	    salariomin = sc.nextDouble();

	    System.out.println("Digite quantas horas vc trabalhou:");
	    horatrab = sc.nextDouble();

	    System.out.println("Digite o número de dependentes:");
	    ndependente = sc.nextDouble();

	    System.out.println("Digite quantas horas extras vc trabalhou:");
	    horaextra = sc.nextDouble();

	    double valorHoraTra = salariomin/5;
	    double salarioMes = valorHoraTra * horatrab;
	    dependente = ndependente * 32.00;
	    vhoraextra = horaextra * (valorHoraTra * 1/2 + valorHoraTra);
	    double salarioBruto = salarioMes + dependente + vhoraextra;

	    if(salarioBruto < 200){
	      imposto = 0;
	        salarioL = salarioBruto - imposto;
	    
	        if (salarioL <= 350){
	          salarioFim = salarioL + 100;
	          System.out.println("Seu salário final é: " + salarioFim);
	        } else if (salarioL > 350){
	          salarioFim = salarioL + 50;
	          System.out.println("Seu salário final é: " + salarioFim);
	        }
	    } else if (salarioBruto >= 200 && salarioBruto <=500){
	    	imposto = salarioBruto*10/100;
	    	salarioL = salarioBruto - imposto;
	      
	    		if (salarioL <= 350){
	    			salarioFim = salarioL + 100;
	    			System.out.println("Seu salário final é: " + salarioFim);
	    		} else if (salarioL > 350){
	    			salarioFim = salarioL + 50;
	    			System.out.println("Seu salário final é: " + salarioFim);
	    		}
	    } else if (salarioBruto > 500){
	    	imposto = salarioBruto*20/100;
	    	salarioL = salarioBruto - imposto;
	    		if (salarioL <= 350){
	    			salarioFim = salarioL + 100;
	    			System.out.println("Seu salário final é: " + salarioFim);
	    		} else if (salarioL > 350){
	    			salarioFim = salarioL + 50;
	    			System.out.println("Seu salário final é: " + salarioFim);
	   		}
	 	}
	}
}
