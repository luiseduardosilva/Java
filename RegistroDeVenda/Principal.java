package br.luis;

public class Principal {

	public static void main(String[] args){
		// VENDA NÚMERO 1:
		Produto produto 	= new Produto("100123", "Arroz", 3, 1, false);
		Vendedor vendedor	= new Vendedor("Luis", "Rua Pipoco", "24242424");
		
		Venda venda	= new Venda(produto, vendedor, 2);
		venda.calcularValor(venda.getQuantidadeItens(), produto.getValorVenda(), venda.getDesconto());
		venda.calcularComissao(produto.getValorVenda(), venda.getQuantidadeItens(), vendedor.getComissao(), false);
		
		venda.imprimeNaTela();
		
		// VENDA NÚMERO 2:
		Produto produto2 	= new Produto("525123", "Feijão", 23, 5, true);
		Vendedor vendedor2	= new Vendedor("Pedro", "Rua Tora", "24252221");
		
		Venda venda2	= new Venda(produto2, vendedor2, 4);
		venda2.setDesconto(4);
		venda2.calcularValor(venda2.getQuantidadeItens(), produto2.getValorVenda(), venda2.getDesconto());
		venda.calcularComissao(produto2.getValorVenda(), venda2.getQuantidadeItens(), vendedor2.getComissao(), false);
		
		venda2.imprimeNaTela();
		}
}
