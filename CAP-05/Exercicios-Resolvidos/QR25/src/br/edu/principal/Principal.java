package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float preco, imp, transp, seguro, fin, tot_imp, origem;
		char meio_t, carga;
		
		tot_imp = 0; transp = 0;
		
		System.out.print("Digite o preço do produto: ");
		preco = sc.nextInt();
		
		while (preco > 0) {
			System.out.print("Digite o pais de origem do produto (1 - Etados Unidos, 2 - Mexico e 3 - Outros): ");
			origem = sc.nextInt();
			System.out.print("Digite o meio de transporte do produto (T - Terrestre, F - Fluvial e A - Aereo): ");
			meio_t = sc.next().charAt(0);
			System.out.print("Digite se a carga é perigosa (S - Sim e N - Não): ");
			carga = sc.next().charAt(0);
			
			if (preco <= 100) {
				imp = (float) (preco * 0.05); 
			}
			else {
				imp = (float) (preco * 0.10);
			}
			
			if (carga == 'S') {
				if (origem == 1) {
					transp = 50;
				}
				if (origem == 2) {
					transp = 21;
				}
				if (origem == 3) {
					transp = 24;
				}
			}
			
			if (carga == 'N') {
				if (origem == 1) {
					transp = 12;
				}
				if (origem == 2) {
					transp = 21;
				}
				if (origem == 3) {
					transp = 60;
				}
			}
			
			if (origem == 2 || meio_t == 'A') {
				seguro = preco / 2;
			}
			else {
				seguro = 0;
			}
			
			fin = preco + imp + transp + seguro;
			tot_imp = tot_imp + imp;
			
			System.out.println("O valor do imposto do produto é: " + imp);
			System.out.println("O valor do transporte do produto é: " + transp);
			System.out.println("O valor do seguro do produto é: " + seguro);
			System.out.println("O preço final do produto é: " + fin + "\n");
			
			System.out.print("Digite o preço de outro produto ou 0 para sair: ");
			preco = sc.nextInt();
		}
		
		System.out.println("O total de impostos dos produtos é: " + tot_imp);

	}

}
