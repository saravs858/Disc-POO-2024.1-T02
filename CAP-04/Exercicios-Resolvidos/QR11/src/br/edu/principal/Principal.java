package br.edu.principal;

import java.util.Scanner;
/** QR11- "Faça um programa que receba a hora do início de um jogo e a hora do término (cada hora é composta por duas variáveis inteiras: hora e minuto). Calcule e mostre a duração do jogo (horas e minutos), sabendo que o tempo máximo de duração do jogo é de 24 horas e que ele pode começar em um dia e
terminar no dia seguinte."
**/

public class Principal {

	public static void main(String[] args) {
		
	  Scanner sc = new Scanner(System.in);
	  int horaInicio, minInicio, minFim, horaFim ,duracaoHora1, duracaoHora2, duracaoMin1, duracaoMin2;
	  System.out.println("Digite a hora que o jogo começou:");
	  horaInicio = sc.nextInt();
	  minInicio = horaInicio * 60;
		   
	  System.out.println("Digite a hora que o jogo teminou:");
	  horaFim = sc.nextInt();
	  minFim = horaFim * 60;
		   
	  if (minFim > minInicio) {
		  duracaoMin1 = minFim - minInicio;
		  duracaoHora1 = duracaoMin1 /60 ;
		  System.out.println("O jogo acabou em" +" "+ duracaoHora1 + "horas e" + " " + duracaoMin1 + "minutos." );
	  } else if (minFim < minInicio) {
		  duracaoMin2 = 1440-(minInicio - minFim);
		  duracaoHora2 = duracaoMin2 /60 ;
		  System.out.println("O jogo acabou em" +" " + duracaoHora2 + "horas e " + " " + duracaoMin2 + "minutos.");
	  }
		 
  }

}

