package looping1;

public class WhileLoop {
    public int getEvenNumbersAndSum(int max) {
        // variabel untuk menyimpan jumlah
        int sum = 0;
        // variabel untuk menyimpan angka genap
        int number = 2;

        // looping while untuk menjumlahkan angka genap hingga max
        while (number <= max) {
            // menambahkan angka genap ke jumlah
            sum += number;
            // menambahkan 2 ke angka untuk mendapatkan angka genap berikutnya
            number += 2;
        }
        
        // mengembalikan jumlah angka genap
        return sum;
    }   
}