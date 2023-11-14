package aula_05;

import java.util.Scanner;

public class Matrizes {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		double[][] matrizDouble = new double[3][3];

		// controla linha
		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {

			// controla coluna
			for (int indiceJ = 0; indiceJ < matriz.length; indiceJ++) {
				System.out.println("Matriz[" + indiceI + "][" + indiceJ + "] = " + matriz[indiceI][indiceJ]);
			}
		}
		
		
		// controla linha
		for (int indiceI = 0; indiceI < matrizDouble.length; indiceI++) {

			// controla coluna
			for (int indiceJ = 0; indiceJ < matrizDouble.length; indiceJ++) {
				System.out.println("Matriz[" + indiceI + "][" + indiceJ + "] = " + matrizDouble[indiceI][indiceJ]);
			}

		}
	}

}
	
