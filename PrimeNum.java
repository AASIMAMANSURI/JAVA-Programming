import java.util.Scanner;

class PrimeNum {
    public static void main(String[] args) {
        int flag = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number to check prinme or not : ");
        int num;
        num = input.nextInt();

        if (num > 1)
        {
            for (int i = 2; i < num; i++)
            {
                if (num % i == 0) {
                    System.out.println("num is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) 
            {
                System.out.println("num is  prime number");
            }
        }
    }
}

