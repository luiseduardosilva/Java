import java.util.Scanner;

public class Media {
	public static void main(String[] args){
		float valor, valor2, valor3, soma;
		Scanner scan = new Scanner(System.in);
		valor = scan.nextFloat();
		valor2 = scan.nextFloat();
		valor3 = scan.nextFloat();
		soma = (valor + valor2 + valor3) / 3;
		System.out.println(soma);
		if (soma >= 7){
			System.out.println("Aprovado");
		}
		else if (soma >= 5 && soma <= 7){
			System.out.println("Final");
		} else{
			System.out.println("Reprovado!");
		}
	}
}
