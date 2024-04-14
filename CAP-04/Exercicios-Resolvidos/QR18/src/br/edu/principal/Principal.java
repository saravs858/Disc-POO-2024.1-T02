package br.edu.principal;
/**QR18 - Dados três valores X, Y e Z, verifique se eles podem ser os comprimentos dos lados de um triângulo
e, se forem, verifique se é um triângulo equilátero, isósceles ou escaleno. Se eles não formarem um
triângulo, escreva uma mensagem. Considere que:
■■ o comprimento de cada lado de um triângulo é menor que a soma dos outros dois lados;
■■ chama-se equilátero o triângulo que tem três lados iguais;
■■ denomina-se isósceles o triângulo que tem o comprimento de dois lados iguais;
■■ recebe o nome de escaleno o triângulo que tem os três lados diferentes.**/

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int x, y, z;
		
		System.out.println("Informe a medida do primeiro lado do triângulo:");
		x = sc.nextInt();
		
		System.out.println("Informe a medida do segundo lado do triângulo:");
		y = sc.nextInt();
		
		System.out.println("Informe a medida do terceiro lado do triângulo:");
		z = sc.nextInt();
		
		if (x < y + z && y < x + z && z < y + x ) {
			
			if (x == y && y == z) {
				System.out.println("Triângulo Equilátero");
				} else if (x == y || y == z || z == x) {
					System.out.println("Triângulo Isósceles");
				} else if ( x != y && y != z && z != x) {
					System.out.println("Triângulo Escaleno");
				}
		} else {
			System.out.println("Isso não é um triângulo!");
		}
		
		
	
	}

}
