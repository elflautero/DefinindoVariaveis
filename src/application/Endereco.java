package application;

public class Endereco {
	
	// variavel de instancia
	private String logadouro;
	
	// variavel atributo de classe
	private static String log;
	
	// constante
	private final String cidade = "Brasília"; // constante, sempre sera brasilia
	
	
	
	
	// metodo de instancia - non static
	public String getLogadouro () {
		
		return logadouro;
	}
	
	// metodo de instancia - non static
	public void setLogadouro (String logadouro) { // variavel local
		
		this.logadouro = logadouro; 
	}
	
	
	
	
	// construtor generico
	public Endereco () {
		
	}

}
