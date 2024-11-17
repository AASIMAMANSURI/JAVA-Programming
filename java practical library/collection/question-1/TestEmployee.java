
import java.util.Collections;
import java.util.LinkedList;

class TestEmployee {

    public static void main(String[] args) {

        LinkedList<employee> emp = new LinkedList<employee>();
        emp.add(new employee(1, "aaima", "2004-11-12", 10000.0));
        emp.add(new employee(2, "khadija", "2004-2-24", 2233.0));
        emp.add(new employee(3, "yamin", "2004-1-2", 33.0));

        System.out.println("list: \n");
        for (employee e : emp) {
            System.out.println(e.getdetail());
        }

        // for (int i = 0; i < emp.size() - 1; i++) {
        // for (int j = 1; j < emp.size(); j++) {
        // if (emp.get(i).getsalary() > emp.get(j).getsalary()) {
        // employee temp = emp.get(i);
        // emp.set(i, emp.get(j));
        // emp.set(j, temp);

        // }
        // }
        // }
        // Sort the linked list by salary
        Collections.sort(emp);

        System.out.println("list: \n");
        for (employee e : emp) {
            System.out.println(e.getdetail());
        }
    }
}