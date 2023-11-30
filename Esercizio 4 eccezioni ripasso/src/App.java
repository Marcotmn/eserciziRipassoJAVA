import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import exception.ArrayException;

public class App {

	    public static void main(String[] args) {
	    	
	    	
	    	Scanner scanner = new Scanner(System.in);
	    	Random random = new Random();
	    	int[] array = new int[5];
	    	
	    	for (int i = 0; i < array.length; i++) {
	    		array[i] = random.nextInt(11);
	    	}
	    	
	    	System.out.println("array originale: " + Arrays.toString(array));
	    	
	    	int posizione;
	    	int valore;
	    	
	    	while(true) { //IL WHILE SERVE PER RICOMINCIARE DA CAPO NELL'EVENTUALITà IL PROGRAMMA ARRIVI ALLA FINE O RICONOSCA UN ERRORE NELL'INSERIMENTO.
	    				  //SENZA IL WHILE IL PROGRAMMA SI INTERROMPEREBBE E DOVREBBE ESSER RILANCIATO OGNI VOLTA.
	    	
	    	try {		  //SENZA IL TRY CATCH: L'ECCEZIONE SAREBBE STATA INVIATA COMUNQUE MA TUTTA L'APPLICAZIONE SI SAREBBE INTERROTTA. INVECE COSì NEL BLOCCO CATCH è POSSIBILE GESTIRE IL COMPORTAMENTO DI QUESTA SINGOLA FUNZIONE DELL'APPLICAZIONE SENZA INTERROMPERLA DEL TUTTO.
	    		System.out.println("Inserisci la posizione (da 1 a 5)");
	    		posizione = scanner.nextInt();
	    		
	    		if (posizione < 1 || posizione > 5) {
	    			throw new ArrayException("ERRORE: la posizione deve essere compresa tra 1 e 5");
	    		} else {
	    			 System.out.println("Inserisci un valore o 0 per uscire");
		              valore = scanner.nextInt();
	    			
	    		} if(valore != 0) {
                array[posizione - 1] = valore;
                System.out.println("Nuovo stato dell'array: " + Arrays.toString(array));
                } else {
                	System.out.println("uscita dal programma");
                	break;
                }
	    	}
             catch (InputMismatchException e) {
                System.out.println("Devi inserire un numero intero.");
                scanner.next(); //QUESTA STRINGA DI CODICE SERVE PER PULIRE IL BUFFER DELLO SCANNER
            } catch (ArrayException e) {//QUESTO CATCH è FONDAMENTALE PER IL THROW DELL'ECCEZIONE PERSONALIZZATA; SENZA QUESTO NON VERREBBE LANCIATA.
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}    	