// Write a program to read employee detail and store the employee object in linkedlist. Sort the
// list based on salary.
// a. Create class- Employee (Attributes- empid, name , dob , salary : Methods: setDetails,
// getDetails and constructures )
// b. Employee class must implement comparable interface
// c. Create another class TestEmployee, here create the linkedlist of employees and sort the
// list.



class employee implements Comparable <employee> {
    
    int empid;
    String name;
    String DOB;
    Double salary;

    public employee(int id, String name, String d, Double salary) {
        this.empid = id;
        this.name = name;
        this.DOB = d;
        this.salary = salary;

    }
 @Override
public int compareTo(employee other) {
    return Double.compare(this.salary, other.salary);
}
    
    public void setdetails(int id, String name, String d, Double salary) {
        this.empid = id;
        this.name = name;
        this.DOB = d;
        this.salary = salary;
    }

    public String getdetail() {
        return "Employee name : " + name + "\n ID : " + empid + "\nDATE OF BIRTH : " + DOB + "\nsalary : " + salary;
    }

    public Double getsalary() {
        return this.salary;

    }

}


// output:
// list:

// Employee name : yamin
//  ID : 3
// DATE OF BIRTH : 2004-1-2
// salary : 33.0
// Employee name : khadija
//  ID : 2
// DATE OF BIRTH : 2004-2-24
// salary : 2233.0
// Employee name : aaima
//  ID : 1
// DATE OF BIRTH : 2004-11-12
// salary : 10000.0
// PS D:\JAVA\collection> 