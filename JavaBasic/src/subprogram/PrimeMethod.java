package subprogram;

import java.util.Scanner;
public class PrimeMethod {
    public static void Isprime(int n) {
        int count = 0;
        if (n == 0 || n == 1) {
            System.out.println(n + " " + "is not a prime number");
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    System.out.println(n + " " + "is not a prime number");
                    count = 1;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(n + " " + "is a prime number");
            }

        }
    }

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter a number: ");

         int number = scan.nextInt();
        Isprime(number);
       scan.close();
    }
}
