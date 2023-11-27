package main;

public class App {

	public static void main(String[] args) {
		
		Rettangolo rettangoloUno = new Rettangolo(5,10);
		Rettangolo rettangoloDue = new Rettangolo(7,12);
		Rettangolo rettangoloTre = new Rettangolo(10,18);
		
		stampaRettangolo(rettangoloUno);
		stampaDueRettangoli(rettangoloDue, rettangoloTre);
		
	}
	
	public static void stampaRettangolo(Rettangolo rettangoloUno) {
		
		System.out.println("Le aree del rettangoloUno è: " + rettangoloUno.calcolaArea());
		System.out.println("Il perimetro del rettangoloUno è: " + rettangoloUno.calcolaPerimetro());
	}
	
	public static void stampaDueRettangoli(Rettangolo rettangoloDue, Rettangolo rettangoloTre) {
		System.out.println("l'area del rettangoloDue e del rettangoloTre sono rispettivamente: " + rettangoloDue.calcolaArea() + " e " + rettangoloTre.calcolaArea());
		System.out.println("Il perimetro del rettangoloDue e il perimetro del rettangoloTre sono rispettivamente: " + rettangoloDue.calcolaPerimetro() + " e " + rettangoloTre.calcolaPerimetro());
		System.out.println("La somma delle aree e dei perimetri dei rettangoli DUE e TRE è: "+ (rettangoloDue.calcolaArea()+rettangoloTre.calcolaArea()+rettangoloDue.calcolaPerimetro()+rettangoloTre.calcolaPerimetro()));
	}
	
}
