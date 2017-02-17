import java.util.Scanner;

public class Idade {
	public static void main(String[] args){
		int 	anoNas = 0;
		int 	anoAtu = 0;
		String 	nome;
	
		Scanner scan = new Scanner(System.in);
		
		System.out.format("Infome seu nome: ");
		nome = scan.nextLine();
		
		System.out.format("Ano em que nasceu: ");
		anoNas = scan.nextInt();
		
		System.out.format("Ano Atual: ");
		anoAtu = scan.nextInt();
		System.out.format("---\nNome: %s\nIdade: %d", nome, (anoAtu - anoNas));
		scan.close();
	}
}
