package main;

public class Rettangolo {
	
	private int altezza;
	private int larghezza;
	
	public Rettangolo (int altezza, int larghezza) {
		this.altezza = altezza;
		this.larghezza = larghezza;
		
	}
	
	public int getAltezza() {
		return altezza;
	}
	
	public int setAltezza() {
		return altezza;
	}
	
	public int getLarghezza() {
		return larghezza;
	}
	
	public int setLarghezza() {
		return larghezza;
	}
	
	public int calcolaArea() {
		return altezza*larghezza;
	}
	
	public int calcolaPerimetro() {
		return (altezza+larghezza)*2;
	}
}
