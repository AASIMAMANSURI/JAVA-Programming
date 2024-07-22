// 2. Implement a program that uses a switch-case statement to determine the day of the week
// based on a numeric input (1 for Monday, 2 for Tuesday, etc.).

import java.util.Scanner;
class switch_case{

    public static void main(String[] args){

        Scanner input =new  Scanner(System.in);
       int ch;
        
        do{
            System.out.println("enter your choise : \n 1. \n 2. \n 3. \n 4. \n 5. \n 6. \n 7.");
 System.out.println("enter your choise : ");
         ch = input.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("MONDAY");
                    break;
             case 2:
                    System.out.println("TUESDAY");
                    break;
             case 3:
                    System.out.println("WEDNESDAY");
                    break;
             case 4:
                    System.out.println("THURSDAY");
                    break;
             case 5:
                    System.out.println("FRIDAY");
                    break;
             case 6:
                    System.out.println("SATURDAY");
                    break;
             case 7:
                    System.out.println("SUNDAY");
                    break;
            
                default:
                    break;
            }
        }
        while(ch!=0);
    }
}