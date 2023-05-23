package operacional;

public class EstruturaSelecao {

	private String genero;

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		
		switch(genero) {
		
			case "masculino":
				this.genero = genero;
				break;
				
			case "feminino":
				this.genero = genero;
				break;
				
			case "outros":
				this.genero = genero;
				break;
				
			default:
				System.out.println("DADO INVÁLIDO!");
				System.exit(0);
				
		}
		
		this.genero = genero;
	}
	

	
	
}
