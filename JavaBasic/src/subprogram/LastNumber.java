package subprogram;

import java.util.Scanner;

public class LastNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int store;

        while (num < 50){
            store = num;
            System.out.print("Enter a number: ");
            num = scan.nextInt();
        }
        System.out.println("The last number you entered was a " + num );
    }
}
