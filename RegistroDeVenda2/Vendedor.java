package br.luis;

import java.io.Serializable;
import java.util.Scanner;

public class Vendedor implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nome, codigo, endereco;
	private float comissao;
	
	public Vendedor(String nome, String endereco, String codigo){
		this.nome 		= nome;
		this.endereco	= endereco;
		this.codigo 	= codigo;
	}
	
	// Metodos
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public float getComissao() {
		return comissao;
	}
	
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	// CADASTRAR VENDEDOR
	public void cadastrarVendedor(){
		Scanner scan = new Scanner(System.in);
		Arquivo arquivo = new Arquivo();
		String nome, codigo, endereco;
		
		System.out.println("Digite o nome do Vendedor");
		nome = scan.nextLine();
		
		System.out.println("Digite o codigo do Vendedor");
		codigo = scan.nextLine();
		
		System.out.println("Digite o Endereço");
		endereco = scan.nextLine();		
		
		Vendedor vendedor = new Vendedor(nome, endereco, codigo);
		arquivo.salvar(vendedor, nome);
	}
	public void procurarVendedor(){
		//PROCURAR VENDEDOR
		Scanner scan = new Scanner(System.in);
		Arquivo arquivo = new Arquivo();
		
		System.out.println("Nome do arquivo quer deseja ler: ");
		String nome = scan.nextLine();
		arquivo.lerObjeto(nome);
		Vendedor vendedor = (Vendedor)arquivo.lerObjeto(nome);
		
		System.out.println("--------------------");
		System.out.println("Nome: "		 		+ vendedor.getNome());
		System.out.println("Código:	" 			+ vendedor.getCodigo());
		System.out.println("Endereço: " 		+ vendedor.getEndereco());
	}
}
