import java.util.Scanner;

import javax.swing.JOptionPane;

public class UsaAgencia {
	public static void main(String[] args){
		ContaCorrente conta = new ContaCorrente();
		
		Menu menu = new Menu();
		String inputText;

		int opcao = 0;
	//	Float valorOpcao = 0.0f;
		Float valorOperacao = 0.0f;
		
		while(true){		
			
			inputText = menu.menuPrincipal(); 
			opcao = Integer.parseInt(inputText);
			
			if (opcao == 1){
				inputText =  menu.inputValor();
				valorOperacao = Float.parseFloat(inputText);
				valorOperacao = conta.getSaldo() - valorOperacao;
				conta.setSaldo(valorOperacao);
				JOptionPane.showMessageDialog(null, conta.getSaldo());
				
			}
			
			else if (opcao == 4){
				String msg = "Obg";
				
				
				JOptionPane.showMessageDialog(null, msg);
				
				System.exit(0);
				
			}
			
		}
	}
}
