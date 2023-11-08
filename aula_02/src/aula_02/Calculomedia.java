package aula_02;

import java.util.Scanner;

public class Calculomedia {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		float  nota1, nota2, nota3, nota4;
		
		System.out.println("Entre com a primeira nota : ");
		nota1 = leia.nextFloat();
		
		System.out.print("Entre com a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.print("Entre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.print("Entre com a quarta nota: ");
		nota4 = leia.nextFloat();
		System.out.println("Sua Média final é " + (nota1 + nota2 + nota3 + nota4)/4);

	}

}
