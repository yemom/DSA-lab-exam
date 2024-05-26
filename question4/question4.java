package finalLabExam.question4;

public class question4 {
    public static class question04 {
        public int findMax(int[] nums) {
            if (nums == null || nums.length == 0) {
                throw new IllegalArgumentException("Array is empty or null");
            }
            int max = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
            return max;
        }


    }

}
