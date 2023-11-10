package exercicios;

import java.util.Scanner;

public class Exercicio_1 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	int num1, num2;
		
				
	// Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, 
	System.out.println("Digite o primeiro número do intervalo: ");
	num1 = sc.nextInt();
	
	System.out.println("Digite o último número do intervalo: ");		
	num2 = sc.nextInt();
	
	//onde o primeiro número deve ser menor do que o segundo número.  
	if (num2 < num1) {
	//Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa. 
		System.out.println("Intervalo Inválido!");
		
	//No intervalo informado, mostre na tela todos os números que são múltiplos de 3 e 5.	
	} else {
		System.out.printf("No Intervalo entre %d e %d:\n", num1, num2);
		for (int cont = num1; cont <= num2; cont+=5) {
			if(cont % 3 == 0 && cont % 5 ==0) {
				System.out.printf("%d é multiplo de 3 e 5\n", cont);
			}
			
		}
	}
}

}