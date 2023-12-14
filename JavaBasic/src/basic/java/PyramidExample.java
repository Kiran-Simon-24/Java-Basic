package basic.java;
import java.util.Scanner;
public class PyramidExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();// new line;
        }
        System.out.println();

        int count = 6;
        for (int i = 1; i <= count; i++) {
            for (int j = count; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scan.nextInt();

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= rows - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
}
