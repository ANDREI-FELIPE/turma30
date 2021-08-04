package turma30;

import java.util.Scanner;
public class Atividade6Lista2 {

	public static void main(String[] args) {
	 Scanner leia = new Scanner(System.in);
	 
	 int numero = 1 , soma=0;
	 double media = 0, contador = 0;
	 
	 	while(numero != 0) {
	 		System.out.printf("\n DIGITE UM NUMERO INTEIRO: ");
	 		numero = leia.nextInt(); 
	 		
	 		if((numero %3)==0 && numero!=0){
	 			soma = soma + numero;
	 				contador++;
	 		}
	 	}
	 		media = soma/contador;
	 		System.out.printf("\n\n A media dos numeros e: %3.2f ",media);
	 		
		

	}

}
