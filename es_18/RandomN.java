
public class RandomN {
    public static void main(String[] args) {
        int max_num = 5; //dichiaro una variabile che sara' il massimo valore del numero random
        int min_num = 1; //dichiaro un valore minimo
        double rnum = Math.random() * (max_num - min_num) + min_num; // dichiaro una variabile double perchè il metodo Math.random genera double
        // moltiplico il Math.random() per (il valore massimo meno il valore minimo) e aggiungo il valore minimo
        int Rnum = (int) rnum;// converto la variabile double in un intero
        System.out.println(Rnum);
    }
    
}
