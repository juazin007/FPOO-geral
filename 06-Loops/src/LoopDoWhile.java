import java.util.Scanner;


public class LoopDoWhile {
	
	/*
	 * Exemplo de Loop Do...While por Contador:
	 */
	
	public void LoopDo() {
		
		int contador = 11;
		
		do {
			
			System.out.println("O valor do contador do Loop Do..While é " + contador);
			contador++;
			
		} while (contador <= 10);
		
	}
	
	/*
	 * Exemplo de Loop Do...While por Sentinela:
	 */
	public void LoopDoSentinela() {
		
		String opcao = "";
		Scanner objScanner = new Scanner(System.in);
		
		do {
			
			System.out.println("Do...While");
			System.out.println("Digite um Valor ou Sair: ");
			opcao = objScanner.next();
			System.out.println("Valor Digitado: " + opcao);
			
		} while (!opcao.equalsIgnoreCase("sair"));
		System.out.println("--Obrigado por Acessar :)--");
	}
		
	

}
