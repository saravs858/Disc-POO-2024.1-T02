package br.edu.principal;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira nota");
		float nota1 = sc.nextFloat();
		System.out.println("Digite a segunda nota");
		float nota2 = sc.nextFloat();
		
		float media = (nota1 + nota2)/2;
		
		System.out.println("A média final é " + media);
		
		if (media >= 0 && media < 3) {
			System.out.println("Você foi reprovado");
		} else if (media >= 3 && media < 7) {
			System.out.println("Você terá que passar por um exame");
		} else if (media >= 7 && media <= 10) {
			System.out.println("Você foi aprovado");
		}
	}

}
