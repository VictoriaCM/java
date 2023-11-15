package exercicios;

import java.util.Scanner;

public class Exercicio_01 {

		static Scanner sc = new Scanner(System.in);
		
		public static void main(String[] args) {
			
			int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
			int numb, result = -1;
			
			System.out.println("Digite um numero: ");
			numb = sc.nextInt();
			
			for(int indice = 0; indice < vetor.length; indice ++) {
				if(vetor[indice] == numb)
					result = indice;
			}
			
			if(result == -1)
				System.out.printf("\n O numero %d não foi localizado.", numb);
			else
				System.out.printf("\n O numero %d foi localizado na posição %d.", numb, result);
		
		}

	}