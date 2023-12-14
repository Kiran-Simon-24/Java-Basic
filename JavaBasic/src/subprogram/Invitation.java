package subprogram;

import java.util.Scanner;

public class Invitation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

    while (true) {
            System.out.print("Enter guest name: ");
            String guest = scanner.next();

            System.out.println(guest + " " + "has now been invited");
            System.out.println();
            count ++;

            System.out.println("If you want to invite more ('Y/N')");
            String ans = scanner.next().toLowerCase();

        /*Using if and break*/

        if(!ans.equals("y") && !ans.equals("n")){
            do {
                System.out.println("Invalid response. Please enter 'Y' Or 'N'");
                       ans = scanner.next().toLowerCase();

                if(ans.equals("n")){
                    System.out.println(count + " people attend to the party.");
                    return; // Exit loop
                }
            } while (!ans.equals("y") && !ans.equals("n"));
        }
        }

    }
}
