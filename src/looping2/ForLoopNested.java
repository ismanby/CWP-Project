package looping2;

public class ForLoopNested {
    public String getGrid(int max) {
        // cek jika max kurang dari atau sama dengan 0
        if (max <= 0) {
            return "";
        }

        StringBuilder output = new StringBuilder();
        // hitung total elemen yang akan dicetak
        int totalIterations = max * max;
        int count = 0;
        
        // looping nested untuk mencetak grid
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= max; j++) {

                // menambahkan baris dan kolom ke output
                output.append("Row ").append(i).append(" Col ").append(j);
                count++;

                // menambahkan newline jika bukan elemen terakhir
                if (count < totalIterations) {
                    output.append("\n");
                }
            }
        }
        // mengembalikan string hasil
        return output.toString();
    }
}