package basic.java;

public class PyramidEg {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 5; i >= 1; i--) {
            for (int j = i; j<5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i <= 5; i++){
            for(int s = 5; s > i; s--){
                System.out.print(" ");
            }
            for(int j = i; j >=1; j--){
                System.out.print(j);
            }
            for(int k = 2; k <=i; k++){
                System.out.print(k);
            }
            System.out.println();
        }

    }
}
