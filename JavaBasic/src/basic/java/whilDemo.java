package basic.java;

public class whilDemo {
    public static void main(String[] args){
        int x = 21, sum = 0;
        do{
            sum += x;
            x--;
            break;
        }
        while (x > 10);
        System.out.println("Summation is" + " " + sum);

        // while and break//
        int i = 1;
        while (i<= 10){
            if(i==5){
                i++;
                break;
            }
            System.out.println(i);
            i++;
        }
    
    }
}
