package subprogram;
import java.util.Scanner;
public class booleanPrime {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scan.nextInt();
        if(Isprime(number)){
            System.out.print(number +" "+ " is a prime number");
        }
        else{
            System.out.println(number +  " " + "is not a prime nuber");
        }
        scan.close();
        
    } 
    public static boolean Isprime(int n){
        if(n <= 1){
            return false;
        }
        else{
            for (int i = 2; i <= n/2; i++){
                if(n%i == 0){
                    return false;
                }
            }
            return true;
        }
    
    }
}
