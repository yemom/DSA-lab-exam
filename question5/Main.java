package finalLabExam.question5;

public class Main {
    public static void main(String[] args) {
        question5.question05 solution = new question5.question05();

        // Test case
        String input = "hello";
        String result = solution.reverseString(input);

        // Print the result
        System.out.println("Reversed string: " + result); // Output: "olleh"
    }
}
