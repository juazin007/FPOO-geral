
public class OperadoresRelacionais {
	
 int valor , valor2;
 
 public void testesLogicos () {
	 
	/* 
	< - MENOR QUE 
	< = - MENOR OU IGUAL A  
	 > - MAIOR QUE 
	 >= - MAIOR OU IGUAL A
	 == - IGUAL A
	 != - DIFERENTE DE
	 */
	 
	 this.valor = 0;
	 this.valor2 = 0;
	 boolean resultado;
	 
	 System.out.println( "TESTE LÓGICO:" + this.valor + " < " + this.valor2);
	 resultado = valor < valor2;
	 System.out.println("Resultado: " + resultado);
	 
	 System.out.println( "TESTE LÓGICO:" + this.valor + " <= " + this.valor2);
	 resultado = valor <= valor2;
	 System.out.println("Resultado: " + resultado);
	 
	 System.out.println( "TESTE LÓGICO:" + this.valor + " > " + this.valor2);
	 resultado = valor > valor2;
	 System.out.println("Resultado: " + resultado);
	 
	 System.out.println( "TESTE LÓGICO:" + this.valor + " >= " + this.valor2);
	 resultado = valor >= valor2;
	 System.out.println("Resultado: " + resultado);
	 
	 System.out.println( "TESTE LÓGICO:" + this.valor + " == " + this.valor2);
	 resultado = valor == valor2;
	 System.out.println("Resultado: " + resultado);
	 
	 System.out.println( "TESTE LÓGICO:" + this.valor + " != " + this.valor2);
	 resultado = valor != valor2;
	 System.out.println("Resultado: " + resultado);
	
	 
	 
 }
 
}
