package turma30;

import java.util.Scanner;
public class Atividade2Lista2 {
	
	 public static void main(String args[]) {
		  Scanner leia = new Scanner(System.in);
		  
		  int numero = 10, numeroP = 0, numeroI= 0;
		  
		  for(int numero1=1; numero1<=10;numero1++) {
			  System.out.println("digite um Numero pfvr: ");
				 numero=leia.nextInt();
				 
				 if(numero%2==0) {
					numeroP++;
				}
				 if (numero% 2 == 1) {
		                numeroI++ ;
			  }
				 
		  }
		  
		  		System.out.printf(" Foram digitados pares : %d \n " ,  numeroP );
		  		System.out.printf("Foram digitados impares : %d", numeroI);
		  		
		  		
		   
	 }
}
