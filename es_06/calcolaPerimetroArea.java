/*
 * Esercitazione "calcolaPerimetroArea"
 * Caricare più volte delle modifiche su github per visualizzare i diversi commit 
 * + verifica dubbi (es: differenza println e print)
 */

import java.util.InputMismatchException;
import java.util.Scanner; 
public class calcolaPerimetroArea 
{ 
    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in);
        try 
        {
           System.out.print("Inserisci il tuo nome: ");
           String nome = input.nextLine();
           System.out.print("Inserisci la lunghezza del lato: ");
           int lato; 
           lato = input.nextInt(); 
           if (lato > 40 || lato < 1) { 
             if (lato > 40) {
            System.out.println(nome + " il numero che hai inserito e' troppo grande!"); // se l'input>40
            }
             if (lato < 1) {
            System.out.println(nome + " il numero che hai inserito e' troppo piccolo!"); // se l'input<1
            }
           }
           else { //se l'input è <= a 40
           int area;
           int perimetro;
           area = lato * lato;
           perimetro = lato * 4;
           System.out.println(nome + " il lato che hai inserito e': " + lato); 
           System.out.println("L'area e': " + area);
           System.out.println("Il perimetro e': " + perimetro); 
           }
        }
        catch (InputMismatchException e) {
            System.out.println("Errore: input non valido.");
        input.close(); // lascio fuori da if/else la chiusura dell'input

        }
    }
}
