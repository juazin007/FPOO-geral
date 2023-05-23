
public class EstruturaDecisaoTexto {
	
	//é vazio
	public void testeVazio(String texto) {
		if(texto.isEmpty()) {
			System.out.println("--Vc não digitou o texto. Por favor digite o texto--");
		}else {
			System.out.println("--Obrigado pela atenção--");
		}
	}
	
	//é igual
	public void testeIgual(String texto1, String texto2) {
		if(texto1.equalsIgnoreCase(texto2)) {
			System.out.println("Os textos são iguais");
		}else {
			System.out.println("Os textos são diferentes");
		}
	}
	
	//qual o tamanho
	public void contador(String texto) {
		
		int tamanho = texto.length();
		
		if(tamanho >= 8) {
			System.out.println("A senha é valida");
		}else {
			System.out.println("A senha não é valida");
		}
	}

}
