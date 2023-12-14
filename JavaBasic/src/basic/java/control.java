package basic.java;
public class control {
    public static void main(String[] args){
        int leapYear = 0;
        int common_year = 0;
       for (int i = 1800; i < 2023; i++ ){
        
        if (((i % 4 == 0) && (i % 100 !=0)) || (i % 400 == 0)){  
            leapYear ++;
        }
        else {
            common_year = 223 - leapYear;
        }
       }
       System.out.println("The total number of leap year is" + " " + leapYear);
       System.out.println("The total number not leap year is" + " " + common_year);
    }   
}
