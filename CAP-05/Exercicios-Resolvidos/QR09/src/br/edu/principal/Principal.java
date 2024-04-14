package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cont, n1, n2, media, ta=0, te=0, tr=0;
	    double mediaclasse, totalclasse;
	    totalclasse = 0;
	    for (cont = 1;cont<6;cont++) {
	    System.out.println("Digite sua primeira nota: ");
	    n1 = sc.nextDouble();
	    System.out.println("Digite sua segunda nota: ");
	    n2 = sc.nextDouble();
	    media = (n1+n2)/2;
	    System.out.println("sua media é: " +  media);
	    if (media<=3) {
	    	tr++;
	    	System.err.println("REPROVADO!");
	    } 
	    if (media>3 && media<7) {
	    	te++;
	    	System.out.println("EXAME");
	    }
	    if (media>=7) {
	    	ta++;
	    	System.out.println("APROVADO!");
	    }
	    totalclasse= totalclasse + media;
	    System.out.println("total de alunos reprovados: " + tr);
	    System.out.println("total de alunos que vão fazer exame: " + te);
	    System.out.println("total de alunos aprovados: "+ ta);
	    System.out.println("A media da classe é: "+ totalclasse);
	}

}}
