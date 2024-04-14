package br.edu.principal;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor para A");
		float A = sc.nextFloat();
		System.out.println("Digite um valor para B");
		float B = sc.nextFloat();
		System.out.println("Digite um valor para C");
		float C = sc.nextFloat();
		System.out.println("Digite um valor para I (1,2 ou 3)");
		int i = sc.nextInt();
		if (i == 1) {
			if (A>B && A>C) {
				if (B>C) {
					System.out.println(A + ">"+ B+ ">"+ C);
				} else {
					System.out.println(A + ">" + C + ">" + B);
				}
				
			} else if (B>A && B>C) {
				if (A>C) {
					System.out.println(B + ">" + A + ">"+ C);
				} else {
					System.out.println(B + ">" + C + ">" + A);
				}
			} else if (C>A && C>B) {
				if (A>B) {
					System.out.println(C + ">" + A + ">" + B);
				} else {
					System.out.println(C + ">" + B + ">"+ A);
				}
			}	
		}
		if (i == 2) {
			if (A<B && A<C) {
				if (B<C) {
					System.out.println(A + "<"+ B+ "<"+ C);
				} else {
					System.out.println(A + "<" + C + "<" + B);
				}
			}  else if (B<A && B<C) {
				if (A<C) {
					System.out.println(B + "<"+ A+ "<"+ C);
				} else {
					System.out.println(B + "<"+ C+ "<"+ A);
				}
			}  else if (C<A && C<B) {
				if (A<B) {
					System.out.println(C + "<"+ A+ "<"+ B);
				} else {
					System.out.println(C + "<"+ B+ "<"+ A);
				}
			}
				
		}
		if (i == 3) {
			if (A>B && A>C) {
				System.out.println(B + " " + A + " " + C);
			} else if (B>A && B>C) {
				System.out.println(A + " "+ B+ " "+ C);
			} else if (C>A && C>B) {
				System.out.println(A + " "+ C+ " "+ B);
			}
		}

	}
}
