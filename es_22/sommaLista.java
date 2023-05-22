import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sommaLista
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        List<Integer> lista = new ArrayList<Integer>();
        System.out.println("Inserisci gli elementi della lista (inserisci 0 per terminare l'inserimento: )");
        int elemento = input.nextInt();
        while (elemento != 0)//essendo l'input di uscita dal ciclo while, non è possibile aggiungere lo 0 alla lista
        {
            lista.add(elemento);//l'elemento, cioè gli input inseriti dall'utente, vengono aggiunti alla lista
            elemento = input.nextInt();
        }
        int somma = 0;
        for ( Integer numero : lista)// il ciclo for continua per ogni numero della lista
        {
            somma += numero;// sommo tra loro i vari elementi della lista
        }
        System.out.println("La somma degli elementi della lista e' " + somma + ".");
        input.close();
    }
    
}
