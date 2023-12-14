package basic.java;

public class condition {
    public static void main(String[] args){
        int num1 = 25;  
        int num2 = 78; 
        int num3 = 87;
        int num4 = 80;

        // if-ele if-else//
        if(num1 > num2 && num1 > num3){
            System.out.println("The largest number is" + " " + num1);
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println("The largest number is" + " " + num2);
        }
        else if(num3 > num1 && num3 > num2){
            System.out.println("The largest number is" + " " + num3);
        }
        if(num1 < num2 && num1 < num3){
            System.out.println("The smallest number is" + " " + num1);
        }
        else if(num2 < num1 && num2 < num3){
            System.out.println("The smallest number is" + " " + num2);
        }
        if(num3 < num1 && num3 < num2){
            System.out.println("The smallest number is" + " " + num3);
        }

        //Switch//
        switch(num4){
            case 25: System.out.println("25");
            break;
            case 80: System.out.println("80");
            break;
            default: System.out.println("Not found");
        }

        //Nested switch //
        char branch = 'A';
        int level = 2;
        switch(level){
            case 1: System.out.println("IP");
            switch(branch){
                case 'A' : System.out.println("Applied Information Technology Engineer");
                break;
                case 'F' : System.out.println("Fundamental Information Technology Engineer");
                break;
                case 'I' : System.out.println("Information Technology Passport");
                break;

            }
            break;
            case 2: System.out.println("FE");
            switch(branch){
                case 'A' : System.out.println("Applied Information Technology Engineer");
                break;
                case 'F' : System.out.println("Fundamental Information Technology Engineer");
                break;
                case 'I' : System.out.println("Information Technology Passport");
                break;
                
            }
            break;
            case 3: System.out.println("AP");
            switch(branch){
                case 'A' : System.out.println("Applied Information Technology Engineer");
                break;
                case 'F' : System.out.println("Fundamental Information Technology Engineer");
                break;
                case 'I' : System.out.println("Information Technology Passport");
                break;
            }
            break;


        }

    }  

}
