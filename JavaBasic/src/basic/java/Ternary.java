package basic.java;
public class Ternary{
   
    public static void main(String[] args){

        // ? : => if-then-else statement ?=> condition : => do
        int n1 = 5, n2 = 15, max;
        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);
        max = (n1 > n2) ? n1 : n2;
        System.out.println("Maximum is = " + max);
    }
}