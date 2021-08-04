package turma30;

import java.util.Scanner;
public class Atividade3Lista2 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
		 
		 int idade = 0, contadormenorDe21 = 0, contadormaiorDe50 = 0;
		 
		 System.out.printf("Informe -99 para parar\n\n ");
		 
		 while(idade !=-99) {
			 System.out.printf("Informe idade: ");
			  idade = leia.nextInt();
			  if(idade<21) {
			  contadormenorDe21 = contadormenorDe21+1; 
			}
			  if(idade>50) {
			  contadormaiorDe50 = contadormaiorDe50+1; 
			}
		 }
		 System.out.printf("Idade menor que 21 : %d\n", contadormenorDe21 );
		 System.out.printf("Idade maior que 50 : %d\n\n", contadormaiorDe50);
		 
		
	}

}
