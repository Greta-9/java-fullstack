import java.util.Random; //importare la classe Random
public class RandomN2 {
    public static void main(String[] args) {
        Random rand = new Random(); //Creare un oggetto della classe random

        int randomInt = rand.nextInt(100); //Generare un intero casuale tra 0(incluso) e 100(escluso)
        System.out.println("Numero intero casuale: " + randomInt);

        double randomDouble = rand.nextDouble(); //Generare un double casuale tra 0.0(incluso) e 1.0 (escluso)
        System.out.println("Numero double casuale: " + randomDouble);

        boolean randomBoolean = rand.nextBoolean();//Generare un booleano casuale
        System.out.println("Numero booleano casuale: ");
    }
    
}
