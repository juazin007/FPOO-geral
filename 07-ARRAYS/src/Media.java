import java.util.Scanner;

public class Media {
	
	String [] alunos = {"Ana", "Joao", "Maria", "Carlos"};
	float[] notas = new float[4];
	Scanner objScan = new Scanner(System.in);
	
	public void listarAlunos() {
		
//		System.out.println("1º aluno(a)" + alunos[0]);
//		System.out.println("2º aluno(a)" + alunos[1]);
//		System.out.println("3º aluno(a)" + alunos[2]);
//		System.out.println("4º aluno(a)" + alunos[3]);
		
		for(int indice = 0; indice < alunos.length; indice++) {
			
			System.out.println((indice + 1) + "º aluno(a):" + alunos[indice]);
			
			System.out.println("Notas do Aluno(a):" + alunos[indice]);
			int cont = 0;
			while(cont <4) {
				
//				System.out.println("Notas do Aluno(a)" + alunos[indice]);
				System.out.println("Digite a: " + (cont + 1) + "º Nota");
				notas[cont] = objScan.nextFloat();
				cont++;
				
			}
		}
		int cont = 0;
		while(cont < notas.length) {
			
			
			System.out.println( (cont + 1) + "Listagem de Notas:" + notas[cont]);
			cont++;		
		}
		
		System.out.println("Total de alunos: " + alunos.length);
		
	}
		


}
