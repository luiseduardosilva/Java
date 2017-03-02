import java.util.Scanner;

public class Media {
	public static void main(String[] args){
		// vari
		int aprovado = 0;
		int reprovado = 0;
		int exame = 0;
		
		float meidaSala = 0;
		float notas = 0;
		
		for (int i= 0; i < 6; i++){
			System.out.println("Informe 2 notas!");
			Scanner scan = new Scanner(System.in);
			notas = scan.nextInt();
			notas = notas + scan.nextInt();
			meidaSala = meidaSala + notas;
			if ((notas / 2) >= 7){
				System.out.println("Aprovado");
				aprovado++;
			}
			else if((notas / 2) < 3){
				System.out.println("Reprovado");
				reprovado++;
			}
			else{
				System.out.println("Exame");
				exame++;
			}
		}
		
		System.out.format("Aprovados: %d, Reprovados: %d, Exames: %d ", aprovado, reprovado, exame);
		System.out.format("Media Sala: %f", (meidaSala / 6));
	}
}
