package turma30;

import java.util.Scanner;
public class atividade2ofc {
	

	 public static void main(String args[]) {
	  Scanner leia = new Scanner(System.in);
   	  
	int num1, num2, num3;

	System.out.println("Numero 1: ");
	 num1=leia.nextInt();

	 System.out.println("Numero 2: ");
	 num2 =leia.nextInt();

	 System.out.println("Numero 3: ");
	 num3=leia.nextInt() ;

	if(num1 < num2) {
		if(num2 < num3) {
			System.out.println(num1+ "-"+ num2 + "-"+ num3);
		}
		else if(num1 < num3) {
			System.out.println(num1+ "-"+ num3 + "-"+ num2);
		}
		else {
			System.out.println(num3+ "-"+ num1 + "-"+ num2);
			
		}
	}
	
	else if(num2 < num3) {
		if(num1 < num3) {
		System.out.println(num2+ "-"+ num1 + "-"+ num3);
	}
		else {
		System.out.println(num2+ "-"+ num3 + "-"+ num1);
		}
		
	}	else {
			System.out.println(num3+ "-"+ num2+ "-"+ num1);
		}
	
 }
}