import java.util.Scanner;

public class ArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //final int LENGTH = 10;
        //int[] numbers = new int[LENGTH];
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Even Numbers: ");
        for(int i=0; i<10; i+=2){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.print("Even Index: ");
        for(int i=1; i<10; i+=2){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.print("Reverse order: ");
        for(int i=9; i>=0; i--){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("First number: " + numbers[0] + "\nLast Numbers: " + numbers[9]);
    }
}
