package exercicios;

import java.util.Scanner;

public class Exercicio_01 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] numv = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int number, result = -1;
		
		System.out.println("Digite o número que você deseja encontrar: ");
		 number = sc.nextInt();

		for (int indice = 0; indice < numv.length; indice++) {
			if (number == numv[indice]) 
				result=indice;}
		System.out.printf("O numero %d está localizado na posição: %d", number);
				
		{if(result != -1)

				System.out.printf("O numero não foi encontrado!");

			}

		}

}
