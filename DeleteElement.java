import java.util.Scanner;
class DeleteElement{
    public static void main(String[] args)
    {
       
            Scanner input = new Scanner(System.in);
            System.out.println("enter the size of the array:");
            int size = input.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = input.nextInt();
            }
            
            System.out.println("enter the number that you want to delete from the array:");
            int num;
            num = input.nextInt();
            int count=0;
            for (int i = 0; i < size; i++) {
                if(arr[i]==num)
                {
                    count++;
                }
                
            }
            System.out.println("old array is :");
            for (int i = 0; i < size; i++) {
                System.out.println(arr[i]);
            }

            int[] newarr = new int[size-count];

            for(int i=0;i<size;i++)
            {
                if(arr[i]  !=num)
                {
                    newarr[i]=arr[i];
                }
            }
             System.out.println("new array is :");
            for (int i = 0; i < size-count; i++) {
                System.out.println(newarr[i]);
            }


    }
}