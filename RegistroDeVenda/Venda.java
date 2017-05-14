package br.luis;

public class Venda {

	
	private Produto produto;
	private Vendedor vendedor;
	private float desconto;
	private int quantidadeItens;
	private float valor;
	
	// EFETUAR DESCONTO
	public void efetuarDesconto(int descontoProduto) {
		
		float valorDaVenda = produto.getValorVenda();
		float desconto = (valorDaVenda * descontoProduto) / 100;
		float valorFinal = (valorDaVenda - desconto);
		
		this.setDesconto(valorFinal);
	}
	
	
	//CALCULAR VALOR
	public void calcularValor(int quantidadeDeItens, float valorDaVenda, float desconto){
		float vlrDaVenda = (valorDaVenda * quantidadeDeItens) - desconto;
		this.setValor(vlrDaVenda);
	}
	
	
	//CALCULAR COMISSAO
	public float calcularComissao(float valorDaVenda, int quantidadeDeItens, float comissaoDoVendedor, boolean promocao) {
		
		float comissao = (valorDaVenda * quantidadeDeItens * comissaoDoVendedor) / 100;
		
		if (promocao) {
			comissao = comissao / 2;
		}
		
		return comissao;
}
	
	//EXIBIR NA TELA INFORMAÇÕES
	public void imprimeNaTela(){
		// INFORMAÇÕES DO VENDEDOR
		System.out.println("\n---");
		System.out.println("Informações do vendedor:");
		System.out.format("Nome: %s\nCódigo: %s\n", vendedor.getNome(), vendedor.getCodigo());
		
		// COMISSÂO DO VENDEDOR
		System.out.format("Comissão: %f", calcularComissao(produto.getValorVenda(), this.getQuantidadeItens(), vendedor.getComissao(), produto.isPromocao()));
		
		/* QUANDITADE DE ITENS
		 * CÓDIGO
		 * DESCRIÇÃO DO CÓDIGO
		 * VALOR DA VENDA
		 */
		System.out.format("\nQuantidade de Itens: %s\nCodigo: %s\nDescrição: %s\nValor: %f\n",this.getQuantidadeItens(), produto.getCodigo(), produto.getDescricao() , produto.getValorVenda());
		
		// PROMOÇÃO? & VALOR DO DESCONTO
		if(produto.isPromocao()){
			System.out.println("Promocão Ativada!");
		}else{
			System.out.println("Sem Promoção");
		}
		
		//DESCONTO
		System.out.format("Desconto: %f\n", this.getDesconto());
		
		//VALOR TOTAL DO PRODUTO
		System.out.format("Valor: %f", this.getValor());
	}
	
	public Venda(Produto produto, Vendedor vendedor, int quantidadeItens) {
		this.produto = produto;
		this.vendedor = vendedor;
		this.quantidadeItens = quantidadeItens;
}
		
	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Vendedor getVendedor() {
		return vendedor;
	}
	
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	public float getDesconto() {
		return desconto;
	}
	
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	
	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	
	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
}
