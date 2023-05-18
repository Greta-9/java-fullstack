/* Esercitazione "INPUTEXAMPLE"
 * 
 */
import java.util.Scanner; // importo la classe Scanner (libreria di sistema)

public class inputexample { //la classe pubblica prende il nome del file e aprola parentesi graffa che conterrà il programma
    public static void main(String[] args) { //istituisco un metodo pubblico main
        Scanner input = new Scanner(System.in); //creo un nuovo oggetto Scanner (input) con il metodo costruttore "new"
        System.out.print("Inserisci un numero decimale: "); //stampa nella console
        double num1 = input.nextDouble(); //assegno alla variabile double "num1" il metodo "nextDouble()" [numero decimale]
      
        System.out.print("Inserisci una stringa: "); // stampa
        input.nextLine();
        String str = input.nextLine(); //assegno alla variabile stringa "str" il metodo "next()" [stringa]
        
        System.out.print("Inserisci un carattere: "); // stampa 
        char c = input.next().charAt(0); //assegno alla variabile carattere "c" il metodo "next()" e poi la converto con "CharAt(0)"[carattere]
        
        System.out.println("Il numero decimale inserito e': " + num1); //stampa
        System.out.println("La stringa inserita e': " + str);   
        System.out.println("Il carattere inserito e': " + c);
        input.close(); //chiusura input
    } 
}
/*note
 * IMPORTANTE: NON SI POSSONO METTERE GLI SPAZI SE SI UTILIZZA IL METODO "next()"
 * RIGA14: alla variabile "c" viene assegnato il metodo "next()" e poi viene convertita 
 */
