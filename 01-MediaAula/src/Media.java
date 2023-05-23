import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nomeAluno, disciplina;
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("####---- Bem Vindo ao Programa de Média ----####");
		
		System.out.println("Informe o Nome do Aluno: ");
		nomeAluno = scanner.next();
		
		System.out.println("Informe Da Disciplina: ");
		disciplina = scanner.next();
		
		System.out.println("Informe a Nota 1: ");
		nota1 = scanner.nextDouble();
		
		System.out.println("Informe a Nota 2: ");
		nota2 = scanner.nextDouble();
		
		System.out.println("Informe a Nota 3: ");
		nota3 = scanner.nextDouble();
		
		System.out.println("Informe a Nota 4: ");
		nota4 = scanner.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Nome do Aluno: " + nomeAluno);
		
		System.out.println("Disciplina: " + disciplina);
		
		System.out.println("Media do Aluno: " + media);
		
		System.out.println("---- Obrigado por usar nosso Site ----");
		
		
	}

}

