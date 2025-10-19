package array2;

import java.util.Locale;

public class Array2D {
    public String getMatrixInfo(int[][] matrix) {
        StringBuilder output = new StringBuilder();
        long totalSum = 0;
        int elementCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            output.append("Row ").append(i + 1).append(": ");
            for (int j = 0; j < matrix[i].length; j++) {
                int element= matrix[i][j];
                String parity = (element % 2 == 0) ? "E" : "O";
                output.append(element).append(parity).append(" ");
                totalSum += element;
                elementCount++;
            }
            output.append("\n");
        }
        double average = 0.0;
        if (elementCount > 0) {
            average = (double) totalSum / elementCount;
        }
        output.append("Total: ").append(totalSum).append("\n");
        String averageFormatted = String.format(Locale.US, "%.1f", average);
        output.append("Average: ").append(averageFormatted);

        return output.toString();
    }   
}