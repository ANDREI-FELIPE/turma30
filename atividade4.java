package turma30;

import java.util.Scanner;
public class atividade4 {

	 public static void main(String args[]) {
	   	  Scanner leia = new Scanner(System.in);
	   	  
	   	  double numero;
	   	  
	   	System.out.println("digite um numero: ");
		 numero=leia.nextInt();
		 
		 if(numero<0) {
			 	System.out.println("impossivel realizar, numero negativo ");
		 }
		 
		 else if(numero==0) {
			 System.out.println("zero � neutro ");
		 }
		 
		 else if((numero%2)==0) {
			 System.out.println("O numero � par ");
			 System.out.printf("a raiz quadrada de %.2f � %.2f ",numero,Math.sqrt(numero));
			 }
		 
		 else if((numero%2)==1) {
			 System.out.println("O numero � impar ");
			 System.out.printf("o numero %.2f ao quadrado � %.2f ",numero,Math.pow(numero, 2));
		 }
		 
		 }
		 
	}


