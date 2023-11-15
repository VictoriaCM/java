package exercicios;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class COexercicio_04 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Set<Integer> IntNum = new HashSet<>();
		IntNum.add(2);
		IntNum.add(5);
		IntNum.add(1);
		IntNum.add(3);
		IntNum.add(4);
		IntNum.add(9);
		IntNum.add(7);
		IntNum.add(8);
		IntNum.add(10);
		IntNum.add(6);

		System.out.print("Digite o número que você deseja encontrar: ");
		int Diginum = sc.nextInt();

		if (IntNum.contains(Diginum)) {
			System.out.println("Número " + Diginum + " foi encontrado!");
		} else {
			System.out.println("O número " + Diginum + " não foi encontrado!");
		}

	}

}
