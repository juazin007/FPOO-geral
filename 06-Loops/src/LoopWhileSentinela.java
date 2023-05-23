import java.util.Scanner;

public class LoopWhileSentinela {
	
	public void loopWhile() {
		 
		String sentinela = "";
		Scanner objScanner = new Scanner(System.in);
		
		while (!sentinela.equalsIgnoreCase("sair")) {
			
			System.out.println("Digite um valor ou sair: ");
			sentinela = objScanner.next();
			
		}
		
		System.out.println("--Obrigado por usar nosso Programa--");
		
	}
	
	

}
