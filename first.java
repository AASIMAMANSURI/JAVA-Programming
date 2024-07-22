// 2. Write a program that calculates the area and perimeter of a rectangle, given the length and
// width as input.

import java.util.Scanner;

class Area_Perameter{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int length ,width;
		
		
		System.out.print("Enter length : ");
		length = input.nextInt();
		System.out.println("Enter width : ");
		width = input.nextInt();
		
		
		int area = length * width;
		 
		
		
		int perimeter = (length + width) * 2;
		System.out.println("perimeter of rectagle : " + perimeter);
		
	}
	
}