package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha um dia");
		byte dia = sc.nextByte();
		System.out.println("Escolha um mês");
		byte mes = sc.nextByte();
		System.out.println("Escolha um ano");
		short ano = sc.nextShort();
		if (mes == 1) {
			System.out.println("janeiro");
		} else if (mes == 2) {
			System.out.println("Fevereiro");
		} else if (mes == 3) {
			System.out.println("Março");
		} else if (mes == 4) {
			System.out.println("Abril");
		} else if (mes == 5) {
			System.out.println("Maio");
		} else if (mes == 6) {
			System.out.println("Junho");
		} else if (mes == 7) {
			System.out.println("Julho");
		} else if (mes == 8) {
			System.out.println("Agosto");
		} else if (mes == 9) {
			System.out.println("Setembro");
		} else if (mes == 10) {
			System.out.println("Outubro");
		} else if (mes == 11) {
			System.out.println("Novembro");
		} else if (mes == 12) {
			System.out.println("Dezembro");
		}
		
		System.out.println(dia + "/" + mes + "/" + ano);
		
		System.out.println("Escolha uma hora");
		byte hora = sc.nextByte();
		System.out.println("Escolha um minuto");
		byte minuto = sc.nextByte();
		System.out.println(hora + ":" + minuto);
	}

}
