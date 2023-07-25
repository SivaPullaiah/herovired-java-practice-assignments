import java.util.ArrayList;
import java.util.List;

public class FindMissingNumbers {
    public static void main(String[] args) {
        int[] arrNum1 = {1, 2, 4, 5, 6};
        int[] arrNum2 = {1, 2, 3, 5, 6, 8, 10, 11, 14};

        System.out.println("Missing numbers in arrNum1: " + findMissingNumbers(arrNum1));
        System.out.println("Missing numbers in arrNum2: " + findMissingNumbers(arrNum2));
    }

    public static List<Integer> findMissingNumbers(int[] arr) {
        List<Integer> missingNumbers = new ArrayList<>();
        int start = arr[0];
        int end = arr[arr.length - 1];

        for (int num = start; num <= end; num++) {
            boolean found = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missingNumbers.add(num);
            }
        }
        return missingNumbers;
    }
}
