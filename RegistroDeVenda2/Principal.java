package br.luis;

import java.util.Scanner;

public class Principal {

	private static Scanner scan;

	public static void main(String[] args){
		
		Menu menu = new Menu();
		Arquivo arquivo = new Arquivo();
		Produto produto = new Produto();
		scan = new Scanner(System.in);
		boolean loop = true;
		String opcao;
		do{
			
			//Menu
			menu.exibeMenu();
			
			opcao = scan.nextLine();
			
			switch(opcao){
				case "1":
					produto.cadastrarProduto();
					break;
					
				case "2":
					System.out.println("Nome do arquivo quer deseja ler: ");
					String nome = scan.nextLine();
					arquivo.lerObjeto(nome);
					produto = (Produto)arquivo.lerObjeto(nome);
					
					//dados
					//System.out.println("--------------------");
					System.out.println(produto.getNome());					
					break;
				default:
					System.out.println("Digite uma opção valida");
					break;
					
					
			}
		}while(loop);
		
	}
}
