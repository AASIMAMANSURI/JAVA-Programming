// InvalidBasicException - Class for user defined Exception (if basic is negative or non numeric).
// Payslip - do all calculations (da, hra) based on following rules.
// If basic<=5000 Then hra=5% of basic and da=3% of basic.
// If basic>=15000 Then hra=7.5% of basic and da=5% of basic
// Else hra=10% of basic and da=8% of basic.
// Based on that calculate netpay for each employee in Payslip class and generate the
// formatted pay slip in a file, with filename as <emp_no>_payslip.txt.
// Note: emp_no should be generated automatically with prefix EMP, use array of objects.

import java.io.FileWriter;
import java.io.IOException;

class Payslip {

    public static void generatepayslip(Employee e) {

        double HRA, DA;

        if (e.basic_sal < 5000.0) {
            HRA = e.basic_sal * 5 / 100;
            DA = e.basic_sal * 3 / 100;
        } else if (e.basic_sal >= 15000.0) {
            HRA = e.basic_sal * 7.5 / 100;
            DA = e.basic_sal * 5 / 100;
        } else {
            HRA = e.basic_sal * 10 / 100;
            DA = e.basic_sal * 8 / 100;
        }

        double netpay = 0.0;
        netpay = e.basic_sal + HRA + DA;

        try( FileWriter fw = new FileWriter(e.emp_no + "Payslip.txt")) {
           
            fw.write("employee Payslip\n");
            fw.write("======================\n");
            fw.write("Employee Number : " + e.emp_no);
            fw.write("\nEmployee Name : " + e.Name);
            fw.write("\ndeignation  : " + e.Designation);
            fw.write("\nbasic salary : " + e.basic_sal);
            fw.write("\nHRA : " + HRA);
            fw.write("\nDA : " + DA);
            fw.write("\nNet salary : " + netpay);

        } catch (IOException ee) {
         System.out.println("error in Writing in the file "  +ee.getMessage());
        }
        System.out.println("paySlip genertaed for : " + e.Name);
    }

    public static void main(String[] args) {
        
        try { 

            Employee[] employees = {
    
                new Employee("aasima", 20000.0, "developer "),
                new Employee("yamin", 22000.0, "developer ")
            };
            for( Employee ep :  employees)
            {
                generatepayslip(ep);

            }
        }
       catch (Exception e) {
           System.out.println("exception : "+ e.getMessage() );
        }
    }
}
