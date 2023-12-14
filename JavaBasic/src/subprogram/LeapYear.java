package subprogram;

import java.util.Scanner;

public class LeapYear {
    static public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scan.nextInt();

        if (isleapyear(year)) {
            System.out.print(year + " " + "is a leap year.");
        } else {
            System.out.print(year + " " + "is not a leap year");
        }
        System.out.println();

        System.out.print("Enter the start year: ");
        int start = scan.nextInt();
        System.out.print("Enter the end year: ");
        int end = scan.nextInt();

       int count = countLeapyears(start, end);

        System.out.println("Number of leap years between " + start + " and " + end + ": " + count);
        scan.close();
    }

    static boolean isleapyear(int n) {
    if (n % 4 == 0) {
        if (n % 100 == 0) {
            if (n % 400 == 0) {
                return true; // Divisible by 400 is a leap year
            } else {
                return false; // Divisible by 100 but not 400 is not a leap year
            }
        } else {
            return true; // Divisible by 4 is a leap year
        }
    } else {
        return false; // not divisible by 4 is not a leap year
    }
}
static int countLeapyears(int s, int e){
    int count = 0;
    for(int year = s; year <= e; year ++){
        if(isleapyear(year)){
            count++;
        }
    }
    return count;
}

}
