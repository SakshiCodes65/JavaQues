package Ques;

public class ValueOf_j_5 {
    public static void main(String[] args) {
        int j = 10;
        System.out.println(j++);  // print -->  10     value --> 11 
        System.out.println(--j); // print -->  10     value --> 10
        --j; // print --> nothing      value --> 9
        j--; // print --> nothing      value --> 8
        System.out.println(j); // print --> 8      value --> 8
        System.out.println(++j); // print -->  9     value --> 9
        System.out.println(j--); // print -->  9     value --> 8
        System.out.println(j);  // print -->  8     value --> 8
        j++; // print --> nothing     value --> 9
        j = j++ + ++j;  // j = 9 10 11 (9 + 11)
        System.out.println(j);   // print -->  20     value --> 20
        j = j++ + j++;  // j = 20 21 22 (20 + 21)
        System.out.println(j);  // j = 41
    }
}
