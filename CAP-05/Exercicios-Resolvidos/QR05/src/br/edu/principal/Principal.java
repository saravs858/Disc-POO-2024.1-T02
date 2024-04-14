package br.edu.principal;
import java.util.Scanner;
import java.math.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha o valor de x");
		double x = sc.nextDouble();
		System.out.println("Escolha o número de termos");
		int num_termos = sc.nextInt();
		
		int expoente = 2;
		int divisor = 1;
		double s = 0;
		
		boolean subindo = true;
		
		for (int i = 1; i <= num_termos; i++) {
			int fat = 1;
			for (int j = 1; j <= i; j++) {
				fat = fat * j;
			}
			if (expoente%2 == 0) {
				s = s - (Math.pow(x, expoente)/fat);
			} else {
				s = s + (Math.pow(x, expoente)/fat);
			}
			expoente = expoente + 1;
			if (subindo == true) {
				divisor = divisor + 1;
			} else {
				divisor = divisor - 1;
			}
			if (divisor == 4 && subindo == true) {
				subindo = false;
			} else if (divisor == 1 && subindo == false) {
				subindo = true;
			}
			
			
					
		}
		System.out.println("O valor de s é " + s);
		
	}

}
