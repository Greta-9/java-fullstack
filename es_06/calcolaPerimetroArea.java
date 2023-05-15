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
        int area;
        int perimetro;
        area = lato * lato;
        perimetro = lato * 4;
        System.out.println("Il lato inserito: " + lato); // concateno testo e variabile
        System.out.println("L'area e': " + area);
        System.out.println("Il perimetro e': " + perimetro);
        input.close(); 

    }
}
