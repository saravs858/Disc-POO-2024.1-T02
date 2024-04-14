package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double  conttime, contjog, idade, peso, alt, qtde, mediaidade, mediaalt,porc, tot80;
		qtde=0;
		tot80=0;
		mediaalt=0;
		for (conttime=1;conttime<=5;conttime++) {
			mediaidade=0;
			mediaalt=0;
			for(contjog=1;contjog<=11;contjog++) {
				System.out.println("digite sua idade: ");
				idade = sc.nextDouble();
				System.out.println("digite seu peso: ");
				peso = sc.nextDouble();
				System.out.println("digite sua altura: ");
				alt = sc.nextDouble();
				if (idade<=18) {
					qtde++;
				}
				mediaidade= mediaidade+idade;
				mediaalt= mediaalt+alt;
				if (peso<=80) {
						tot80++;
					}
	   mediaidade = mediaidade/11;
				}
			}
		   System.out.println("A quantidade de jogadores com idade inferior a 18 anos é: " + qtde);
	       mediaalt= mediaalt/55;
	       System.out.println("a media de altura é: " + mediaalt);
	       porc= (tot80*100)/55;
	       System.out.println("A media de jogadores com mais de 80kg é: " + porc);
		}
       
	}

