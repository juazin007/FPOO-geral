
public class DecisaoSimples {
	
	public void testeMenor (int valor1, int valor2) {
		if (valor1 < valor2) {
			System.out.println("Valor 1: " + valor1 + " é menor que valor 2: " + valor2);
		}
	}
	
	public void testeMenorIgual (int valor1, int valor2) {
		if (valor1 <= valor2) {
			System.out.println("Valor 1: " + valor1 + " é igual ao valor 2: " + valor2);
		}
	}
	
	public void testeMaior (int valor1, int valor2) {
		if (valor1 > valor2) {
			System.out.println("Valor 1: " + valor1 + " é maior que valor 2: " + valor2);
		}
	}
	
	public void testeMaiorIgual (int valor1, int valor2) {
		if (valor1 >= valor2) {
			System.out.println("Valor 1: " + valor1 + " é igual ou maior que o valor 2: " + valor2);
		}
	}
	
	public void testeIgual (int valor1, int valor2) {
		if (valor1 == valor2) {
			System.out.println("Valor 1: " + valor1 + " é igual ou maior que o valor 2: " + valor2);
		}
	}
	
	public void testeDiferente (int valor1, int valor2) {
		if (valor1 != valor2) {
			System.out.println("Valor 1: " + valor1 + " é diferente que o valor 2: " + valor2);
		}
	}
	
}
