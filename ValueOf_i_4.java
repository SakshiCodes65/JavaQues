package Ques;
public class ValueOf_i_4 {
    public static void main(String[] args) {

        int i = 10;
        i += 2;  // print --> nothing      value -->  12
        i -= 5; // print --> nothing      value --> 7
        i *= 6; // print --> nothing      value --> 42

        System.out.println(i);  // print --> 42      value --> 42
        System.out.println(i += 3);  // print -->  45     value --> 45
        System.out.println(i /= 2); // print -->  22     value --> 22

    }
}
