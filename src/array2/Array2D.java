package array2;

import java.util.Locale;

public class Array2D {
    public String getMatrixInfo(int[][] matrix) {
        StringBuilder output = new StringBuilder();
        // Inisialisasi variabel untuk total penjumlahan dan jumlah elemen
        long totalSum = 0;
        int elementCount = 0;

        // Memeriksa setiap elemen dalam matriks
        for (int i = 0; i < matrix.length; i++) {
            // Menambahkan informasi baris
            output.append("Row ").append(i + 1).append(": ");
            for (int j = 0; j < matrix[i].length; j++) {
                int element= matrix[i][j];
                // cek ganjil/genap
                String parity = (element % 2 == 0) ? "E" : "O";
                // Menambahkan elemen ke output
                output.append(element).append(parity).append(" ");
                // Menambahkan elemen ke total penjumlahan dan menghitung jumlah elemen
                totalSum += element;
                elementCount++;
            }
            output.append("\n");
        }
        // Menghitung rata-rata
        double average = 0.0;
        if (elementCount > 0) {
            average = (double) totalSum / elementCount;
        }
        // Menambahkan total dan rata-rata ke output
        output.append("Total: ").append(totalSum).append("\n");
        // Format rata-rata dengan satu angka di belakang koma
        String averageFormatted = String.format(Locale.US, "%.1f", average);
        output.append("Average: ").append(averageFormatted);

        return output.toString();
    }   
}