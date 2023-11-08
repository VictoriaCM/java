package aula_02;

import java.util.Scanner;

public class Salario_total {
static Scanner leia = new Scanner(System.in);
	
public static void main(String[] args) {
		
		
			float salariob, noturnoa, extrash, descont;
			
			System.out.println("Digite o valor do Salário: "); 
				salariob = leia.nextFloat();
			System.out.println("Digite o valor do Adicional Noturno: "); 
				noturnoa = leia.nextFloat();
			
			System.out.println("Digite o valor das Horas Extras: "); 
				extrash = leia.nextFloat();
			System.out.println("Digite os descontos: "); 
				descont = leia.nextFloat();
				
			System.out.println("Salário Líquido: " + (salariob + noturnoa + (extrash*5) - descont));
				

	}

}
