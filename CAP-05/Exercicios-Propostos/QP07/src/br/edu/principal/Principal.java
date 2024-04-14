package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double qtp, peso, idd, alt, midade,mediaalt,mpeso;
		qtp=0;
		midade=0; mediaalt=0; mpeso=0;
		idd=0;alt=0;
		for (qtp=1;qtp<=5;qtp++) {
			System.out.println("Digite seu peso: ");
			peso=sc.nextDouble();
			System.out.println("Digite sua altura: ");
			alt=sc.nextDouble();
			System.out.println("Digite sua idade: ");
			idd=sc.nextDouble();
		 midade= midade + idd;
		 mediaalt= mediaalt+alt;
		 mpeso= mpeso + peso ;
		}
		midade= midade/5;
		mediaalt= mediaalt/5;
		mpeso= mpeso/5;
		System.out.println("A media de idade é: " + midade);
		System.out.println("A media de altura é: " + mediaalt);
		System.out.println("A media de peso é: " + mpeso);
	}

}
