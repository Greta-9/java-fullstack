import java.util.Scanner;

public class Somma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Inserisci il primo numero: ");
        int num1 = input.nextInt();
        System.out.print("Inserisci il secondo numero: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.print("Inserisci il tuo nome: ");
        String nome = input.next();
        System.out.print("Inserisci il tuo cognome: ");
        String cognome = input.next();
        System.out.println("Ciao " + nome + cognome);

        System.out.println("La somma dei numeri che hai inserito e': " + sum);
        System.out.println("Buona giornata!");
        input.close();
    }
}
