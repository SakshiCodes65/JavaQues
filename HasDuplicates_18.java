package Ques;

public class HasDuplicates_18 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 2, 5, 0, 6 };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println("Duplicate found at index " + j);
                    return;
                }
            }
        }
        System.out.println("NO duplicate found");
    }
}
