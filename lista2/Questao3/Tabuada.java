import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args){
		// Scan
		Scanner scan = new Scanner(System.in);
		
		// Valor
		int valor = scan.nextInt();
		
		// Tabuada
		for (int i = 1; i < 11; i++){
			System.out.format("%d x %d = %d\n",valor , i, (valor*i));
		}
		scan.close();
	}
}
