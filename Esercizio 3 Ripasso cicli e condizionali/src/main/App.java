package main;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/////STRINGAPARIDISPARI 
		String stringa = "Ciao sono Marco Tumminia e vengo da Palermo";
		stringaPariDispari(stringa);
		
		
		/////ANNOBISESTILE
		int anno = 1816;
		annoBisestile(anno);
		
		
		/////SWITCH
		Scanner is = new Scanner(System.in);
		System.out.println("Inserisci un numero tra 0 e 3");
		int numero = is.nextInt();
		inserisciNumero(numero);
		
		
		/*/////WHILE
		Scanner sw = new Scanner(System.in);
		System.out.println("Inserisci una o più parole per continuare; per interrompere il programma inserisci <:q>");
		String parola = sw.nextLine();
		inserisciStringa(parola);*/

		
		/////CICLOFOR
		Scanner ni = new Scanner(System.in);
		System.out.println("Inserire un numero intero");
		int numero1 = ni.nextInt();

		
		contoAllaRovescia(numero1);

	}
		/////STRINGAPARIDISPARI
	public static void stringaPariDispari(String stringa) {
		if (stringa.length() % 2 == 0) {
			System.out.println("true: il numero di caratteri della stringa è pari!");
		} else {
			System.out.println("false: il numero di caratteri della stringa è dispari!");
		}
	}

	    /////ANNOBISESTILE
	public static void annoBisestile(int anno) {
		if (anno % 4 == 0) {
			System.out.println("True: l'anno è bisestile!");
		} else if (anno % 100 == 0 && anno % 400 == 0) {
			System.out.println("True: l'anno è bisestile!");
		} else {
			System.out.println("False: l'anno non è bisestile!");
		}
	}
	
		/////SWITCH
	public static void inserisciNumero(int numero) {
		switch (numero) {
		case 0:
			System.out.println("ZERO");
			break;
			
		case 1:
			System.out.println("UNO");
			break;
			
		case 2:
			System.out.println("DUE");
			break;
			
		case 3:
			System.out.println("TRE");
			break;
			
		default:
			System.out.println("ERRORE: Il numero che hai inserito non è compreso tra 0 e 3!");
		}
	}
	
		/*/////WHILE
	public static void inserisciStringa(String parola) {
		while (parola != ":q") {
			String[] caratteri = parola.split(", ");
			for (String carattere : caratteri) {
				System.out.println(carattere);
			}
			
		}
	}*/
	
	
		/////FOR
	public static void contoAllaRovescia(int numero) {
		for (int i = numero; i >= 0; i--) {
			System.out.println(i);
		}
	}



	

}
