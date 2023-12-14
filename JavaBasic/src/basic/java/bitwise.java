package basic.java;

public class bitwise {
    public static void main(String[] args){
        int a = 10;
        int b = 15;
        int c = 20;
        // True when all condition is True.
        System.out.println(a<b & b>c);  //bitsie AND all condition checked 
        System.out.println(a<b && b<c); //logical AND if start condition is falsed the rest is not checked.

        // True when one condition is True.
        System.out.println(a<b | b>c); //bitwise OR all condition checked
        System.out.println(a<b || b>c); // logical OR doesn't check second condition
    }
}
