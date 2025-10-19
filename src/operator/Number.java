package operator;

public class Number {
    public String getOperatorResults(int a, int b) {
        // Penjumlahan
        int sum = a + b;

        // Perkalian
        int product = a * b;

        // Pemeriksaan kesamaan
        boolean isEqual = (a == b);

        // Operasi logika AND
        boolean logicalAnd = (a > 0 && b > 0);

        // Operasi logika OR
        boolean logicalOr = (a < 0 || b > 0);

        String result = "Sum: " + sum + "\n" +
                        "Product: " + product + "\n" +
                        "Is Equal: " + isEqual + "\n" +
                        "Logical AND: " + logicalAnd + "\n" +
                        "Logical OR: " + logicalOr;
        
        return result;
    }
}
