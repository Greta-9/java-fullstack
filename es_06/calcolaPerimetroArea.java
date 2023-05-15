/*
 * Esercitazione "calcolaPerimetroArea"
 * Caricare più volte delle modifiche su github per visualizzare i diversi commit 
 * + verifica dubbi (es: differenza println e print)
 */

import java.util.Scanner; 
public class calcolaPerimetroArea { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci la lunghezza del lato: ");
        int lato; 
        lato = input.nextInt(); 
        if (lato > 40 || lato < 1) { //aggiunta una condizione aggiuntiva che verifica l'input sia compreso tra due valori
            System.out.println("Il numero inserito non e' valido"); // se l'input è >40
        }
        else { //se l'input è <= a 40
        int area;
        int perimetro;
        area = lato * lato;
        perimetro = lato * 4;
        System.out.println("Il lato inserito: " + lato); 
        System.out.println("L'area e': " + area);
        System.out.println("Il perimetro e': " + perimetro); 
        }
        input.close(); // lascio fuori da if/else la chiusura dell'input

    }
}
