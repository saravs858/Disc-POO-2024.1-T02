package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int n1, n2, cont, res;
		n1 = 0;
		n2 = 1;
		System.out.print(n1+ "-");
		System.out.print(n2+ "-");
		for (cont = 3; cont<=8 ;cont++){
			System.out.print(n1 + "-");
			res = n1 + n2;
			n1 = n2;
			n2 = res;
		}
	}

}
