package br.edu.infnet;
import java.util.Scanner;

public class Segundo {
	
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int quantidade = Integer.valueOf(args[0]);
		
		
		for (int i = 0; i < quantidade; i++) {
			System.out.print("Informe o seu nome: ");
			String nome = in.next();
			System.out.print("Informe a sua idade: ");
			int idade = in.nextInt();
			System.out.print("Informe o seu salario: ");
			float salario = in.nextFloat();
			System.out.println(i + " - " + nome + " - " + idade + " - " + salario);
		}
		
		in.close();
		
		
		
		// int i = 0;
		// System.out.println("Estrutura while");
		// while(i < quantidade) {
			// System.out.println("Infnet");
			// i++;
		// }
		
		// do {
			// System.out.println("Infnet");
			// i++;
		// } while (i < quantidade);
		
	}
}