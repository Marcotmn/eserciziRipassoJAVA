package main;

import java.util.Scanner;
import java.util.Arrays;


public class Esercizio1 {

	public static void main(String[] args) {
		
		///////////////////1
		Scanner m = new Scanner (System.in);
		System.out.println("Digita un numero intero da moltiplicare");
		int interoA = m.nextInt();
		System.out.println("Digita un altro numero intero da moltiplicare e attendi il risultato");
		int interoB = m.nextInt();
		
		System.out.println("Il risultato della moltiplicazione è " + moltiplica(interoA, interoB));
		
		
		///////////////////2
		Scanner c = new Scanner (System.in);
		System.out.println("//////////////////////////////");
		System.out.println("Digita una frase");
		String frase = c.nextLine();
		System.out.println("Adesso digita un numero per completare la frase precedentemente inserita");
		int interoC = c.nextInt();
		
		System.out.println("Hai inserito: " + concatena(frase, interoC));
		
		
		///////////////////3
		String array[] = {"Ciao", "sono", "Marco", "da", "Palermo"};
		String parolaDaInserire = "Tumminia";
		System.out.println("//////////////////////////////");
		System.out.println(inserisciInArray(array, parolaDaInserire));
		
		
		///////////////////4
		Scanner ts = new Scanner(System.in);
		System.out.println("//////////////////////////////");
		System.out.println("Inserisci la prima di 3 parole");
		String parolaUno = ts.nextLine();
		System.out.println("Inserisci la seconda di 3 parole");
		String parolaDue = ts.nextLine();
		System.out.println("Inserisci la terza di 3 parole e attendi il risultato");
		String parolaTre = ts.nextLine();
		
		System.out.println(concatenaTreStringhe(parolaUno, parolaDue, parolaTre));
		System.out.println(concatenaTreStringheRev(parolaUno, parolaDue, parolaTre));

		
		///////////////////5
		Scanner pr = new Scanner(System.in);
		System.out.println("//////////////////////////////");
		System.out.println("Inserisci la lunghezza in decimi della base di un rettangolo");
		double base = pr.nextDouble();
		System.out.println("Inserisci la lunghezza in decimi dell'altezza di un rettangolo");
		double altezza = pr.nextDouble();
		System.out.println("il perimetro del rettangolo è " + perimetroRettangolo(base, altezza));

		
		///////////////////5
		Scanner pd = new Scanner(System.in);
		System.out.println("//////////////////////////////");
		System.out.println("inserisci un numero intero: se il numero è pari visualizzerai uno 0, altrimenti 1");
		int numeroInt = pd.nextInt();
		System.out.println(pariDispari(numeroInt));

		
		///////////////////6
		Scanner pt = new Scanner(System.in);
		System.out.println("//////////////////////////////");
		System.out.println("Inserisci la lunghezza in decimi del primo lato di un triangolo");
		double latoA = pt.nextDouble();
		System.out.println("Inserisci la lunghezza in decimi del secondo lato di un triangolo");
		double latoB = pt.nextDouble();
		System.out.println("Inserisci la lunghezza in decimi del terzo lato di un triangolo");
		double latoC = pt.nextDouble();
		System.out.println(perimetroTriangolo(latoA, latoB, latoC));

		
	}
	
		///////////////////1
	private static int moltiplica(int interoA, int interoB) {
		return interoA*interoB;
	}
	
		///////////////////2
	private static String concatena(String frase, int interoC) {
		return frase+" "+interoC;
	}
	
		///////////////////3
	private static String inserisciInArray(String[] array, String parolaDaInserire) {
		
		String newArray[] = new String[6];
		
		newArray[0] = array[0];
		newArray[1] = array[1];
		newArray[2] = array[2];
		newArray[3] = parolaDaInserire;
		newArray[4] = array[3];
		newArray[5] = array[4];
		
		return Arrays.toString(newArray);
		
	}
	
		///////////////////4
	private static String concatenaTreStringhe(String parolaUno, String parolaDue, String parolaTre) {
		return parolaUno +" "+ parolaDue +" "+ parolaTre;
	}
	
	private static String concatenaTreStringheRev(String parolaUno, String parolaDue, String parolaTre) {
		return parolaTre +" "+ parolaDue +" "+ parolaUno;
	}

		///////////////////5
	private static double perimetroRettangolo(double base, double altezza) {
		return (base+altezza)*2;
	}
	
		///////////////////6
	private static int pariDispari(int numeroInt) {
		
		if(numeroInt % 2 == 0) {
			return 0;
		} else {
			return 1;
		}
		
	}

		///////////////////7
	private static double perimetroTriangolo(double latoA, double latoB, double latoC) {
		
		double semiPerimetro = (latoA + latoB + latoC)/2;
		
		return Math.sqrt(semiPerimetro*(semiPerimetro-latoA)*(semiPerimetro-latoB)*(semiPerimetro-latoC));
	}



}
