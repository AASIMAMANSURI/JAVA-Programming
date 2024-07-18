//Create a Circle class with the following properties: radius. Implement methods to calculate
// the area and circumference of the circle.

import java.util.Scanner;

class Circle{
	float radius;
	
	public void AREA()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter radius : " );
		float radius = input.nextFloat();
		double area= 3.14 *radius*radius;
	
		System.out.println("area of circle is : " + area);
		
	}
	public void CIRCUMFERENCE()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter radius : " );
		float radius = input.nextFloat();
		double CIRCUMFERENCE= 2 * 3.14 *radius;
		System.out.println("CIRCUMFERENCE of circle is : " + CIRCUMFERENCE	);
		
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Circle C1 = new Circle();
		int ch;
		
		do{ 
		System.out.println("--------------------\n1. AREA OF CIRCLE . \n2. CIRCUMFERENCE OF CIRCLE.\n0. exit\n--------------------\n") ;
		ch = input.nextInt();
			switch(ch){
				 case 1:
					C1.AREA();
				 break;
				 case 2:
					C1.CIRCUMFERENCE();
				 break;
				
				 case 0:
					System.out.println("exit");
				 break;
				
			}
		}while(ch !=0);
	
	}

} 

------------------------------------------------------------
output: 



C:\Users\rcc\Desktop>javac circle_area_circumference.java

C:\Users\rcc\Desktop>java Circle
--------------------
1. AREA OF CIRCLE .
2. CIRCUMFERENCE OF CIRCLE.
0. exit
--------------------

1
enter radius :
22
area of circle is : 1519.76
--------------------
1. AREA OF CIRCLE .
2. CIRCUMFERENCE OF CIRCLE.
0. exit
--------------------

2
enter radius :
2
CIRCUMFERENCE of circle is : 12.56
--------------------
1. AREA OF CIRCLE .
2. CIRCUMFERENCE OF CIRCLE.
0. exit
--------------------

0
exit