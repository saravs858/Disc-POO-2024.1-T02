package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod_est, cod_carga, peso_toneladas, peso_quilos, valor_total;
		int pre_carga = 0, imposto = 0;
		
		System.out.print("Digite o codigo do estado (1 à 5): ");
		cod_est = sc.nextInt();
		System.out.print("Digite o peso da carga (toneladas): ");
		peso_toneladas = sc.nextInt();
		System.out.print("Digite o codigo da carga (10 à 40): ");
		cod_carga = sc.nextInt();
		
		peso_quilos = peso_toneladas*1000;
		System.out.print("O peso da carga em quilos é: " + peso_quilos + "\n");
		
		if (cod_carga >= 10 && cod_carga <= 20) {
			pre_carga = 100 * peso_quilos;
		}
			else if (cod_carga >= 21 && cod_carga <= 30) {
				pre_carga = 250 * peso_quilos;
			}
				else if (cod_carga >= 31 && cod_carga <= 40) {
					pre_carga = 340 * peso_quilos;
				}
		System.out.print("O preço da carga é: " + pre_carga + "\n");
		
		if (cod_est == 1) {
			imposto = (35%100) * pre_carga;
		}
			else if (cod_est == 2) {
				imposto = (25%100) * pre_carga;
			}
				else if (cod_est == 3) {
					imposto = (15%100) * pre_carga;
				}
					else if (cod_est == 4) {
						imposto = (5%100) * pre_carga;
					}
						else if (cod_est == 5) {
							imposto = 0;
						}
		System.out.print("O preço do imposto é: " + imposto + "\n");
		
		valor_total = pre_carga + imposto;
		System.out.print("O valor total transpostado pelo caminhão é: " + valor_total);
		
	}
}