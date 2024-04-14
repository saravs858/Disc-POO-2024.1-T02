package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a audiência do canal 4?");		
		int canal4 = sc.nextInt();
		System.out.println("Qual a audiência do canal 5?");
		int canal5 = sc.nextInt();
		System.out.println("Qual a audiência do canal 7");
		int canal7 = sc.nextInt();
		System.out.println("Qual a audiência do canal 12?");
		int canal12 = sc.nextInt();
		
		double soma = canal4 + canal5 + canal7 + canal12;
		
		double aud4 = canal4/soma;
		double aud5 = canal5/soma;
		double aud7 = canal7/soma;
		double aud12 = canal12/soma;
		
		System.out.println("A porcentagem da audiência do canal 4 é " + aud4*100 + "%");
		System.out.println("A porcentagem da audiência do canal 4 é " + aud5*100 + "%");
		System.out.println("A porcentagem da audiência do canal 4 é " + aud7*100 + "%");
		System.out.println("A porcentagem da audiência do canal 4 é " + aud12*100 + "%");
	}

}
