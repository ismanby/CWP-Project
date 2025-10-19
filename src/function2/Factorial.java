package function2;

public class Factorial {
    // fungsi untuk menghitung faktorial dari sebuah bilangan
    public int factorial(int n) {
        // faktorial dari 0 adalah 1
        if (n == 0) {
            return 1;
        }

        // menghitung faktorial untuk n > 0
        int result = 1;

        // loop dari 1 hingga n untuk menghitung faktorial
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        
        // mengembalikan hasil faktorial
        return result;
    }
}
