import java.util.Scanner;
import java.util.Random;
public class IndovinaNumR2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random casuale = new Random();
        System.out.println("Ciao! Come ti chiami? ");
        String nome = input.nextLine();
        System.out.println("Benvenut* " + nome + " Vuoi tentare la fortuna?");
        int casual = casuale.nextInt(101);
        int num;
        int tentativi = 0;
        do
        {
            System.out.println("Indovina a quale numero sto pensando tra 0 e 100: ");
            num = input.nextInt();
            tentativi ++;
            if (num<casual)
            {
                System.out.println("Peccato! Il numero che hai scelto e' troppo basso");
            }
            else if (num>casual)
            {
                System.out.println("Peccato! Il numero che hai scelto e' troppo alto!");
            }
            if (tentativi>6)
            {
                System.out.println("Hai finito i tentativi!");
                break;
            }
        }
        while (num != casual);
        System.out.println("Il numero da indovinare era: " + casual);
        System.out.println("Ci sei riuscit*?");
    }
}
