package exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EDexercicio_01 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<String>();
		int opt = 1;
		String name;

		do {
			System.out.println("\n----------------Menu:------------------");
			System.out.println("   1: Adicionar Cliente na Fila          ");
			System.out.println("   2: Listar todos Clientes              ");
			System.out.println("   3: Retirar Cliente da Fila            ");
			System.out.println("   0: Sair                               ");
			System.out.println("\n---------------------------------------");
			System.out.println("   Entre com a opção desejada:           ");
			
			opt = sc.nextInt();

			switch (opt) {
			case 1:
				System.out.println("Digite o nome: ");
				name = sc.next();
				queue.add(name);
				System.out.println("Fila: " + queue + "\nCliente Adicionado!\n");
				break;
			case 2:
				if (queue.isEmpty()) {
					System.out.println("A Fila está vazia!\n");
				} else {
					System.out.println("Lista de Clientes na Fila: " + queue + "\n");
				}
				break;
			case 3:
				if (queue.isEmpty()) {
					System.out.println("A Fila está vazia!\n");
				} else {
					String cliente = queue.remove();
					System.out.println("O" + cliente + " foi chamado(a)!\n");
				}
				break;
			case 0:
				System.out.println("Programa Finalizado!");
				break;
			default:
				System.out.println("Opção Inválida!!");
			}

		} while (opt != 0);

	}

}
