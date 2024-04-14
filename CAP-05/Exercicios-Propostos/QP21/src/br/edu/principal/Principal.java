package br.edu.principal;

import java.util.Scanner;

/** QP21-Em uma eleição presidencial existem quatro candidatos. Os votos são informados por meio de código.
Os códigos utilizados são:

1, 2, 3, 4 Votos para os respectivos candidatos
5 Voto nulo
6 Voto em branco

Faça um programa que calcule e mostre:
■■ o total de votos para cada candidato;
■■ o total de votos nulos;
■■ o total de votos em branco;
■■ a porcentagem de votos nulos sobre o total de votos; e
■■ a porcentagem de votos em branco sobre o total de votos.
Para finalizar o conjunto de votos, tem-se o valor zero e, para códigos inválidos, o programa deverá
mostrar uma mensagem.**/

public class Principal {

	public static void main(String[] args) {
		int cont1=0,cont2=0,cont3=0,cont4=0,branco=0,nulo=0,total=0;
		   double porcenNulo,porcenBranco;
		    while(true){
		      Scanner sc = new Scanner(System.in);
		    System.out.println("Digite o número do seu candidato(1,2,3,4,5-nulo,6-branco): ");
		     int voto = sc.nextInt();
		     
		      if(voto ==1){
		        cont1++ ;
		        total++ ;
		      }
		      else if(voto ==2){
		        cont2++ ;
		        total++ ;
		      }
		      else if(voto ==3){
		        cont3++ ;
		        total++ ;
		      }
		      else if(voto ==4){
		        cont4++ ;
		        total++ ;
		      }
		      else if (voto == 5){
		        nulo++;
		        total++;
		      }
		      else if (voto == 6){
		        branco++;
		        total++;
		      }
		      else{
		        break;
		      }
		    }
		     System.out.println("O total de votos para o candidato 1 foi:" + cont1);
		     System.out.println("O total de votos para o candidato 2 foi:" + cont2);
		     System.out.println("O total de votos para o candidato 3 foi:" + cont3);
		     System.out.println("O total de votos para o candidato 4 foi:" + cont4);
		    porcenNulo= nulo*100/total;
		    System.out.println("A porcentagem de votos nulos sobre o total foi:" + porcenNulo);
		    porcenBranco= branco*100/total;
		    System.out.println("A porcentagem de votos brancos sobre o total foi de:"+ porcenBranco);
  }

}

