// 1. Write a program that takes a number as input and determines whether it is even or odd
// using an if-else statement.

import java.util.Scanner;

class Else_If{

    public static void main(String[] args)
    {
        System.out.println("enter number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num % 2 == 0)
        {
            System.out.println("number is even");
        }
        else{
            System.out.println("NUmber is odd");
        }
    }
}


// output:

// Z:\java>java Else_If
// enter number:
// 2
// number is even

// Z:\java>java Else_If
// enter number:
// 3
// NUmber is odd

// Z:\java>
