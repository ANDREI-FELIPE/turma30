package turma30;

import java.util.Scanner;
public class Atividade5Lista2 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
		 
		 int numero = 0 ;

		 int soma = 0;

		 do {
			 System.out.printf("Digite um numero\n");
			 numero = leia.nextInt();
			 soma += numero;

		 }
		     while (numero != 0);
		 
			 System.out.printf("Soma = %d", soma);
		 
		 
	}

}
