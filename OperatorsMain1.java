package operators;
import java.util.Scanner;

public class OperatorsMain1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = in.nextInt();
        int arr[] = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0;i < size; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}