package array1;

public class Array1D {
    public String getArrayInfo(int[] arr) {
        if (arr == null || arr.length == 0) {
            return "Sum: 0";
        }

        int sum = 0;

        StringBuilder elementString = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];

            sum += element;

            elementString.append(element);
            if (i < arr.length - 1) {
                elementString.append(" ");
            }
        }
        String output = elementString.toString()  + "\n" + "Sum: " + sum;
        return output;
    }
}
