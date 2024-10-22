import java.util.Scanner;
import java.util.Arrays;
class Array2{

    public static void addele(int[] arr ,int size)
    {
        Scanner input=new Scanner(System.in);
        // add element in araay
        System.out.println("\n\nenter number to add in array:");
        int ele = input.nextInt();

        System.out.println("enter the position:");
        int pos = input.nextInt();
        int[] array=new int[size+1];
        for(int i=0;i<pos-1;i++)
        {
           array[i]=arr[i];
        }

        array[pos-1]=ele;

        for(int i= pos;i<=size;i++)
        {
           array[i]=arr[i-1];
        }
        size++;
        arr=array;

        System.out.println("\n\n array after adding numeber:");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static int[] flush()
    {
         // // flush array
        return new int[0];
    }
    public static void print(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("\n\nenter size of  array:");
        int size =input.nextInt();
        int[] arr=new int[size];
        System.out.println("\n\nenter elements of array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=input.nextInt();
        }
       print(arr);
        addele(arr,size);
        arr=flush();
        System.out.println("\n\nafter flusing array:");
        print(arr);
    }

   
}