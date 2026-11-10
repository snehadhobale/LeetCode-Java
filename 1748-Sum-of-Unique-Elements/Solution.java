
import java.util.HashMap;

class Solution {
    public int sumOfUnique(int[] nums) {

        HashMap<Integer, Integer> frequency = new HashMap<>();

        // Count frequency of each number
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        int sum = 0;

        // Add numbers that appear exactly once
        for (int num : nums) {
            if (frequency.get(num) == 1) {
                sum += num;
                frequency.put(num, 0);
            }
        }

        return sum;
    }
}
