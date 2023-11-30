package main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		
		
		while (true) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Inserisci il numero di parole che vuoi salvare");
		
		int numParole = scanner.nextInt();
		scanner.nextLine();
		
		Set<String> setParole = new HashSet<>();
		Set<String> setParoleDuplicate = new HashSet<>();
		
		for (int i = 0; i < numParole; i++) {
			System.out.println("Inserisci la parola n° " +  (i + 1));
			String parola = scanner.nextLine();
			
			if(!setParole.add(parola))
			setParoleDuplicate.add(parola);
		}
		System.out.println("Il numero di parole inserite è: " + setParole.size());
		System.out.println("///////////////////////////////////");
		System.out.println("le parole inserite sono: ");
		for (String parola : setParole) {
			System.out.println(parola);
		}	
		System.out.println("Le parole duplicate sono:");
		for (String parola : setParoleDuplicate) {
			System.out.println(parola);
		}
		
	    }
		
	}
}
