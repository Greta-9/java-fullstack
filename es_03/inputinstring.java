/* Esercitazione "INPUTINSTRING"
 * utilizzo della classe scanner e delle variabili di testo e numeriche
 * utilizzo delle condizioni con la variabile "soglia"
 */
import java.util.Scanner; 

public class inputinstring { 
    public static void main(String[] args) { 
                                        
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il nome: ");
        String nome = input.next(); 

        System.out.print("Inserisci la tua eta': ");
        int eta = input.nextInt();

       System.out.println("Ciao " + nome + "! Hai " + eta + " anni");

         int soglia = 18; 
        if (eta >= soglia) {
            System.out.print(" - sei maggiorenne");
        } 
        else if (eta < soglia) {
            System.out.print(" - sei minorenne");
        }
        input.close(); 
    }
}
/* Spiegazione completa:
RIGA5: abbiamo importato la classe Scanner, ciò una libreria di sistema, dal package java.util
RIGA7: la classe pubblica deve prendere il nome dal file a cui corrisponde e le sue parentesi 
graffe conterranno tutto il programma.
RIGA8: si istituisce un metodo(unico), in questo caso pubblico e main, a cui viene assorciata 
la struttura di array.
RIGA10: viene creato un nuovo oggetto Scanner(input) attraverso il metodo costruttore "new".
RIGA12, 15 e 18: stampa nella console ciò che è specificato all'interno della parentesi tonda.
RIGA13 e 16: assegno alla variabile stringa/intero "nome"/"eta" l'oggetto "input" con il metodo 
"next()"/"nextInt()". La parentesi vuota viene inserita perchè ci verrà restituito qualcosa.
RIGA20: istituisco la variabile intero "soglia" e le assegno un valore di riferimento (18).
RIGA21-26: utilizzo delle condizioni per cui il sistema reagirà in maniera differente in base 
alla variabile soglia (><=).
RIGA27-29: termino chiudendo l'input e le parentesi graffe del metodo e della classe.
 * 
 */