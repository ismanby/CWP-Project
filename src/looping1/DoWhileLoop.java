package looping1;

public class DoWhileLoop {
    public int getOddNumbersAndSum(int max) {
        int sum = 0;
        int number = 1;

        if (max <= 0) {
            return 0;
        }

        do {
            if (number % 2 != 0) {
                sum += number;
            }
            number++;
        } while (number <= max);

        return sum;
    }   
}