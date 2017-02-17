
import java.util.Scanner;

public class Soma {
	public static void main(String[] args){
		float valor = 0;
		for (int i = 0; i < 2; i++){
			//System.out.println(i);
			Scanner scan = new Scanner(System.in);
			valor = valor + scan.nextFloat();
			
		}
	System.out.println(valor);
	}
}
