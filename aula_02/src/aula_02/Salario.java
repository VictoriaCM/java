package aula_02;

import java.util.Scanner;

public class Salario {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		float salario, abono;
		
		System.out.println("Digite o Salário: "); 
			salario = leia.nextFloat();
		System.out.println("Digite o Abono: "); 
			abono = leia.nextFloat();
			
		System.out.println("O valor do seu novo salário é: " + (salario + abono));
			
		
		
		

	}

}
