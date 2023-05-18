import java.util.Scanner;

public class Somma2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        String nome = input.nextLine();
        System.out.print("Inserisci il tuo cognome: ");
        String cognome = input.nextLine();
        System.out.println("Ciao " + nome  + cognome);
        System.out.print("Inserisci il primo numero: ");
        Double num1 = input.nextDouble();
        System.out.print("Inserisci il secondo numero: ");
        Double num2 = input.nextDouble();
        Double sum = num1 + num2;
        System.out.println("La somma dei numeri che hai inserito e': " + sum);
        System.out.println("Buona giornata " + nome);
        input.close();
    }
}
