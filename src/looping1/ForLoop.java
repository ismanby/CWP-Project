package looping1;

public class ForLoop {
    public int getNumbersAndSum(int max) {
        // varaibel untuk menyimpan jumlah
        int sum = 0;

        // looping dari 1 sampai max
        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        
        // mengembalikan jumlah
        return sum;
    }
}
