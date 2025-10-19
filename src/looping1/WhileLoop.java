package looping1;

public class WhileLoop {
    public int getEvenNumbersAndSum(int max) {
        int sum = 0;
        int number = 2;

        while (number <= max) {
            sum += number;
            number += 2;
        }
        
        return sum;
    }   
}