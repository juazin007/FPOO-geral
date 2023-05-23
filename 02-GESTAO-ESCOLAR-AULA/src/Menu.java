import java.util.Scanner;

public class Menu {
	
	Professor objProfessor;
	Aluno objAluno;
	Disciplina objDisciplina;
	Media objMedia;
	
	public void exibirMenu() {
		
		int opcao = 0;
		Scanner objScanner = new Scanner(System.in);
		
		while(opcao != 6) {
		
		System.out.println("Escolha a Opção pelo Numero: ");
		System.out.println("1 - Cadastrar Professor");
		System.out.println("2 - Cadastrar Aluno");
		System.out.println("3 - Cadastrar Disciplina");
		System.out.println("4 - Cadastrar Notas");
		System.out.println("5 - Exibir Dados");
		System.out.println("6 - Sair");
		
		opcao = objScanner.nextInt();
		 
		
		switch (opcao) {
		case 1:
			System.out.println("Digite o nome do Professor(a): ");
			objProfessor = new Professor();
			objProfessor.setNomeProfessor(objScanner.next());
								
			break;
			
		case 2:
			System.out.println("Digite o nome do Aluno(a): ");
			objAluno = new Aluno();
			objAluno.setNomeAluno(objScanner.next());
			break;
			
		case 3:
			System.out.println("Digite a disciplina: ");
			objDisciplina = new Disciplina();
			objDisciplina.setNomeDisciplina(objScanner.next());
			break;
			
		case 4:
			System.out.println("Digite as notas: ");
			objMedia = new Media();
			
			System.out.println("Nota1: ");
			objMedia.setNota1(objScanner.nextFloat());
			
			System.out.println("Nota2: ");
			objMedia.setNota2(objScanner.nextFloat());
			
			System.out.println("Nota3: ");
			objMedia.setNota3(objScanner.nextFloat());
			
			System.out.println("Nota4: ");
			objMedia.setNota4(objScanner.nextFloat());
			
			
			break;
			
		case 5:
			System.out.println("Exibir Dados: ");
			System.out.println("Professor: " + objProfessor.getNomeProfessor());
			System.out.println("Aluno: " + objAluno.getNomeAluno());
			System.out.println("Disciplina: " + objDisciplina.getNomeDisciplina());
			System.out.println("Media: " + objMedia.CalcularMedia());
			break;
		
		case 6:
			System.out.println("-- Obrigado por usar nosso Sistema --");				
			break;
		
		default:
			System.out.println("Opção Invalida");
			break;
		}
		
		}
		
	}//Fim do método ExibirMenu()
	

}//Fim da Classe Menu

