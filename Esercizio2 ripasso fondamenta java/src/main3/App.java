package main3;

import java.util.List;

public class App {

	public static void main(String[] args) {
		
		//CREO IL CLIENTE
		Cliente giuseppe = new Cliente(123, "Giuseppe Verdi", "gius@verdi.it", "13/04/2024");
		
		
		//CREO LISTA DI ARTICOLI
		Articolo articolo1 = new Articolo(1234, "Prodotto per la pulizia della casa", 10.00, 25);
		Articolo articolo2 = new Articolo(1234, "Prodotto per la pulizia della casa", 10.00, 25);
		Articolo articolo3 = new Articolo(1234, "Prodotto per la pulizia della casa", 10.00, 25);
		Articolo articolo4 = new Articolo(1234, "Prodotto per la pulizia della casa", 10.00, 25);


		//CREO IL CARRELLO
		Carrello carrello = new Carrello(giuseppe, List.of(), 0.0);
		
		carrello.aggiungiArticolo(articolo1);
		carrello.aggiungiArticolo(articolo2);
		carrello.aggiungiArticolo(articolo3);
		
		
		carrello.datiCarrello();
		
	}

}
