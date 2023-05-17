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
        fruits.add("Mela"); //il metodo add della classe aggiunge un elemento alla lista.
        fruits.add("Banana");
        fruits.add("Arancia");
        fruits.clear();
        //fruits.clear(); = metodo per pulire la lista.
        //fruits.remove(0); = metodo per rimuovere un elemento della lista, in questo caso quello in posizione (0), cioè Mela.
        // fruits.size(); = metodo che calcola il numero di elementi della lista.
        fruits.isEmpty(); //= metodo che verifica se la lista è vuota (se si = true / se no = false) 
        for (String fruit : fruits)
        {
            System.out.println(fruit);
            //System.out.println(fruits.size()); = stampa il loop il numero di elementi della lista.
            //System.out.pritnln(fruits.isEmpty()); = stampa in loop se la condizione isEmpty è vera o falsa
        } 
    }
}
/* 
 * Se inserissi il fruits.clear(); nella posizione in cui si trova e poi inserissi il System.out.println(fruits.isEmpty()); nel ciclo for
 * il programma non mi restituirebbe nulla, neanche il true perchè la lista vuota non entrerebbe neanche nel ciclo. Al contrario, se inserissi
 * il System.out.printlin(fruits.isEmpty()); in fondo, fuori dalle graffe del ciclo for, il programma mi restituirebbe solo true.
 */
