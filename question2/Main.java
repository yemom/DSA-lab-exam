package finalLabExam.question2;

public class Main {
    public static void main(String[] args) {
        question2.question02 question02 = new question2.question02();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result;
        result = question2.toAdd(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
