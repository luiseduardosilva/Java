package br.unipe.java.unidade1;
// Digitar syso dps apertar ctrl+espaço = auto completar
public class Carro {
	// variaveis
	private String motor;
	private String cor;
	private float potencia;
	private int rodas;
	private int velocidade;
	// coding
	
	// AVANÇAR
	public void avancar(){
		System.out.println("Avançando");
	}
	
	// RETROCEDOR
	public void retroceder(){
		System.out.println("Retrocedor");
	}
	
	// ACELERAR
	public void acelerar(){
		System.out.println("Acelerar");
	}
	
	// PARAR
	public void parar(){
		System.out.println("Parar");
	}
	
	// ABASTECER
	public void abastecer(){
		System.out.println("Abastecer");
		
	}
	// sourcer + generete..... 

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public int getRodas() {
		return rodas;
	}

	public void setRodas(int rodas) {
		this.rodas = rodas;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
}
