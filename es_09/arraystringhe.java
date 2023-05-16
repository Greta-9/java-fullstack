
public class arraystringhe {
    public static void main(String[] args) {
        String[] nomif = {"Anna", "Giulia", "Sofia", "Greta", "Marta"};
        for (String i : nomif) {
            System.out.println(i);
        }   
        int dim = nomif.length;
        System.out.println("Sono stati elencati " + dim + " nomi");
    }
}
