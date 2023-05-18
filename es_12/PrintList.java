import java.util.ArrayList;
import java.util.List; //importo la classe lista 
import java.util.Scanner;

public class PrintList 
{
    public static void main(String[] args) 
    {
        List<String> prodotti = new ArrayList<String>();
        List<String> spesa = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        prodotti.add("Mela"); //il metodo add della classe aggiunge un elemento alla lista
        prodotti.add("Pasta");
        prodotti.add("Pollo");
        prodotti.add("Fragole");
        prodotti.add("Carote");
        prodotti.add("Cavolfiore");
       
     while ( prodotti.isEmpty() == false){
         System.out.println("Ecco la lista dei nostri prodotti: ");
        for (String prodotto : prodotti)
        {
            System.out.println(prodotto);
        }
        System.out.println("Cosa vuoi aggiungere alla tua spesa?");
        String aggiunto = input.next();
        spesa.add(input.next());
        prodotti.remove(input.next());
        System.out.println("Ecco la tua lista: ");
        for (String spe : spesa)
        {
            System.out.println(spe);
        }
        prodotti.isEmpty();
    }
       

    }
}