package looping2;

public class WhileLoopNested {
    public String getTriangle(int max) {

        // cek jika max kurang dari atau sama dengan 0
        if (max <= 0) {
            return "";
        }

        StringBuilder output = new StringBuilder();
        
        // looping nested untuk mencetak segitiga
        int i = 1;
        while (i <= max) {
            // cetak bintang pada setiap baris
            int j = 1;
            while (j <= i) {
                output.append("*");
                j++;
            }
            // tambahkan newline jika bukan baris terakhir
            if (i < max) {
                output.append("\n");
            }
            // pindah ke baris berikutnya
            i++;
        }

        // mengembalikan string hasil
        return output.toString();
    }
}