/*
 * Esercitazione "listForEach2"
 * creare una lista e poi chiedere all'utente un elemento da eliminare
 * ristampare la lista aggiornata
 */
import java.util.ArrayList;
import java.util.List; //importo la classe lista 
import java.util.Scanner;

public class listForEach2 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); // è necessario creare un nuovo scanner per la richiesta all'utente
        List<String> fruits = new ArrayList<String>();
        fruits.add("Mela"); //il metodo add della classe aggiunge un elemento alla lista
        fruits.add("Banana");
        fruits.add("Arancia");
        fruits.add("Pera");
        fruits.add("Fragola");
        for (String fruit : fruits) 
        {
            System.out.println(fruit);
        }      
        System.out.print("Quale di questi frutti vuoi eliminare dalla lista? ");
        //int daE = input.nextInt();
        //fruit.remove(daE);
        fruits.remove(input.nextLine()); //inserire tra le parentesi del remove lo scanner
        System.out.println("Ecco la lista aggiornata: ");
        for (String frutta : fruits) //creo un nuovo ciclo for per elencare la lista aggiornata con l'eliminazione effetuata dall'utente
        {
            System.out.println(frutta);
        }
    }
}
