package subprogram;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        int count=0;
        Scanner scan = new Scanner(System.in);
        int prime  = scan.nextInt();
        
        if( prime == 0 || prime ==1 ) System.out.println(prime + " " + "is not a prime number");
        else {
            for(int i=2; i<= prime/2; i++){
                if(prime%i == 0){
                    System.out.println(prime + " "+ "is not a prime number");
                    count = 1;
                    break;
                }
            }
            if(count == 0){
                System.out.println(prime + " " + "is a prime number");
            }
        }
        scan.close();
    }
}
