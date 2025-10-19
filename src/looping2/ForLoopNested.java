package looping2;

public class ForLoopNested {
    public String getGrid(int max) {
        if (max <= 0) {
            return "";
        }

        StringBuilder output = new StringBuilder();
        int totalIterations = max * max;
        int count = 0;
        
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= max; j++) {

                output.append("Row ").append(i).append(" Col ").append(j);
                count++;

                if (count < totalIterations) {
                    output.append("\n");
                }
            }
        }
        return output.toString();
    }
}