package main3;

import java.util.ArrayList;
import java.util.List;

public class Carrello {
	
	private Cliente clienteAssociato;
	private List<Articolo> elencoArticoli;
	private double totaleCostoArticoli;
	
	public Carrello(Cliente clienteAssociato, List<Articolo> elencoArticoli, double totaleCostoArticoli) {
		this.clienteAssociato = clienteAssociato;
		this.elencoArticoli = new ArrayList<Articolo>();
		this.totaleCostoArticoli = 0.0;
	}
	
	public void datiCarrello() {
		System.out.println("Cliente associato: " + clienteAssociato.getNomeCognome());
		System.out.println("Elenco articoli: ");
		for (Articolo articolo : elencoArticoli) {
			articolo.datiArticolo();
		}
		System.out.println("Totale carrello: " + totaleCostoArticoli + "€");
	}
	
	public void aggiungiArticolo(Articolo articolo) {
		elencoArticoli.add(articolo);
		totaleCostoArticoli += articolo.getPrezzo();
	}
	

}
