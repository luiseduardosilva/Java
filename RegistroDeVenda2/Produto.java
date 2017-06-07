package br.luis;

import java.io.Serializable;
import java.util.Scanner;

public class Produto implements Serializable{
		
	private static final long serialVersionUID = 1L;
	Arquivo arquivo = new Arquivo();
	private String codigo,
				   nome, 
				   descricao,
				   valorVenda,
				   valorCusto,
				   promocao;
	
	Scanner scan = new Scanner(System.in);
	
	public Produto(String codigo, String nome, String descricao, String valorVenda, String valorCusto, String promocao) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCusto = valorCusto;
		this.promocao = promocao;
	}
	
	
	public Produto() {
		super();
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getValorVenda() {
		return valorVenda;
	}


	public void setValorVenda(String valorVenda) {
		this.valorVenda = valorVenda;
	}


	public String getValorCusto() {
		return valorCusto;
	}


	public void setValorCusto(String valorCusto) {
		this.valorCusto = valorCusto;
	}


	public String getPromocao() {
		return promocao;
	}


	public void setPromocao(String promocao) {
		this.promocao = promocao;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public void cadastrarProduto(){
		
		String codigo,
		   nome, 
		   descricao,
		   valorVenda,
		   valorCusto,
		   promocao;
		
		
		
		System.out.println("Digite o codigo do produto");
		codigo = scan.nextLine();
		
		System.out.println("Digite o nome do produto");
		nome = scan.nextLine();
		
		System.out.println("Digite a descrição do produto");
		descricao = scan.nextLine();
		
		System.out.println("Digite o valor de venda do produto");
		valorVenda = scan.nextLine();
		
		System.out.println("Digite o valor de custo do produto");
		valorCusto = scan.nextLine();
		
		System.out.println("Produto em promoção [digite apenas sim ou não]");
		promocao = scan.nextLine();
		
		
		Produto produto = new Produto(codigo, nome, descricao, valorVenda, valorCusto, promocao);
		arquivo.salvar(produto, nome);
	}
	
}
