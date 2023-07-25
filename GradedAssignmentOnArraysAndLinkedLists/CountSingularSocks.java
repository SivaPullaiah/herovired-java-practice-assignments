import java.util.HashMap;
import java.util.Map;

public class CountSingularSocks {
    public static void main(String[] args) {
        int[] arrNum = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int count = countSingularSocks(arrNum);
        System.out.println("Count of singular socks = " + count);
    }

    public static int countSingularSocks(int[] arr) {
        Map<Integer, Integer> sockCountMap = new HashMap<>();

        // Count the occurrences of each sock ID
        for (int sockId : arr) {
            sockCountMap.put(sockId, sockCountMap.getOrDefault(sockId, 0) + 1);
        }

        // Count the singular socks
        int singularCount = 0;
        for (int count : sockCountMap.values()) {
            if (count % 2 == 1) {
                singularCount++;
            }
        }

        return singularCount;
    }
}
