import java.util.Scanner;
public class atividade1 { 
    
    public static void main(String args[]) {
    	  Scanner leia = new Scanner(System.in);

    	  int numero1, numero2 , numero3 ;
    	  int maiorN=0;
    	  
    	  System.out.println("digite um numero");
    	  numero1=leia.nextInt();
    	  System.out.println("digite um numero");
    	  numero2=leia.nextInt();
    	  System.out.println("digite um numero");
    	  numero3=leia.nextInt();
    	  
    	  if(numero1 > numero2) {
    		  if(numero1 > numero3 );
    		  		maiorN=numero1;
    	}
    	  
    	  else {
    	  
    	 		if(numero2 > numero1 + numero3);
    	 		
    	 		    maiorN = numero2;
    	 		     
    	  }
    	  
    		  if (numero3 > numero1 + numero2);
    		      maiorN= numero3;
    		      
    		      
    		      System.out.println("o maior numero é: "+ maiorN);	      
    	  }
    	  
    	  	    		
    	 			
     }
    	  



