package turma30;

import java.util.Scanner;
public class Atividade4Lista2 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	int idade;
	char sexo;  
	char opcoes; 
	int contadorPessoas = 0 ;
	char op = 'S' ;
	final  int  LIMITE_PESSOAS_ENTREVISTADAS = 150 ;

	int numeroPessoasCalmas = 0 ;
	int numeroMulheresNervosas = 0 ;
	int numeroHomensAgressivos = 0 ;
	int numeroOutrosCalmos = 0 ;
	int numeroPessoasNervosasMais40Anos = 0 ;
	int numeroPessoasCalmasMenos18Anos =  0 ;

	// ENTRADAS

	while (contadorPessoas <  LIMITE_PESSOAS_ENTREVISTADAS  && op == 'S' ) {

		System.out.print( " Digite a idade: " );
		idade = leia . nextInt ();
		System.out.print( " Digite \n 1-feminino \n 2-masculino \n 3-Outros: " );
		sexo = leia . next() . charAt ( 0 );
		System.out.print( " Digite a opção \n 1 - pessoa calma \n 2 - pessoa nervosa \n 3 - pessoa agressiva: " );
		opcoes = leia . next () . charAt ( 0 );
		contadorPessoas ++ ;
		System.out.printf( " Continua S / N: " );
		op = leia . next () . toUpperCase () . charAt ( 0 );

		if (opcoes ==  '1' ) {
			numeroPessoasCalmas ++ ;
		}

		if (sexo == '1'  && opcoes ==  '2' ) {
			numeroMulheresNervosas ++ ;
		}

		if (sexo == '2'  && opcoes ==  '3' ) {
			numeroHomensAgressivos ++ ;
		}

		if (sexo == '3'  && opcoes ==  '1' ) {
			numeroOutrosCalmos ++ ;
		}

		if (opcoes ==  '2'  && idade >  40 ) {
			numeroPessoasNervosasMais40Anos ++ ;
		}

		if (opcoes == '1'  && idade <  18 ) {
			numeroPessoasCalmasMenos18Anos ++ ;
		}

	}
		System.out.println( " Pessoas calmas " + numeroPessoasCalmas);
		System.out.println( " Homens agressivos " + numeroHomensAgressivos);
		System.out.println( " Outros calmos " + numeroOutrosCalmos);
		System.out.println( " Pessoas nervosas acima 40 anos " + numeroPessoasNervosasMais40Anos);
		System.out.println( " Pessoas acalmas abaixo de 18 anos " + numeroPessoasCalmasMenos18Anos);
  }
	
}



