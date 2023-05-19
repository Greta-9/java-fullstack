import java.util.Scanner;
public class IndovinaNumero
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ciao! Come ti chiami? ");
        String nome = input.nextLine();
        System.out.println("Benvenut* " + nome + " Vuoi tentare la fortuna?");
        int num;
        int tentativi = 0;
        do
        {
            System.out.println("Indovina a quale numero sto pensando tra 0 e 100: ");
            num = input.nextInt();
            tentativi ++;
            if (num>=0 && num<38)
            {
                System.out.println("Peccato! Il numero che hai scelto e' troppo basso");
                System.out.println("Ritenta");
            }
            else if (num>38 && num<=100)
            {
                System.out.println("Peccato! Il numero che hai scelto e' troppo alto!");
                System.out.println("Ritenta");
            }
            else if (num<0 || num > 100)
            {
                System.out.println("Sei fuori strada! Il numero a cui sto pensando e' compreso tra 0 e 100!");
                System.out.println("Ritenta");
            }
        }
        while (num != 38 || tentativi <= 3);
        System.out.println("Complimenti " + nome + "! Hai indovinato il numero!");
    }
}
