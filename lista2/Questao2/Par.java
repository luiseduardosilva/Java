import java.util.Scanner;

public class Par {
	public static void main(String[] args){
		// Variavel
		int num;
		
		// scan
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 10; i++){
			System.out.format("Informe um Numero: ");
			num = scan.nextInt();
		
			if((num % 2) == 0){
				System.out.format("%d eh par\n", num);
			}
			else{
				System.out.format("%d nao eh par\n", num);
			}
			
		}
	}
}
