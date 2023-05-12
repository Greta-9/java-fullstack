/* Esercitazione "CacolaPeA" 
 * Creare un programma che chieda all'utente di inserire la lunghezza del lato e 
 * resituisce in output l'area ed il perimetro di un quadrato
*/
import java.util.Scanner;

public class CalcolaPeA {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Inserisci la lunghezza del lato del quadrato: ");
    Double lato = input.nextDouble();
    System.out.print("Inserisci l'unita' di misura: ");
    String unita = input.next();
    
    
    if (lato > 400 || lato < 1){
      System.out.println("Il numero inserito non e' valido");
    }
    else { 

    //Double per = lato * 4;
    //Double area = lato * lato;
    Double risp = lato * 4;
    Double risa = lato * lato;
    String per = risp + unita;
    
    String area = risa + unita;
    System.out.println("Il perimetro del quadrato e': " + per);
    
    System.out.println("L'area del quadrato e': " + area + "²");
    }
   input.close(); 
 }    
}
/*
 * In alternativa si potrebbe istituire un soglia compresa 1<soglia<400 e basare gli if/else
 * su di essa.
 */