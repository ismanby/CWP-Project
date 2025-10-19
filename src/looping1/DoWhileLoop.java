package looping1;

public class DoWhileLoop {
    public int getOddNumbersAndSum(int max) {
        
        int sum = 0; // untuk menyimpan total penjumlahan
        int number = 1; // mulai dari bilangan ganjil pertama

        // jika max kurang dari atau sama dengan 0, kembalikan 0
        if (max <= 0) {
            return 0;
        }

        // loop untuk menambahkan bilangan ganjil hingga max
        do {
            // cek apakah bilangan ganjil
            if (number % 2 != 0) {
                // jika ganjil, tambahkan ke total penjumlahan
                sum += number;
            }
            // tingkatkan bilangan
            number++;
        } while (number <= max); // ulangi selama bilangan kurang dari atau sama dengan max

        // kembalikan total penjumlahan bilangan ganjil
        return sum;
    }   
}