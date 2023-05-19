import java.util.Scanner;

public class GuessNumer
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numToGuess = (int)((Math.random() * (100 - 1)) + 1);
        System.out.println(numToGuess);
        while (true)
        {
            System.out.println ("Inserisci un numero da 1 a 100: ");
            int userGuess = input.nextInt();
            if (userGuess == numToGuess)
            {
                System.out.println("Bravo! Hai indovinato il numero: " + numToGuess);
                break;
            }
            else if (userGuess < numToGuess)
            {
                System.out.println("Il numero che hai inserito e' troppo basso.");
            }
            else
            {
                System.out.println("Il numero che hai inserito e' troppo alto.");
            }

        }
        
    }
    
}
