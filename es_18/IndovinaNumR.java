import java.util.Random;
import java.util.Scanner;

public class IndovinaNumR
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double numR = Math.random() * 100; //Math.random() genera un numero double casuale tra 0 e 0.99, quindi lo moltiplico per 100
        int numeroR = (int)numR; //rendo in double numR un intero chiamato numeroR
        System.out.println("Ciao! Come ti chiami? ");
        String nome = input.nextLine();
        System.out.println("Benvenut* " + nome + "! Vuoi tentare la fortuna?");
        int num;
        int tentativi = 0;
        do
        {
            System.out.println("Indovina a quale numero sto pensando tra 0 e 100: ");
            num = input.nextInt();
            tentativi++;
            if (num < numeroR) //stabilisco delle condizioni basate sul valore del numero casuale generato dal programma
            {
                System.out.println("Peccato! Il numero che hai scelto e' troppo basso");
            }
            else if (num > numeroR)
            {
                System.out.println("Peccato! Il numero che hai scelto e' troppo alto!");
            }
        }
        while (num != numeroR); //il programma continua a girare in loop finchè il numero che inserisco è diverso da quello casuale
        System.out.println("Complimenti " + nome + "! Hai indovinato il numero " + numeroR + " in " +tentativi + " tentativi!");
        input.close();
    }
    
}
