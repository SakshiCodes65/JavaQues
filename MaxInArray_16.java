package Ques;

public class MaxInArray_16 {
    public static void main(String[] args) {
        int[] numbers = { 4, 2, 3, 5, 2, 15, 210, 6 };
        int max = numbers[0];
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}
