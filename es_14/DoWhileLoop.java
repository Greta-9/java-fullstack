import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int num;
        do  // viene eseguito almeno una volta
        {
            System.out.print("Inserisci un numero o inserisci 0 per uscire: ");
            num = input.nextInt();
            System.out.println("Hai inserito " + num);

        }
        while (num != 0); //viene eseguito solo se la condizione è soddisfatta
        input.close();
        
    }
    
}
