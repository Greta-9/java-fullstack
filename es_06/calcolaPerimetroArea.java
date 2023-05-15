/*
 * Esercitazione "calcolaPerimetroArea"
 * Caricare più volte delle modifiche su github per visualizzare i diversi commit 
 * + verifica dubbi (es: differenza println e print)
 */

import java.util.Scanner; //libreria che serve per utilizzare i metodi di scanner
public class calcolaPerimetroArea { //la classe deve corrispondere al nome del file .java
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci la lunghezza del lato: ");
        int lato; // questo sarà il parametro che utilizzerò per i calcoli
        lato = input.nextInt(); // legge il prossimo intero dall'input
        int area;
        int perimetro;
        area = lato * lato;
        perimetro = lato * 4;
        System.out.println("Il lato inserito: " + lato);
        System.out.println("L'area e': " + area);
        System.out.println("Il perimetro e': " + perimetro);
        input.close(); // la chiusura è opzionale, ma se non viene fatta l'input resta evidenziato in giallo

    }
}
