package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Digite sua primeira nota: ");
	double nota1 = sc.nextDouble() ;
	System.out.println("Digite sua segunda nota: ");
	double nota2 = sc.nextDouble() ;
	System.out.println("Digite sua terceira nota: ");
	double nota3 = sc.nextDouble() ;
	double media = (nota1+nota2+nota3)/3;
	System.out.println(" Sua média Aritmética é: " + media);
	
	if (media>=0 && media<3){
	 System.err.println("Reprovado");
	}
	else if (media>=3 && media<7){
		double notaexame = (12 - media);
		System.out.println("Você deve tirar: " + notaexame + " para ser aprovado");
	} 
	
	 if (media>=7 && media<=10){
	 System.out.println("APROVADO, parabéns!");
	 }
	
	
	
	
	
	
	
	
	
	
	} 
	}
