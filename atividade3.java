package turma30;
import java.util.Scanner;
public class atividade3 {
	
		public static void main(String args[]) {
			Scanner leia = new Scanner(System.in);
			
		int idade;
		
		 System.out.println("digite a idade por favor: ");
   	  		idade=leia.nextInt();
  
   	  		if(idade>=10 && idade<=14) {
   	  		System.out.println("Você é Infantil: ");
   	  		}
   	  		
   	  		else if (idade>=15 && idade <=17){
   	  		System.out.println("Você é Juvenil: ");
   	  		}
   	  		
   	  		else if (idade>=18 && idade <=25){
   	  		System.out.println("Você é adulto: ");
   	  		}
   	  	 
   	  		else {
   	  		System.out.println("idade invalida: ");
   	  			
   	  	
   	  		}
  }
}