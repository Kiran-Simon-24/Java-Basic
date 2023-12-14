package basic.java;

import java. util.Scanner;
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello Java", t = "100", i = "105";
		int l =12;
	
		System.out.println(s.charAt(7));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.toCharArray());
		System.out.println(s.compareTo(t));
		System.out.println(s.substring(6,10));
		System.out.println(s.contains("Ja"));
		System.out.println(  t + i + l);
		
		System.out.println("Enter Username: ");
		Scanner scan = new Scanner(System.in);
		String uname = scan.nextLine();
		System.out.println("Name is" + " " + uname);
	}

}
