// <!-- Problem 1: Currency Converter
// Write a program that can convert between different currencies. The program should have the
// following features:
//  Prompt the user to enter the amount they want to convert.
//  Provide a list of available currencies (e.g., USD, EUR, JPY, GBP, INR) and ask the user to select
// the source and target currencies.
//  Implement the currency conversion logic using appropriate exchange rates.
//  Display the converted amount to the user. -->

import java.util.Scanner;

class currency{
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
         int ch;
        
        do{
            System.out.println("enter your choise to convert INR  : \n 1. INR - USD \n 2. INR - EUR \n 3.INR- JPY \n 4.INR- GBP \n 5. USD - INR \n 6. EUR  - INR\n 7.JPY - INR\n 8 .GBP - INR ");
 System.out.println("enter your choise : ");
         ch = input.nextInt();
            switch (ch) {
                case 1:
                System.out.println("enter amount in Indian ₹ :");
                float amtU = input.nextFloat();
                    double  USD = amtU *0.012; 
                    System.out.println(USD);
                    break;
                    case 2:
                  System.out.println("enter amount  in Indian ₹ :");
                float amtE= input.nextFloat();
                    double EUR = amtE *0.011; 
                    System.out.println(EUR);
                    break;
             case 3:
                  System.out.println("enter amount  in Indian ₹ :");
                float amtJ = input.nextFloat();
                    double JPY = amtJ *1.87; 
                    System.out.println(JPY);
                    break;
             case 4:
                  System.out.println("enter amount  in Indian ₹ :");
                float amtG = input.nextFloat();
                    double GBP = amtG *0.0093; 
                    System.out.println(GBP);
                    break;
            
                     case 5:
                     // USD -INR
                  System.out.println("enter amount in United States Dollar :");
                float amtUI = input.nextFloat();
                    double USDI = amtUI *83.66; 
                    System.out.println(USDI);
                    break;

                    
                     case 6:
                     // EUR -INR
                  System.out.println("enter amount in  Euro:");
                float amtEI= input.nextFloat();
                    double EURI = amtEI *91.07; 
                    System.out.println(EURI);
                    break;
            
                    case 7:
                    //JPY - INR
                    System.out.println("enter amount in  Japanese Yen:");
                float amtJI= input.nextFloat();
                    double JPYI = amtJI *0.53; 
                    System.out.println(JPYI);
                    break;

                     case 8 :
                    //GBP - INR
                    System.out.println("enter amount in Pound sterling :");
                float amtGI= input.nextFloat();
                    double GBPI = amtGI *108.14; 
                    System.out.println(GBPI);
                    break;

                default:
                    break;
            }
        }
        while(ch!=0);
    }
}
//     output:
//     enter your choise to convert INR  : 
//  1. INR - USD 
//  2. INR - EUR 
//  3.INR- JPY 
//  4.INR- GBP 
//  5. USD - INR
//  6. EUR  - INR
//  7.JPY - INR
//  8 .GBP - INR
// enter your choise :
// 8
// enter amount in Pound sterling :
// 234
// 25304.76
// enter your choise to convert INR  :
//  1. INR - USD
//  2. INR - EUR
//  3.INR- JPY
//  4.INR- GBP
//  5. USD - INR
//  6. EUR  - INR
//  7.JPY - INR
//  8 .GBP - INR
// enter your choise :