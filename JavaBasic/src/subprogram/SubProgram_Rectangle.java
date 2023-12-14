package subprogram;

import java.util.Scanner;

public class SubProgram_Rectangle {
	public static int[] rectangle(int length , int width) {
		int area = length * width;
		int perimeter = 2 * (length + width);
		int[] data = {area , perimeter};
		return data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle: ");
		int length = scan.nextInt();
		
		System.out.println("Enter the width of the rectangle: ");
		int width = scan.nextInt();
		
		int[] result = rectangle(length, width);
		int rectangleArea = result[0];
		int rectanglePerimeter = result[1];
		
		System.out.println("The Area of rectangle is: " + rectangleArea);
		System.out.println("The Area of rectangle is: " + rectanglePerimeter);
		
	}

}
