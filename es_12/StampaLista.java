import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StampaLista {
    public static void main(String[] args) {
        List<String> prodotti = new ArrayList<String>();
        List<String> spesa = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        prodotti.add("Mele");
        prodotti.add("Pasta");
        prodotti.add("Cavolfiore");
        int scelta;
        System.out.println("Ecco la lista dei prodotti: ");
        for (String prod : prodotti) 
            {
                System.out.println(prod);
            }
        while (prodotti.isEmpty() == false) 
        {
            System.out.println("Vuoi aggiungere un prodotto alla tua spesa?");
            System.out.println("Digita '+1' se vuoi aggiungere qualcosa oppure digita '0' ");
            scelta = input.nextInt();
            switch (scelta) 
            {
                case +1:
                  String aggiunta;
                  System.out.print("Cosa vuoi aggiungere alla tua lista?");
                  aggiunta = input.next();
                  spesa.add(aggiunta);
                  prodotti.remove(aggiunta);
                  System.out.println("Questi sono i prodotti rimasti: ");
                  for (String prodotto : prodotti) 
                  {
                     System.out.println(prodotto);
                  }
                  System.out.println("Ecco la tua lista della spesa: ");
                  for (String spe : spesa)
                  {
                     System.out.println(spe);
                  }
                  break;
                case 0:
                  System.out.println("Hai scelto di non aggiungere niente alla tua lista della spesa.");
                  break;
                default:
                  System.out.println("Input non valido!");
            }
        }
        System.out.println("I prodotti sono terminati. Grazie e arrivederci!");
    }
}
