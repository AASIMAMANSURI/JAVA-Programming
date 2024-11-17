// 3. Create a HashTable/ HashMap of students object and find the following:
// a. Check if a particular key exist in the hashtable or not. If exist then display the value
// b. Remove an entry from hashtable (key is entered by user to remove)
// c. Add a new entry
// d. Display all the entries
// e. Check if a particular value exist in the hashtable or not. If exist then display the value

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class studentt{
    public static void main(String[] args)
    {
        HashMap<Integer,String> studentmap = new HashMap<Integer ,String >();
        studentmap.put(101,"aasima");
        studentmap.put(102,"yamin");
        studentmap.put(104,"khadija");
        studentmap.put(105,"imran");
        
        Scanner sc = new Scanner(System.in);

        int ch;
                do{
                    System.out.println("\n-----------------------------\n1 . Add . \n2 . Remove . \n3 . Search . \n4 . Display all .\n 5 . exit \n-----------------------------\n");
                   ch = sc.nextInt();
                    sc.nextLine();
            
                switch (ch) {
                    case 1:
                        System.out.println("add new entry : ");
                        System.out.println( "ID : ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("NAME : ");
                        String name = sc.nextLine();
                        studentmap.put(id,name);
        
                        break;
                
                        case 2:
                        System.out.println("enter the key to remove : ");
                        int removeid = sc.nextInt();
                        if(studentmap.remove(removeid) != null)
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
                        int searchid = sc.nextInt();
                        if(studentmap.containsKey(searchid))
                        {
                            System.out.println("name is there .");
                        }
                        else 
                        {
                            System.out.println("name is not exist");
                        }
                        break;
                
                        case 4:
                       
                for(Map.Entry<Integer,String> entry : studentmap .entrySet())
                {
                    System.out.println("key : " + entry.getKey() +" value : " + entry.getValue());
                }
                        break;
                      
                    case 7:
                        System.out.println("Exiting program.");
                        sc.close();
                        return;
                    
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            
                }while(ch!=0);
        
        
    }
}


// output:

// -----------------------------
// 1 . Add .
// 2 . Remove .
// 3 . Search .
// 4 . Display all .
//  5 . exit
// -----------------------------

// 1
// add new entry :
// ID :
// 245
// NAME :
// fg

// -----------------------------
// 1 . Add .
// 2 . Remove .
// 3 . Search .
// 4 . Display all .
//  5 . exit
// -----------------------------

// 4
// key : 101 value : aasima
// key : 245 value : fg
// key : 102 value : yamin
// key : 104 value : khadija
// key : 105 value : imran

// -----------------------------
// 1 . Add .
// 2 . Remove .
// 3 . Search .
// 4 . Display all .
//  5 . exit
// -----------------------------

