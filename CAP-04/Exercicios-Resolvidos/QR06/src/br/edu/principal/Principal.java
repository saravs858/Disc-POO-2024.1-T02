package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha um n�mero inteiro");
		int num = sc.nextInt();
		float resto = num%2;
		if (resto == 0) {
			System.out.println("� par");
				
		} else {
			System.out.println("� �mpar");
		}
	}

}
