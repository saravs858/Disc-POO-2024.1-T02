package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
     int i, numtermos, num1, num2, num3;
     numtermos = 15;
     num1 = 2;
     num2 = 7;
     num3 = 3;
     System.out.print(" " + num1);
     System.out.print(" " + num2);
     System.out.print(" " + num3);
     i = 4;
     while(i!=numtermos){
    	 num1 = num1*2;
    	 System.out.print( " " + num1);
    	 i = i+1;
    	 if (i!=numtermos) {
    	 num2=num2*3;
    	 System.out.print(" " + num2);
    	 i = i+1;}
    	 if (i != numtermos){
    		 num3 = num3*4;
    		 System.out.print(" " + num3);
    		 i= i+1;
    	 }
     }
	
	}
}
