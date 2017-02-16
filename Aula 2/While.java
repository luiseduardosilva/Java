import java.util.Scanner;

public class While {

	public static void main(String[] args){
			// While simples
		/*
		int oi = 7;
		while (oi > 3){
			System.out.format("Numero: %s\n", oi);
			oi -= 1;
		
		*/
			// While com Scan
		/*
		int valor;
		System.out.format("Escreva um Valor: ");
		Scanner scan = new Scanner(System.in);
		valor = scan.nextInt();
		if (valor == 10){
			System.out.println("== 10");
			
		} else{
			System.out.println("!= 10");
		}
		scan.close();
		*/
		
		// Código das Cervejas
		
		int cerva = 0;
		System.out.format("Informe a Quantidade de Cervas: ");
		Scanner cervaQuant = new Scanner(System.in);
		cerva = cervaQuant.nextInt();
		while (cerva != 0){
		
			System.out.format("%d cervejas no frezer\n", cerva);
			System.out.println("pego uma garrafa, passo pra frente.");
			cerva -=1;
			System.out.format("Agora sao %d cervejas o frezer\n\n", cerva);
			if (cerva == 0){
				System.out.format("Cerva acabou!!\nDeseja Add quantas Cervas?! ");
				
				cerva = cervaQuant.nextInt();
				System.out.println();
			
			}
		}
		
	}
}
