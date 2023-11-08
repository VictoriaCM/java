package aula_02;

import java.util.Scanner;

public class Produtodiff {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		float  numb1, numb2, numb3, numb4;
		
		System.out.println("Entre com o primeiro valor : ");
		numb1 = leia.nextFloat();
		
		System.out.print("Entre com o segundo valor: ");
		numb2 = leia.nextFloat();
		
		System.out.print("Entre com o terceiro valor: ");
		numb3 = leia.nextFloat();
		
		System.out.print("Entre com o quarto valor: ");
		numb4 = leia.nextFloat();
		
		System.out.println("A diferença dos valores é " + ((numb1 * numb2) - (numb3 * numb4)));

	}

}
