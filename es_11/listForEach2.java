/*
 * Esercitazione "listForEach2"
 * creare una lista e poi chiedere all'utente un elemento da eliminare
 * ristampare la lista aggiornata
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List; //importo la classe lista 
import java.util.Scanner;

public class listForEach2 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); // è necessario creare un nuovo scanner per la richiesta all'utente
        List<String> fruits = new ArrayList<String>();
        try 
        {
            fruits.add("Mela"); //il metodo add della classe aggiunge un elemento alla lista
            fruits.add("Banana");
            fruits.add("Arancia");
            fruits.add("Pera");
            fruits.add("Fragola");
            for (String fruit : fruits) 
            {
                System.out.println(fruit);
            }     
            System.out.println("Srivi '+1' se vuoi aggiungere un elemento o '-1' se lo vuoi togliere: ");
            int scelta =input.nextInt();
            if (scelta == +1 )
            {
                System.out.println("Quale frutto vuoi aggiungere alla lista? ");
                fruits.add(input.next());
                System.out.println("Ecco la lista aggiornata: ");
                for (String frutta : fruits) //creo un nuovo ciclo for per elencare la lista aggiornata con l'eliminazione effetuata dall'utente
                {
                    System.out.println(frutta);
                }

            }
            else if (scelta == -1) 
            {
                System.out.print("Quale frutto vuoi eliminare dalla lista? ");
                fruits.remove(input.next());
                System.out.println("Ecco la lista aggiornata: ");
                for (String frutti : fruits)
                {
                    System.out.println(frutti);
                }

            }
            else 
            {
                System.out.println("Non hai scelto nessuna opzione :( )");
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Errore! Input non valido :( )");
        } 
        input.close();
    }
}
