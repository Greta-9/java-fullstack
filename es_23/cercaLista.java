import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class cercaLista
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        List<String> lista = new ArrayList<String>();
        System.out.println("Inserisci gli elementi della lista (e scrivi \"fine\" per terminare l'inserimento): ");
        String elemento = input.nextLine();
        while (!elemento.equals("fine"))//finchè l'elemento è diverso da "fine"
        {
            lista.add(elemento);
            elemento = input.nextLine();
        }
        System.out.println("Inserisci l'elemento da cercare: ");
        String daCercare = input.nextLine();
        int indice = lista.indexOf(daCercare);
        if (indice != -1)
        {
            System.out.println("L'elemento si trova all'indice " + indice + " della lista.");
        }
        else
        {
            System.out.println("L'elemento non e' presente nella lista");
        }
        input.close();
    }
    
}
