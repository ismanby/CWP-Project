package looping2;

public class DoWhileLoopNested {
    public String getNumberTriangle(int maxRows) {
        if (maxRows <= 0) {
            return "";
        }

        StringBuilder output = new StringBuilder();
        int i = 1;

        do {
            int j = 1;

            do {
                output.append(j);
                j++;
            } while (j <= i);

            if (i < maxRows) {
                output.append("\n");
            }

            i++;
        } while (i <= maxRows);

        return output.toString();
    }   
}