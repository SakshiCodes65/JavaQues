package Ques;

public class SearchAnElement_17 {
    public static void main(String[] args) {
        int element = 4;
        int[] numbers = { 1, 2, 3, 5, 4 ,6, 0 };
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == element){
                System.out.println("Element found at index "+i);
                return;
            }
        }
        System.out.println("No such element found");
    }
}
