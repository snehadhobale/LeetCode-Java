import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        List<Integer> previous = new ArrayList<>();
        previous.add(1);
        triangle.add(previous);

        for (int i = 1; i < numRows; i++) {
            List<Integer> current = new ArrayList<>();
            current.add(1);

            for (int j = 1; j < previous.size(); j++) {
                int sum = previous.get(j - 1) + previous.get(j);
                current.add(sum);
            }

            current.add(1);
            triangle.add(current);
            previous = current;
        }

        return triangle;
    }
}