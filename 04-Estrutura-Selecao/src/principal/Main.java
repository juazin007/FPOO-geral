package principal;

import operacional.EstruturaSelecao;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			String genero;
		
		EstruturaSelecao objEstruturaSelecao = new EstruturaSelecao();
		Scanner objScanner = new Scanner(System.in);
		
		System.out.println("---Bem-Vindo---");
		
		System.out.println("informe um valor para o genero:");
		genero = objScanner.next();
		
		objEstruturaSelecao.setGenero(genero.toLowerCase());
		
		System.out.println("---Obrigado pela atenção---");
		
	}

}
