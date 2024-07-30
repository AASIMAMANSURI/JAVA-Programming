
// Create a Student class with the following properties: name, grade, and age. Implement the following
// methods:
// setName(String name): Sets the student's name.
// getGrade(): Returns the student's grade.
// incrementAge(): Increments the student's age by 1.
// printStudentInfo(): Prints the student's name, grade, and age.
// In the main method, create an array of Student objects and perform the following tasks:
// Prompt the user to enter the number of students.
// Create the Student objects and populate their information.
// Use a for loop to iterate through the array and call the printStudentInfo() method for each
// student.
// Find the student with the highest grade and print their information.
// Note: Remember to include appropriate comments and documentation throughout your code to
// make it more readable and maintainable.

import java.util.Scanner;

class Student {
    String name;
    String grade;
    int age;

    // Scanner input = new Scanner(System.in);
public Student ()
{
    name = "";
    grade = "";
    age = 0;

}
    public void setName() {
        System.out.println("enter the name of student");
        Scanner input = new Scanner(System.in);
        this.name = "";
        this.name = input.nextLine();
    }

    public void grades() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the grade of student");
        this.grade = "";
        grade = input.nextLine();
    }

    public void getage() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the age of student");
        this.age = 0;
        age = input.nextInt();
    }

    public int increamentage() {
        return age++;

    }

    public String returnGrade() {
        return grade;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of students");
        int sn;
        sn = input.nextInt();
        Student[] stu = new Student[sn];

        int ch;

        do {
            System.out.println("enter your choise : ");
            System.out.println(
                    "1. enter student details. \n 2. see Student Details. \n 3. increament the student age \n 4. find highest grade of the student.");
            ch = input.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < sn; i++) {
                        stu[i] = new Student();
                        stu[i].setName();
                        stu[i].grades();
                        stu[i].getage();
                    }
                    break;
                case 2:
                    for (int i = 0; i < sn; i++) {

                        System.out.println(stu[i].name + "\n" + stu[i].age + "\n" + stu[i].grade);
                    }
                    break;
                case 3:
                // Scanner input = new Scanner(System.in);
                input.nextLine();


                String agename;
                    System.out.println("enter the name of the student to increament the age :");
                  
                    agename = input.nextLine();

                    for (int i = 0; i < sn; i++) {
                        if (stu[i].name.equals(agename)) {
                            stu[i].increamentage()  ;                      }

                    }
                    break;
                case 4:
                    for (int i = 0; i < sn; i++) {
                        
                        if (stu[i].grade.equals("A")) {
                         System.out.println(stu[i].name);
                         System.out.println(stu[i].age);
                         System.out.println(stu[i].grade);
                        }   
                        else if(stu[i].grade.equals("B"))     
                        {
                            System.out.println("NO one is with the " + " A " + "Garde . \n B is the highest Grade.\n");
                            System.out.println(stu[i].name);
                            System.out.println(stu[i].age);
                            System.out.println(stu[i].grade);
                        } 
                        else
                        {
                            System.out.println("NO one is with the " + " A || B" + "Garde . \n C is the highest Grade.\n");
                            System.out.println(stu[i].name);
                            System.out.println(stu[i].age);
                            System.out.println(stu[i].grade);
                        }      
                       

                    }
                    break;
                default:
                    break;

            }

        } while (ch != 0);

    }
}