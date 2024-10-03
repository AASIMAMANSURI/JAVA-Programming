// write a Java program to calculate the minimum of three integer numbers:

import java.util.Scanner;

class Max_min{

    public static void min(int num1, int num2, int num3)
    {
        if(num1< num2 && num1 < num3)
        {
            System.out.println("num1 is min "+ num1);
        }
        else if(num2< num1&& num2 < num3)
        {
            System.out.println("num2 is min "+ num2);
        }
        else
        {
            System.out.println("num3 is min "+ num3);
        }
    }


    public static void max(int num1, int num2, int num3)
    {
        if(num1>num2 && num1 > num3)
        {
            System.out.println("num1 is max "+ num1);
        }
        else if(num2> num1&& num2 > num3)
        {
            System.out.println("num2 is max "+ num2);
        }
        else
        {
            System.out.println("num3 is max "+ num3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the  three digit integer number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        Max_min.min(num1,num2,num3);
        Max_min.max(num1, num2, num3);
    }

}

// output:
// enter the  three digit integer number
// 123
// 453
// 764
// num1 is min 123
