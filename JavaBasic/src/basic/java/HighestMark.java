package basic.java;


public class HighestMark {
	public static void main(String []args) {
		int mark1 = 50,mark2 = 80, mark3 = 90;
		if(mark1 > mark2) {
			if(mark1 > mark3) {
				System.out.println("Highest mark is:" + " " +mark1);
			}
			else {
				System.out.println("Highest mark is:" + " " +mark3);
			}
		}
		else {if(mark2>mark3) {
			System.out.println("Highest mark is:" + " " +mark2);
		}
		else {
			System.out.println("Highest mark is:" + " " +mark3);
		}
	}
		//Lowestmark
		if((mark1 < mark2)&&(mark1 < mark3)){
			System.out.println("Lowest mark is:" + " " +mark1);
		}
		else {
			if((mark2 < mark1)&&(mark2 < mark3)) {
				System.out.println("Lowest mark is:" + " " +mark2);
			}
			else {
				System.out.println("Lowest mark is:" + " " +mark3);
			}
		}
}
}
