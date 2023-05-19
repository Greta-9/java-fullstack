import java.util.Scanner;

public class IndovinaVP {
    public static void main(String[] args) {
        int numeroDaIndovinare = 11;
        Scanner input = new Scanner(System.in);
        int tentativo;
        boolean vincita = false;
        while (vincita == false) 
        {
            System.out.println("Indovina un numero tra 1 e 100: ");
            tentativo = input.nextInt();
            if (tentativo == numeroDaIndovinare)
            {
                vincita = true;
            } 
            else if (tentativo < numeroDaIndovinare) 
            {
                System.out.println("Troppo Basso!");
            }
            else if (tentativo > numeroDaIndovinare) 
            {
                System.out.println("Troppo alto!");
            }
        }
        System.out.println("Bravo! Hai indovinato!");
        input.close();

    }
    
}
