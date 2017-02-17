import java.util.Scanner;

public class Consumo {
	public static void main(String[] args){
		float combustivel;
		float distancia;
		float total;
		Scanner scan = new Scanner(System.in);
		System.out.format("Combustivel gasto: ");
		combustivel = scan.nextFloat();
		System.out.format("Distancia percorrida: ");
		distancia = scan.nextFloat();
		total = distancia / combustivel;
		System.out.println(total);
	}

}
