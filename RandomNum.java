import java.util.Scanner;

class RnadomNum{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n;
        n= input.nextInt();

        for(int i =0;i<n;i++)
        {
            System.out.println(Math.random() * n);
        }
    } 
} 