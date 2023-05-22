import java.util.Scanner;
import java.util.Arrays;

public class cercaArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci la dimensione dell'array: ");
        int dimensione = input.nextInt(); // creao una variabile dimensione e le assegno il valore inserito dall'utente
        int[] array = new int[dimensione]; //dichiaro che la grandezza dell'array corrisponde alla variabile dimensione
        System.out.println("Inserisci gli elementi dell'array: ");
        for (int i = 0; i < dimensione; i++) //il ciclo for continua finchè il contatore raggiunge la variabile dimensione
        {
            array[i] = input.nextInt(); //assegno gli input dell'utente ad un array della dimensione del contatore
        }
        System.out.print("Inserisci il numero da cercare: ");
        int daCercare = input.nextInt();//definisco una variabile e la inizializzo con il valore inserito dall'utente
        int indice = -1;// assegno il valore -1 alla variabile indice
        for (int i = 0; i < dimensione; i++)
        {
            if (array[i] == daCercare) //se ad un determinato indice trovi il numero inserito dall'utente
            {
                indice = i;
                break;// esci dal programma
            }
        }
            if (indice != -1)
            {
                System.out.println("Il numero si trova nell'indice " + indice + " dell'array.");
            }
            else
            {
                System.out.println("L'elemento non e' presente nella lista.");
            }
        input.close();
    }
}
