
public class OperadoresLogicos {
	
	public void testesLogicos() {
	
	/*
	OPERADORES LÓGICOS:
	&& -> AND E
	|| -> OR -> OU
	! -> NOT -> NÃO
	
	EXEMPLO DE SINTAXE
	*/
	
	int idadeInicio = 18;
	int idadeFim = 90;
	boolean resultado;
	
	
	/*
	VEREFICA SE A IDADE DA PESSOA ESTÁ ENTRE 18 E 90 ANOS
	*/
	
	resultado = (idadeInicio >= 18) && (idadeFim <= 90);
	System.out.println(resultado);
	
	idadeInicio = 17;
	resultado = (idadeInicio >= 18) && (idadeFim <= 90);
	System.out.println(resultado);
	
	/*
	VEREFICA SE A IDADE DA PESSOA ESTÁ ENTRE 18 OU 90 ANOS.
	*/
	
	idadeInicio = 18;
	resultado = (idadeInicio >= 18) || (idadeFim <= 90);
	System.out.println(resultado);
	
	idadeInicio = 17;
	resultado = (idadeInicio >= 18) || (idadeFim <= 90);
	System.out.println(resultado);
	
	
	
	}
 }
