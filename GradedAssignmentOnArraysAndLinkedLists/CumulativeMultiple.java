import java.util.Arrays;

public class CumulativeMultiple {
    public static void main(String[] args) {
        int[] arrNum = {5, 3, 4, 2, 0, 8};

        try {
            calculateCumulativeMultiple(arrNum);
            System.out.println("arrNum = " + Arrays.toString(arrNum));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void calculateCumulativeMultiple(int[] arr) throws Exception {
        if (arr.length == 0) {
            throw new Exception("Array cannot be empty.");
        }

        int cumulativeMultiple = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 0; // Cumulative multiple for 0 is always 0
            } else {
                cumulativeMultiple *= arr[i];
                arr[i] = cumulativeMultiple;
            }
        }
    }
}
