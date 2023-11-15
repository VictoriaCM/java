package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class COexercicio_01 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<String> colorsList = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite a  " + (i + 1) + "° cor: ");
			String color = sc.nextLine();

			colorsList.add(color);
		}
		System.out.println("\nListar todas as cores:");
		for (String cor : colorsList) {
			System.out.println(cor);
		}

		
		Collections.sort(colorsList);
		System.out.println("\nCores ordenadas em ordem crescente:");
		for (String cor : colorsList) {
			System.out.println(cor);
		}
	}
}
