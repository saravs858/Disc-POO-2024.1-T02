package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade, tot_f, tot_m, soma1, cont_m1, cont_m2, tot, 
		cont_f1, media_idade, perc, menor_idade;
		char sexo, exp;
		
		tot = 0; tot_f = 0; tot_m = 0; soma1 = 0; cont_m1 = 0; cont_m2 = 0; cont_f1 = 0; menor_idade = 0;
		
		System.out.print("Digite a idade do funcionario: ");
		idade = sc.nextInt();
		
		while (idade != 0) {
			System.out.print("Digite o sexo do funcionario (M - Masculino ou F - Feminino): ");
			sexo = sc.next().charAt(0);
			System.out.print("O funcionario tem experiencia (S - Sim ou N - Não): ");
			exp = sc.next().charAt(0);
			
			if (sexo == 'F' && exp == 'S') {
				if (tot == 0) {
					menor_idade = idade;
					tot = 1;
				}
				else if (idade < menor_idade) {
					menor_idade = idade;
				}
			}
			
			if (sexo == 'M') {
				tot_m = tot_m + 1;
			}
			
			if (sexo == 'F') {
				tot_f = tot_f + 1;
			}
			
			if (sexo == 'F' && idade < 21 && exp == 'S') {
				cont_f1 = cont_f1 + 1;
			}
			
			if (sexo == 'M' && idade > 45) {
				cont_m1 = cont_m1 + 1;
			}
			
			if (sexo == 'M' && exp =='S') {
				soma1 = soma1 + idade;
				cont_m2 = cont_m2 + 1;
			}
			
			System.out.print("Digite a idade do proximo funcionario ou digite 0 para sair: ");
			idade = sc.nextInt();
		}
		
		System.out.println("O numero de candidatas do sexo feminino é: " + tot_f);
		System.out.println("O numero de candidatos do sexo masculino é: " + tot_m);
		
		if (cont_m2 == 0) {
			System.out.println("Nenhum homem com experiencia.");
		}
		else {
			media_idade = soma1 / cont_m2;
			System.out.println("A idade media dos homens com experiencia é: " + media_idade);
		}
		
		if (tot_m == 0) {
			System.out.println("Nenhum homem com mais de 45 anos.");
		}
		else {
			perc = (cont_m1 * 100) / tot_m;
			System.out.println("A porcentagem de homens com mais de 45 anos é: " + perc + "%");
		}
		
		System.out.println("O numero de mulheres com idade inferior a 21 e experiencia é: " + cont_f1);
		System.out.println("A menor idade entre mulheres que ja tem experiencia é: " + menor_idade);
	}

}
