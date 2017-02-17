
import java.util.Scanner;

public class Soma {
	public static void main(String[] args) {
		float valor = 0;
		for (int i = 1; i < 3; i++) {
			System.out.format("Infome %dº Numero: ", i);

			Scanner scan = new Scanner(System.in);
			valor = valor + scan.nextFloat();
		}
		System.out.println("Soma: " + valor);

	}
}
