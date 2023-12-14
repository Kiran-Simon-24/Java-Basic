package subprogram;
import java.util.Scanner;
public class blooddonation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = scan.nextInt();
        System.out.print("Enter Your body Weight: ");
        int weight = scan.nextInt();
        if(age >= 18){
            if(weight >= 50){
                System.out.println("You are alligable to donate blood.");
            }
            else{
                System.out.println("You body weight is not alligable to donate blood.");
            }
        }
        else {
            System.out.println("You can't donate blood.");
        }
        scan.close();
    }
}
