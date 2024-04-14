package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double cont, cod, num_vei, num_acid, maior = 0, cid_maior = 0, menor = 0, cid_menor = 0, media_vei, soma_vei, media_acid, soma_acid, cont_acid;
		soma_vei = soma_acid = cont_acid = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (cont = 1; cont <= 5; cont++) {
			cod = sc.nextDouble();
			num_vei = sc.nextDouble();
			num_acid = sc.nextDouble();
			if (cont == 1) {
				maior = num_acid;
				cid_maior = cod;
				menor = num_acid;
				cid_menor = cod;
			} else {
				if (num_acid > maior) {
					maior = num_acid;
					cid_maior = cod;
				}
				if (num_acid < menor) {
					menor = num_acid;
					cid_menor = cod;
				}
			}
			soma_vei = soma_vei + num_vei;
			if (num_vei < 2000) {
				soma_acid = soma_acid + num_acid;
				cont_acid = cont_acid + 1;
			}
		}
		System.out.println(maior);
		System.out.println(cid_maior);
		System.out.println(menor);
		System.out.println(cid_menor);
		media_vei = soma_vei/5;
		System.out.println(media_vei);
		if (cont_acid == 0) {
			System.out.println("não foi digitada uma cidade com menos de 2000 habitantes");
		} else {
			media_acid = soma_acid/cont_acid;
			System.out.println(media_acid);
		}
		

	}

}
