package br.luis;

import java.util.Scanner;

public class Principal {

	private static Scanner scan;

	public static void main(String[] args){
		
		Menu menu = new Menu();
		Arquivo 	arquivo 	= new Arquivo();
		Produto 	produto 	= new Produto();
		Vendedor 	vendedor 	= new Vendedor(null, null, null);
		scan = new Scanner(System.in);
		boolean loop = true;
		String opcao;
		do{
			
			//Menu
			menu.exibeMenu();
			
			opcao = scan.nextLine();
			
			switch(opcao){
				case "1":
					//CADASTRAR PRODUTO
					produto.cadastrarProduto();
					break;
				case "2":
					//CADASTRAR VENDEDOR
					vendedor.cadastrarVendedor();
					break;
				case "3":
					//PROCURAR PRODUTO
					produto.procurarProduto();
					break;
				case "4":
					//PRODUCRAR VENDEDOR
					vendedor.procurarVendedor();
					break;
				case "0":
					loop = false;
					break;
				default:
					System.out.println("Digite uma opção valida");
					break;
					
					
			}
		}while(loop);
		
	}
}
