package exercicios;

import java.util.Scanner;

public class Exercicio_3 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		//Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), via teclado e mostre na tela 
		int under21 = 0, upper50 = 0, age = 0;
		
		
		// A leitura dos dados deve ser finalizada ao digitar uma idade negativa.
		while(!(age < 0)) {			
			System.out.println("Digite uma idade: ");
			age = sc.nextInt();
			
		//o total de pessoas cuja idade seja menor que 21 anos e o 
			if(age >= 0 && age < 21) {
				under21++;
		//total de pessoas cuja idade seja maior que 50 anos.
			} else if(age > 50) {
				upper50++;
		}
		}
		
		System.out.printf("Total de pessoas menores de 21 anos: %d\n", under21);
		System.out.printf("Total de pessoas maiores de 50 anos: %d", upper50);
	}

}