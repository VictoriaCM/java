package exercicios;

import java.util.Stack;
import java.util.Scanner;

public class EDexercicio_02 {
	
	static Scanner sc = new Scanner(System.in);
	
    public static void main(String[] args) {
    	
        Stack<String> BookStk = new Stack<>();
        int opt;
        
        
        do {
            System.out.println("\n------------Menu:-----------");
            System.out.println(" 1: Adicionar Livro na pilha  ");
            System.out.println(" 2: Listar Livros na pilha    ");
            System.out.println(" 3: Retirar Livro da pilha    ");
            System.out.println(" 0: Sair do programa          ");
            System.out.println("\n----------------------------");
            System.out.println("\n  Escolha uma opção:        ");
            
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    sc.nextLine();
                    System.out.print("Digite o nome: ");
                    String BookName = sc.nextLine();
                    BookStk.push(BookName);
                    System.out.println("Pilha:" + BookStk + "\nLivro adicionado!");
                    break;
                case 2:
                    if (BookStk.isEmpty()) {
                        System.out.println("A pilha está vazia.");
                    } else {
                        System.out.println("Livros na pilha:");
                        for (String livro : BookStk) {
                            System.out.println(livro);
                        }
                    }
                    break;
                case 3:
                    // Retirar um Livro da pilha
                    if (BookStk.isEmpty()) {
                        System.out.println("A pilha está vazia. Nenhum Livro para retirar.");
                    } else {
                        String livroRetirado = BookStk.pop();
                        System.out.println(livroRetirado + " foi retirado da pilha.");
                    }
                    break;
                case 0:
                    // Sair do programa
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opt != 0);

        // Fecha o scanner para evitar vazamento de recursos
        sc.close();
    }
}
