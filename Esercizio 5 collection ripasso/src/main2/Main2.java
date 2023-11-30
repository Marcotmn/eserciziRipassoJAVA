package main2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		casualiOrdinati();
		
		ordinataReverse();
		
		List<Integer> listaNumeri = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		pariDispari(listaNumeri, false);
		
	}
	
	public static void casualiOrdinati() {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Inserisci un intero N");
		int interiCasuali = scanner.nextInt();
		scanner.nextLine();
		
		List<Integer> arrayList = new ArrayList<>();
		
		for (int i = 0; i < interiCasuali; i++) {
			int numeroCasuale = random.nextInt(101);
			
			arrayList.add(numeroCasuale);
		}
		
		Collections.sort(arrayList);
		
		System.out.println("Ecco la lista di N numeri casuali ordinata: " + arrayList);
		System.out.println(arrayList.size());
		
	}
	
	public static void ordinataReverse() {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Inserisci un intero N");
		int interiCasuali = scanner.nextInt();
		scanner.nextLine();
		
		List<Integer> arrayList = new ArrayList<>();
		
		for(int i = 0; i < interiCasuali; i++) {
			arrayList.add(random.nextInt(101));
		}
			
			List<Integer> nuovaLista = new ArrayList<>(arrayList);
			
			Collections.reverse(arrayList);
			nuovaLista.addAll(arrayList);
			System.out.println("Ecco la lista di N numeri casuali seguita dalla stessa lista con ordine inverso");
			System.out.println(nuovaLista);


		}
	
	public static void pariDispari(List<Integer> interi, boolean valoreBooleano) {
		
		List<Integer> valoriPari = new ArrayList<>();
		List<Integer> valoriDispari = new ArrayList<>();
		
		for (int numero : interi) {
			if( numero % 2 == 0) {
				valoriPari.add(numero);
			} else {
				valoriDispari.add(numero);
			}
		}
		
		if (valoreBooleano) {
			System.out.println("Lista valori positivi: " + valoriPari);
		}else {
			System.out.println("Lista valori negativi: " + valoriDispari);
		}
		
	}
}
		
	



