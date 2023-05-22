import java.util.Arrays; // importo la classe
import java.util.Scanner;

public class copiaArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci la dimensione dell'Array: ");
        int dimensione = input.nextInt(); //creo una variabile chiamata dimensione e le assegno il valore inserito dall'utente
        int[] array = new int[dimensione];// dichiaro che la grandezza dell'array corrisponde alla variabile dimensione, cioè al numero scelto dall'utente
        System.out.println("Inserisci gli elementi dell'Array: ");
        int i;
        for (i = 0; i < dimensione; i++);
        {
            array[i] = input.nextInt();
        }
        int[] arrayCopia = new int[dimensione]; //creo un secondo array con le stesse caratteristiche del primo
        for (i = 0; i < dimensione; i++);
        {
            arrayCopia[i] = array[i];
        }
        System.out.println("L'Array originale e': " + Arrays.toString(array));
        System.out.println("L'Array copiato e': " + Arrays.toString(arrayCopia));
        input.close();
    }
    
}
