package main3;

public class Cliente {
	
	private int codiceCliente;
	private String nomeCognome;
	private String email;
	private String dataIscrizione;
	
	public Cliente(int codiceCliente, String nomeCognome, String email, String dataIscrizione) {
		this.codiceCliente = codiceCliente;
		this.nomeCognome = nomeCognome;
		this.email = email;
		this.dataIscrizione = dataIscrizione;
	}
	
	public String getNomeCognome() {
		return nomeCognome;
	}
	
	public void datiCliente() {
		System.out.println("Codice cliente: " + codiceCliente);
		System.out.println("Nome e cognome: " + nomeCognome);
		System.out.println("Email: "+ email);
		System.out.println("Data iscrizione " + dataIscrizione);
	}

}
