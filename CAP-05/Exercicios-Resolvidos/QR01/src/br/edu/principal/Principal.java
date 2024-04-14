package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario = 1000;
		System.out.println("Escolha o ano");
		int anoatual = sc.nextInt();;
		double percentagem = 1.5/100;
		double novosalario = salario + percentagem * salario;
		for (int i = 2007; i <= anoatual ; i++) {
			percentagem = 2 * percentagem;
			novosalario = novosalario + percentagem * novosalario;
		}
		System.out.println(novosalario);
		
		
	}

}
