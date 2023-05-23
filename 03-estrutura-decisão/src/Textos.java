
public class Textos {
	
	public void testeLogicos() {
		
		String nome1 = "RENANEQUEER";
		String nome2 = "";
		String nome3 = "renanequeer";
		String nome4 = "RENAN E QUEER";
		
		System.out.println("é vazio? " + nome1.isEmpty());
		System.out.println("é vazio? " + nome2.isEmpty());
		
		System.out.println("é igual? " + nome1.equals(nome2));
		System.out.println("é igual? " + nome1.equals(nome3));
		System.out.println("é igual? " + nome1.equalsIgnoreCase(nome3));
		
		System.out.println("Tamanho: " + nome1.length());
		System.out.println("Tamanho: " + nome2.length());
		System.out.println("Tamanho: " + nome3.length());
		System.out.println("Tamanho: " + nome4.length());
		
		
	}

}
