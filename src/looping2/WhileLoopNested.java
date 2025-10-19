package looping2;

public class WhileLoopNested {
    public String getTriangle(int max) {

        if (max <= 0) {
            return "";
        }

        StringBuilder output = new StringBuilder();
        
        int i = 1;
        while (i <= max) {
            int j = 1;
            while (j <= i) {
                output.append("*");
                j++;
            }
            if (i < max) {
                output.append("\n");
            }
            i++;
        }
        return output.toString();
    }
}