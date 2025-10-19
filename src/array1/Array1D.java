package array1;

public class Array1D {
    public String getArrayInfo(int[] arr) {
        // Mengecek array kosong, jika kosong hasilnya 0  
        if (arr == null || arr.length == 0) {
            return "Sum: 0";
        }

        // Variabel untuk menyimpan total penjumlahan
        int sum = 0;

        StringBuilder elementString = new StringBuilder();

        // memeriksa setiap elemen dalam array
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];

            // Menambahkan elemen ke total penjumlahan
            sum += element;

            // Menambahkan elemen ke string output
            elementString.append(element);

            // Menambahkan spasi jika bukan elemen terakhir
            if (i < arr.length - 1) {
                elementString.append(" ");
            }
        }
        // Membuat output akhir
        String output = elementString.toString()  + "\n" + "Sum: " + sum;
        return output;
    }
}
