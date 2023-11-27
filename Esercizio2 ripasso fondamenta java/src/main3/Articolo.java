package main3;

public class Articolo {
	
	private int codiceArticolo;
	private String descrizioneArticolo;
	private double prezzo;
	private int pezziDisponibili;
	
	public Articolo (int codiceArticolo, String descrizioneArticolo, double prezzo, int pezziDisponibili) {
		this.codiceArticolo = codiceArticolo;
		this.descrizioneArticolo = descrizioneArticolo;
		this.prezzo = prezzo;
		this.pezziDisponibili = pezziDisponibili;
	}
	
	public void datiArticolo() {
		System.out.println("Codice articolo: " + codiceArticolo);
		System.out.println("descrizione " + descrizioneArticolo);
		System.out.println("Prezzo " + prezzo + "€");
		System.out.println("Disponibilità " + pezziDisponibili + " pezzi disponibili");
	}
	
	public double getPrezzo() {
		return prezzo;
	}

}
