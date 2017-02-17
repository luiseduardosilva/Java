import java.util.Scanner;

public class Idade {
	public static void main(String[] args){
		int anoNas = 0;
		int anoAtu = 0;
		
		Scanner idades = new Scanner(System.in);
		System.out.println("Ano em que nasceu =>");
		anoNas = idades.nextInt();
		System.out.println("Ano Atual =>");
		anoAtu = idades.nextInt();
		
		System.out.println(anoAtu - anoNas);
	}
}
