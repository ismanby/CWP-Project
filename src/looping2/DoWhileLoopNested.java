package looping2;

public class DoWhileLoopNested {
    public String getNumberTriangle(int maxRows) {
        // cek apakah maxRows valid
        if (maxRows <= 0) {
            return "";
        }

        StringBuilder output = new StringBuilder();
        // looping baris
        int i = 1;

        // looping kolom
        do {
            int j = 1;

            // looping untuk mencetak angka pada setiap baris
            do {
                output.append(j);
                j++;
            } while (j <= i);

            // tambahkan baris baru jika bukan baris terakhir
            if (i < maxRows) {
                output.append("\n");
            }

            // increment baris
            i++;
        } while (i <= maxRows); // lanjut selama i kurang dari atau sama dengan maxRows

        // kembalikan hasil sebagai string
        return output.toString();
    }   
}