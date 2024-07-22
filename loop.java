// 3. Create a program that uses a for loop to print the first 10 multiples of a given number.
// 4. Write a program that uses a while loop to calculate the factorial of a given number.

import java.util.Scanner;

class loop{

    public static void main(String[] args) {
        System.out.println("enter the num");
        Scanner input = new Scanner(System.in);
int num = input.nextInt();
        for (int i =1 ;i<=10;i++)
        {
            int mul;
            mul = num * i;
            System.out.println(mul);
        }
    }
}
