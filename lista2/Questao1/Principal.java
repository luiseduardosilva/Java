import java.util.Scanner;

public class Principal {

	public static void main(String[] args){
		Salario valor = new Salario();
		
		// Variaveis
		double total;
		double per;
		double salario;
		
		// scan
		Scanner scan = new Scanner(System.in);
		
		// Valor do Salário
		System.out.format("Informe seu salario: ");
		valor.setSalario(salario = scan.nextDouble());
		System.out.format("Informe o Aumento: ");
		
		// Valor do Aumento
		valor.setAumento(per = scan.nextDouble());
		total = (salario * per);
		
		// total
		System.out.println(total);
	}
}
