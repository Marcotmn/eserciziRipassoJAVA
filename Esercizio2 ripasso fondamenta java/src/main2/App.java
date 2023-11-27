package main2;

public class App {

	public static void main(String[] args) {
		
		String[] registroChiamate = new String[5];
		registroChiamate[0] = ("Telefono: 1234 " + "Durata: 25m");
		registroChiamate[1] = ("Telefono: 1234 " + "Durata: 25m");
		registroChiamate[2] = ("Telefono: 1234 " + "Durata: 25m");
		registroChiamate[3] = ("Telefono: 1234 " + "Durata: 25m");
		registroChiamate[4] = ("Telefono: 1234 " + "Durata: 25m");
		
		Sim sim = new Sim(327693614, 10.00, registroChiamate);
		
		stampaDatiSim(sim);
		
	}
	
	public static void stampaDatiSim(Sim sim) {
		sim.datiSim();
	}

}
