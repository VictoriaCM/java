package Exercícios;

import java.util.Scanner;

public class Conta_Bancaria {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float valor, saldo = 1000.00f;
		int operacao;
		
		
		System.out.println("                  Menu                  ");
		System.out.println("\n1 - Saldo");
		System.out.println("2 - Saque");
		System.out.println("3 - Depósito");
		operacao = leia.nextInt();
		
		switch (operacao) {
		case 1:
			System.out.println("Saldo disponível: R$" + saldo);
			break;
		case 2:
			System.out.println("Informe quanto deseja retirar: ");
			valor = leia.nextFloat();
			
			if(saldo >= valor)
				System.out.println("Novo Saldo disponível: R$" + (saldo - valor));
			else
				System.out.println("Saldo Insuficiente!");
			break;
		case 3:
			System.out.println("Informe dese2ja depositar: ");
			valor = leia.nextFloat();
			
			System.out.println("Novo Saldo disponível: R$" + (saldo + valor));
			break;
	
		default:
			System.out.println("Opção inválida!");


		
		}
}
}



