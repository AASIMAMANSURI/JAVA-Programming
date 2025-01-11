import java.util.Scanner;

class Armstrong{
    public static void main(String[] agrs)
    {
        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();
      int temp =number;
int digit =0,last=0;
double sum=0;
        while(temp>0)
        {
            temp = temp /10;
            digit++;
        }
        // System.out.println(digit);
        
        temp =number;
        while(temp >0)
        {
            last =temp%10;
                sum= sum+ Math.pow(last, digit);
                temp =temp/10;
           
        }
        // System.out.println("sum is" + sum);
        if(sum == number)
        {
            System.out.println("number is armstrong");
        }
        else{
            System.out.println("number is not an armstrong");
        }
    }

}