//1. Create a Person class with the following properties: name, age, and gender. Implement
//methods to set and get these properties.

import java.util.Scanner;

class Person{

	int age; 
	String name;
	String gender;
	
	public void get()
	{
	Scanner input = new Scanner(System.in);
	System.out.println("enter name :"  );
	name = input.nextLine();
	
	System.out.println("enter age : ");
	age = input.nextInt();
	input.nextLine();
	
	System.out.println("enter gender : ");
	gender = input.nextLine();
	
	}
	
	public void set()
	{
	System.out.print("name : "+ name + "\n");
	System.out.println(" age : " + age + "\n");
	System.out.println("gender : " +gender + "\n");

	
	}
	public static void main(String[] args)
	{
		Person p1 =new Person();
		p1.get();
		p1.set();
	}
}

------------------------------------------------

output : 

C:\Users\rcc\Desktop>javac simple_class_pro.java

C:\Users\rcc\Desktop>java Person
enter name :
aasima
enter age :
20
enter gender :
female
name : aasima
 age : 20

gender : female

