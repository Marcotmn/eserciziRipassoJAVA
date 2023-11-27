package main2;

import java.util.Arrays;

public class Sim {
	
	private int numeroTelefono;
	private double creditoDisponibile;
	String[] registroChiamate;
	
	public Sim(int numeroTelefono, double creditoDisponibile, String[] registroChiamate) {
		this.numeroTelefono = numeroTelefono;
		this.creditoDisponibile = creditoDisponibile;
		this.registroChiamate = registroChiamate;
	}
	
	public void datiSim() {
		System.out.println("Numero: " + numeroTelefono);
		System.out.println("Credito disponibile: " + creditoDisponibile + "€");
		System.out.println("Registro chiamate: ");
		System.out.println(Arrays.toString(registroChiamate));
	}

	}


