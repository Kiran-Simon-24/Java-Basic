package basic.java;


public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i<10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				System.out.println(i +" "+j );
			}
		}
		System.out.println();
		
		Pyramid();
		System.out.println();
		
		Foreach();
		System.out.println();

	}
	static void Pyramid() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void Foreach() {
		int arr[] = {1,2,3,4,5,6};
		for(int i : arr) {
			System.out.print(i +" ");
		}
	}

}
