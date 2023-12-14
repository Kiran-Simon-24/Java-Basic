package subprogram;
import java.util.*;
public class Subprogram_dice{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dieThrow = dice();
		System.out.println(dieThrow);
	}
	public static int dice() {
		Random r = new Random();
		int result = 1 + r.nextInt(6);
		return result;
	}
}
