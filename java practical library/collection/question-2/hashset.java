// Create a HashSet of 5 names. Write a menu driven program to do the following:
// a. Add a new name
// b. Remove a name
// c. Search a name
// d. Display all the names (display in reverser order also – use ListIterator )
// e. Display number of elements in hashset

import java.util.*;
public class hashset {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>(Arrays.asList("aasima","khadija","yamin","aaliya","hanza"));
    Scanner sc = new Scanner(System.in);

    while(true ){
        System.out.println("\n-----------------------------\n1 . Add NAme. \n2 . Remove Name. \n3 . Search Name. \n4 . Display all Name. \n5 . Display in reverse order. \n6 . Display number of elements . \n7 . Exit.\n Enter choise \n-----------------------------\n");
        int ch = sc.nextInt();
        sc.nextLine();

    switch (ch) {
        case 1:
            System.out.println("enter the name : ");
            String nametoadd = sc.nextLine();
            if(names.add(nametoadd))
            {
                System.out.println("name added succsessfully.");
            }
            else 
            {
                System.out.println("name is already there");
            }
            break;
    
            case 2:
            System.out.println("enter the name : ");
            String nametoremove = sc.nextLine();
            if(names.remove(nametoremove))
            {
                System.out.println("name remived succsessfully.");
            }
            else 
            {
                System.out.println("name is not exist");
            }
            break;
            case 3:
            System.out.println("enter the name : ");
            String nametosearch = sc.nextLine();
            if(names.contains(nametosearch))
            {
                System.out.println("name is there .");
            }
            else 
            {
                System.out.println("name is not exist");
            }
            break;
    
            case 4:
           System.out.println("all names: "+ names);

            break;
            case 5:
            
            List<String> nameList = new ArrayList<>(names);
            System.out.println("All names:");
            for (int i = nameList.size()-1; i >=0; i--) {
                System.out.println(nameList.get(i));
            }
            break;
        
         
            case 6:
            System.out.println("Number of elements: " + names.size());
            break;
        
        case 7:
            System.out.println("Exiting program.");
            sc.close();
            return;
        
        default:
            System.out.println("Invalid choice. Please try again.");
            break;
    }

    }
    }
    
}



// output:

// -----------------------------
// 1 . Add NAme.
// 2 . Remove Name.
// 3 . Search Name.
// 4 . Display all Name.
// 5 . Display in reverse order.
// 6 . Display number of elements .
// 7 . Exit.
//  Enter choise
// -----------------------------

// 5
// All names:
// yamin
// hanza
// aaliya
// khadija
// aasima

// -----------------------------
// 1 . Add NAme.
// 2 . Remove Name.
// 3 . Search Name.
// 4 . Display all Name.
// 5 . Display in reverse order.
// 6 . Display number of elements .
// 7 . Exit.
//  Enter choise
// -----------------------------

// 4
// all names: [aasima, khadija, aaliya, hanza, yamin]

// -----------------------------
// 1 . Add NAme.
// 2 . Remove Name.
// 3 . Search Name.
// 4 . Display all Name.
// 5 . Display in reverse order.
// 6 . Display number of elements .
// 7 . Exit.
//  Enter choise
// -----------------------------

// 6
// Number of elements: 5

// -----------------------------
// 1 . Add NAme.
// 2 . Remove Name.
// 3 . Search Name.
// 4 . Display all Name.
// 5 . Display in reverse order.
// 6 . Display number of elements .
// 7 . Exit.
//  Enter choise
// -----------------------------

// 1
// enter the name :
// imran
// name added succsessfully.

// -----------------------------
// 1 . Add NAme.
// 2 . Remove Name.
// 3 . Search Name.
// 4 . Display all Name.
// 5 . Display in reverse order.
// 6 . Display number of elements .
// 7 . Exit.
//  Enter choise
// -----------------------------

// 4
// all names: [imran, aasima, khadija, aaliya, hanza, yamin]

// -----------------------------
// 1 . Add NAme.
// 2 . Remove Name.
// 3 . Search Name.
// 4 . Display all Name.
// 5 . Display in reverse order.
// 6 . Display number of elements .
// 7 . Exit.
//  Enter choise
// -----------------------------

// 2
// enter the name :
// aasima
// name remived succsessfully.

// -----------------------------
// 1 . Add NAme.
// 2 . Remove Name.
// 3 . Search Name.
// 4 . Display all Name.
// 5 . Display in reverse order.
// 6 . Display number of elements .
// 7 . Exit.
//  Enter choise
// -----------------------------

// 4
// all names: [imran, khadija, aaliya, hanza, yamin]

// -----------------------------
// 1 . Add NAme.
// 2 . Remove Name.
// 3 . Search Name.
// 4 . Display all Name.
// 5 . Display in reverse order.
// 6 . Display number of elements .
// 7 . Exit.
//  Enter choise
// -----------------------------

// 3
// enter the name :
// yamin
// name is there .

// -----------------------------
// 1 . Add NAme.
// 2 . Remove Name.
// 3 . Search Name.
// 4 . Display all Name.
// 5 . Display in reverse order.
// 6 . Display number of elements .
// 7 . Exit.
//  Enter choise
// -----------------------------

// 5
// All names:
// yamin
// hanza
// aaliya
// khadija
// imran

// -----------------------------
// 1 . Add NAme.
// 2 . Remove Name.
// 3 . Search Name.
// 4 . Display all Name.
// 5 . Display in reverse order.
// 6 . Display number of elements .
// 7 . Exit.
//  Enter choise
// -----------------------------

// 6
// Number of elements: 5

// -----------------------------
// 1 . Add NAme.
// 2 . Remove Name.
// 3 . Search Name.
// 4 . Display all Name.
// 5 . Display in reverse order.
// 6 . Display number of elements .
// 7 . Exit.
//  Enter choise
// -----------------------------

// 7
// Exiting program.
// PS D:\JAVA\collection> 