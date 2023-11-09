package Exercícios;

import java.util.Scanner;

public class SomaABC {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int a, b, c;
		
		System.out.println("Digite o valor A: ");
		a = leia.nextInt();
		System.out.println("Digite o valor B: ");
		b = leia.nextInt();
		System.out.println("Digite o valor C: ");
		c = leia.nextInt();
		
		int soma = a + b;
	
		if (soma > c) {
			System.out.println("O valor de A+B é maior que C! "); 
			
		} else if  (soma < c) {
			System.out.println("O valor de A + B é menor que C! ");  
		
		}else {
		System.out.println("O valor de A + B é igual que C! ");  }
			
			
		}
		

	}


