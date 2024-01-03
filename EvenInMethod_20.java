package Ques;

public class EvenInMethod_20 {
    static void even(int a){
        if(a%2==0){
            System.out.println("Even");
            return;
        }
        System.out.println("Odd");
    }
    public static void main(String[] args) {
        even(43);
    }
}
