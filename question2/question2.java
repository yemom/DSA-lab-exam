package finalLabExam.question2;

import java.util.HashMap;
import java.util.Map;
public class question2 {



    public static class question02 {
        public static int[] toAdd(int[] nums, int target) {
                Map<Integer, Integer> numMap = new HashMap<>();

                for (int i = 0; i < nums.length; i++) {
                    int complement = target - nums[i];
                    if (numMap.containsKey(complement)) {
                        return new int[] { numMap.get(complement), i };
                    }
                    numMap.put(nums[i], i);
                }
                throw new IllegalArgumentException("No two sum solution");
        }

    }

}
