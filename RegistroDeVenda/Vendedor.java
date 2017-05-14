package br.luis;

public class Vendedor {
	
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
	
	
}
