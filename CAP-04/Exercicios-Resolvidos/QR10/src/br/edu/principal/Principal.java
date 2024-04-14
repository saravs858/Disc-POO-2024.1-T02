package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha o ano 1");
		short ano1 = sc.nextShort();
		System.out.println("Escolha o mês 1");
		byte mes1 = sc.nextByte();
		System.out.println("Escolha o dia 1");
		byte dia1 = sc.nextByte();
		
		System.out.println("Escolha o ano 2");
		short ano2 = sc.nextShort();
		System.out.println("Escolha o mês 2");
		byte mes2 = sc.nextByte();
		System.out.println("Escolha o dia 2");
		byte dia2 = sc.nextByte();
		
		String data1 = dia1 + "/" + mes1 + "/" + ano1;
		String data2 = dia2 + "/" + mes2 + "/" + ano2;
		
		if (ano1 > ano2) {
			System.out.println("a maior data é " + data1);
		} else if (ano2 > ano1) {
			System.out.println("a maior data é " + data2);
		} else if (mes1 > mes2) {
			System.out.println("A maior data é " + data1);
		} else if (mes2 > mes1) {
			System.out.println("A maior data é " + data2);
		} else if (dia1 > dia2) {
			System.out.println("A maior data é " + data1);
		} else if (dia2 > dia1) {
			System.out.println("A maior data é " + data2);
		} else {
			System.out.println("AS DATAS SÃO IGUAIS");
		}
	}

}
