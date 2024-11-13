// Write an Application program to generate Employee Payslip.

// Create following classes-
// Employee - emp_no,emp_name,basic ,Des

// InvalidBasicException - Class for user defined Exception (if basic is negative or non numeric).
// Payslip - do all calculations (da, hra) based on following rules.
// If basic<=5000 Then hra=5% of basic and da=3% of basic.
// If basic>=15000 Then hra=7.5% of basic and da=5% of basic
// Else hra=10% of basic and da=8% of basic.
// Based on that calculate netpay for each employee in Payslip class and generate the
// formatted pay slip in a file, with filename as <emp_no>_payslip.txt.
// Note: emp_no should be generated automatically with prefix EMP, use array of objects.

class Employee{
   String emp_no ;
   static int emp_count = 0;
    String Name;
    Double basic_sal;
    String Designation;

    public Employee(String name ,Double bs,String des) throws InvalidBasicException{

        if(bs < 0 )
        {
            throw new InvalidBasicException("salary should not be in negitive number or non numeric...!");  
        }
        else
        {
          this.emp_no = "EMP" + String.format("%03d",emp_count++);
          this.Name = name; 
          this.basic_sal = bs;
          this.Designation = des;
        
        }
    }
    
}