package br.unipe.java.unidade1;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		/*
		// Criação de um objeto
		Carro celta = new Carro();
		celta.abastecer();
		celta.avancar();
		
		Carro uno = new Carro();
		uno.parar();
		uno.acelerar();
		*/
		
		// Cachorro
		String nome;
		
		//CHAMA CACHORRO
		Cachorro pitbull = new Cachorro();
		
		System.out.format("Escreva um nome ao seu toto: ");
		
		Scanner scan = new Scanner(System.in);
		System.out.println(scan.nextLine());
		pitbull.late();
	}

}
