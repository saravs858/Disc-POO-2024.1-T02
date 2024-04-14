package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int cont, codigo, nht, valor;
	int salMin, salInicial,aux,salF;
	String turno, categoria;
	salMin=450;
	for (cont = 1; cont<=10; cont++){
		System.out.println("Digite seu código: ");
		codigo = sc.nextInt();
		System.out.println("Digite seu numero de horas trabalhadas: ");
		nht = sc.nextInt();
		System.out.println("Digite seu turno(M, V ou N): ");
		turno = sc.next();
		System.out.println("Digite sua categoria(G ou O): ");
		categoria = sc.next();
	  if (turno != "M" && turno !="V" && turno != "N"){
		System.err.println("Esse turno é invalido "+turno);
		else if (categoria!= "G" && categoria!="O"){
		System.err.println("Essa categoria é invalida "+categoria);
     if (turno == "N") {
			valor = (salMin*18)/100;
	    }else {
            valor = (salMin*15)/100;
			}
	 }else{
		if (turno == "N") {
				valor = (salMin*13)/100;
		}else{
				valor = (salMin * 10)/100;
			}
	}
    salInicial = nht * valor;
     if (salInicial<=300) {
	 	aux = (salInicial*20)/100;
    }else if (salInicial<600) {
    	aux = (salInicial*15)/100;
    }else {
    	aux = (salInicial*5)/100;
    }
	salF = salInicial + aux;
	System.out.println("Seu codigo é: " + codigo);
	System.out.println("Seu numero de horas trabalhadas é: " + nht);
	System.out.println("O valor das horas trabalhadas é: " + valor );
	System.out.println("Seu Salario Inicial era: " + salInicial);
	System.out.println("Seu auxilio alimentação é: " + aux);
	System.out.println("Seu Salario Final é: " + salF);
	}
	
	}