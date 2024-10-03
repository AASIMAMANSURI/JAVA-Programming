// Write and run a Java program to calculate factorial and the cube of the given integer number.
// Also find the sum and multiplication of its digits. Also check whether the no entered is
// palindrome or not.

import java.util.Scanner;

class calculation{

    public static int fact(int n)
    {
        int  fact = 1;
        if(n == 1 )
        return 1;

        if(n>1)
        {
            return n * fact(n-1);
        }
        
        else
        {
            return 1;
        }
    }
    public static int sumofdigit(int n)
    {
        int sum=0;
        while( n>0)
        {

            int d = n % 10;
            sum = sum + d;
             n = n/10;
           
        }
        return sum;
    }
    
    public static int mulofdigit(int n)
    {
        int sum=1;
        while( n>0)
        {

            int d = n % 10;
            sum = sum * d;
             n = n/10;
           
        }
        return sum;
    }

    public static void  pelindrom(int n)
    { int temp =n; 
        int last = 0;
        
        while(n > 0)
       {
         int d = n% 10;
         last = last *10 +d;
         n = n/10;
       }
       if (last == temp)
       {
        System.out.println("pelindrom");
       }
       else
       {
        System.out.println("not pelindrom");
       }
       
    }
    
    public static int cube(int n)
    {
        return n*n*n;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the integer number");
        int num = sc.nextInt();

System.out.println(calculation.fact(num));
System.out.println("cube of num : " + calculation.cube(num));
System.out.println("sum of num of digit : " + calculation.sumofdigit(num));
System.out.println("mul of num of digit : " + calculation.mulofdigit(num));
 calculation.pelindrom(num);
    }
}