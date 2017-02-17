import java.util.Scanner;

public class Media {
	public static void main(String[] args){
		float valor, valor2, valor3, media;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.format("Informe a 1º nota: ");
		valor = scan.nextFloat();
		
		System.out.format("Informe a 2º nota: ");
		valor2 = scan.nextFloat();
		
		System.out.format("Informe a 3º nota: ");
		valor3 = scan.nextFloat();
		
		media = (valor + valor2 + valor3) / 3;
		System.out.println(media);
		if (media >= 7){
			System.out.println("Aprovado");
		}
		else if (media >= 5 && media <= 7){
			System.out.println("Final");
		} else{
			System.out.println("Reprovado!");
		}
	}
}
