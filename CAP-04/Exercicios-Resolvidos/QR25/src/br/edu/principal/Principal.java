package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int angulo, voltas;
		
		System.out.print("Digite o angulo: ");
		angulo = sc.nextInt();
		
		if (angulo > 360 || angulo < -360) {
			voltas = angulo / 360;
			angulo = angulo % 360;
		}
		else {
			voltas = 0;
		}
		
		if (angulo == 0 || angulo == 90 ||angulo == 180 || angulo == 270 || angulo == 360 || 
				angulo == -90 || angulo == -180 || angulo == -270 || angulo == -360) {
			System.out.println("Está em cima de algum dos eixos.");
		}
		
		if ((angulo > 0 && angulo < 90) || (angulo < -270 && angulo > -360)) {
			System.out.println("1° quadrante.");
		}
		
		if ((angulo > 90 && angulo < 180) || (angulo < -180 && angulo > -270)) {
			System.out.println("2° quadrante.");
		}
		
		if ((angulo > 180 && angulo < 270) || (angulo < -90 && angulo > -180)) {
			System.out.println("3° quadrante.");
		}
		
		if ((angulo > 270 && angulo < 360) || (angulo < 0 && angulo > -90)) {
			System.out.println("4° quadrante.");
		}
		System.out.println(voltas + " volta(s) no quadrante.");
		
		if (angulo < 0) {
			System.out.println("Horario.");
		}
		else {
			System.out.println("Anti-Horario.");
		}
	}

}
