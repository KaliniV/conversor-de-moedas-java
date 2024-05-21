package aplicacao;

import java.util.Scanner;

import modelos.Opcoes;

public class Principal {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Opcoes menu = new Opcoes();

			menu.menu();

			int opcao = 5;
			while (opcao != 0) {

				System.out.println("Digite a opção: ");
				opcao = sc.nextInt();
				if (opcao != 0) {
					if (opcao > 30) {
						System.out.println("Digite uma opção válida.");
					} else {
						System.out.println("Digite o valor que deseja converter: ");
						double valor = sc.nextDouble();
						Opcoes op = new Opcoes(opcao, valor);
					}
				}
			}
			System.out.println("finalizado");

			sc.close();
		


	}

}
