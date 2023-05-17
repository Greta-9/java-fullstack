/*
 * Esercitazione "listForEach"
 * creare una lista e utilizzare il for each sugli elementi da cui è composta.
 */
import java.util.ArrayList;
import java.util.List; //importo la classe lista 

public class listForEach 
{
    public static void main(String[] args) 
    {
        List<String> fruits = new ArrayList<String>();
        fruits.add("Mela"); //il metodo add della classe aggiunge un elemento alla lista
        fruits.add("Banana");
        fruits.add("Arancia");
        for (String fruit : fruits)
        {
            System.out.println(fruit);
        }      
    }
}
