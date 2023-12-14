package basic.java;


public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 3;
		int mark = 80;
		switch(year){
			case 1: 
				System.out.println("First year students are not eligible for scholarship");
				break;
			case 2:
				System.out.println("Second year students are eligible for scholarship");
				break;
			case 3: 
				switch(mark) {
				case 50:
					System.out.println("Your mark is not eligible for scholarship");
					break;
				case 80: 
					System.out.println("You are eligible for scholarship");
					break;
				default:System.out.println("Please enter valid mark");
				
				}
				break;
			default: System.out.println("Please enter valid year");
				
		}
	}

}
