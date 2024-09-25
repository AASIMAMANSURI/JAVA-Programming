import java.util.Scanner;

public class ReverseArray {
    
    public static void main(String[] args)
    {
         Scanner input = new Scanner(System.in);
            System.out.println("enter the size of the array:");
            int size = input.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = input.nextInt();
            }
            System.out.println("old array is :");
            for (int i = 0; i < size; i++) {
                System.out.println(arr[i]);
            }
            int[] revarr = new int[size];
            for (int i =0; i < size/2; i++) {
                int temp ;
                temp= arr[i];
                arr[i] = arr[arr.length -1];

            }
            System.out.println("revsered array is :");
            for (int i = 0; i < size; i++) {
                System.out.rintln(arr[i]);
            }

    }
}
