
public class BreakLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) 
        {
            if(i == 5) //se all'interno del ciclo for si verifica questa condizione
            {
                break; //esci dal programma
            }
            System.out.println(i);
        }
    }
    
}
