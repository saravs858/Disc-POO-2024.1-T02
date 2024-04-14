package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float op, sal, imp, aum, novo_sal;
		imp = 0; aum = 0;
		
		do {
			System.out.println("------------- MENU -------------");
			System.out.println("--- 1 - Imposto ----------------");
			System.out.println("--- 2 - Novo Salario -----------");
			System.out.println("--- 3 - Classificação ----------");
			System.out.println("--- 4 - Finalizar o Programa ---");
			
			System.out.print("Digite a opção desejada: ");
			op = sc.nextInt();
			
			if (op > 4 || op < 1) {
				System.out.println("Opção invalida ! \n");
			}
			
			if (op == 1) {
				System.out.print("Digite o seu salario: ");
				sal = sc.nextInt();
				
				if (sal < 500) {
					imp = (float) (sal * 0.05);
				}
				
				if (sal >= 500 && sal <= 850) {
					imp = (float) (sal * 0.10);
				}
				
				if (sal > 850) {
					imp = (float) (sal * 0.15);
				}
				
				System.out.println("O imposto sobre o seu salario é: " + imp + "\n");
			}
			
			if (op == 2) {
				System.out.print("Digite o seu salario: ");
				sal = sc.nextInt();
				
				if (sal > 1500) {
					aum = 25;
				}
				
				if (sal >= 750 && sal <= 1500) {
					aum = 50;
				}
				
				if (sal >= 450 && sal < 750) {
					aum = 75;
				}
				
				if (sal < 450) {
					aum = 100;
				}
				
				novo_sal = sal + aum;
				System.out.println("O seu novo salario é: " + novo_sal + "\n");
			}
			
			if (op == 3) {
				System.out.print("Digite o seu salario: ");
				sal = sc.nextInt();
				
				if (sal <= 700) {
					System.out.println("Mal remunerado.\n");
				}
				else {
					System.out.println("Bem remunerado. \n");
				}
			}
			
		} while (op != 4);

	}

}
