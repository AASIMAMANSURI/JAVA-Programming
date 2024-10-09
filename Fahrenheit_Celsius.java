// 3.Implement a program that converts temperature from Celsius to Fahrenheit and vice versa.

 //°C = (°F - 32) × 5/9
 //F = (9/5)C + 32. 
 
 import java.util.Scanner;
 class F_C	{
	
	public static void main(String[] args)
	{
		
	Scanner input =new Scanner(System.in);
	System.out.println("enter fehrenheit to convert");
	float F = input.nextFloat();
	
	float C = (F - 32 ) * 5 /9;
	System.out.println("c : " + C);
	
	System.out.println("enter celsious to convert");
	float cel = input.nextFloat();
	
//		float fe = (9/5) * cel +32;
	float fe = cel * (9/5) +32;
	System.out.println("F : " + fe);
 }}
	