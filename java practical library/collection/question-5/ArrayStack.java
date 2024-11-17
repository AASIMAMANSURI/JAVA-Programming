
// Write a generic class Stack<T> that can be used to represent stacks of objects of type T. The class
// should include methods push(), pop(), and isEmpty(). Inside the class, use an ArrayList to hold the
// items on the stack.
import java.util.ArrayList;
import java.util.Scanner;
class Stackk<T> {

    ArrayList<T> stack = new ArrayList<>();

    public void push(T num) {
        stack.add(num);
    }

    // public int pop() {
    //     if (stack.isEmpty()) {
    //         System.out.println("stack is empty");
    //     }

    //     int value = stack.get(stack.size() - 1);
    //     stack.remove(stack.size() - 1);
    //     return value;

    // }
    public T pop() throws Exception
    {
        if (stack.isEmpty()) {
            // System.out.println("stack is empty");
            throw new stackexception("stck is empty");
                                    
                                }
                                return  stack.remove(stack.size() - 1);
                          
                            }
                        
                            // public int peek()
                            // {
                            //     if (stack.isEmpty()) {
                            //         System.out.println("stack is empty");
                            //     }
                            //     int value = stack.get(stack.size() - 1);
                            //     return value;
                            // }
                        
            
            
                public T peek()
    {
        if (stack.isEmpty()) {
            System.out.println("stack is empty");
        }
        return  stack.get(stack.size() - 1);
      
    }
    public boolean isEmpty()
    {
      return stack.isEmpty();
                
    }

    public static void main(String[] args)
    {
        Stackk s =new Stackk();
        Scanner sc = new Scanner(System.in);
        int ch;
                do{
                    System.out.println("\n-----------------------------\n1 . push . \n2 . pop . \n3 . peek . \n4 . isEmpty .\n 5 . exit \n-----------------------------\n");
                   ch = sc.nextInt();
                    sc.nextLine();
            
                switch (ch) {
                    case 1:
                        System.out.println("enter the number to push : ");
                        int num = sc.nextInt();
                        s.push(num);
        
                        break;
                
                        case 2:
                        try{

                            System.out.println("poped out number : "+ s.pop());
                        }
                        catch (Exception e) {
                            System.out.println(e.getMessage());
                        }

                        break;
                        case 3:
                        System.out.println(" number at the top : "+ s.peek());
                        break;
                
                        case 4:
                       System.out.println(s.isEmpty());
               
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
// 1 . push . 
// 2 . pop . 
// 3 . peek . 
// 4 . isEmpty .
//  5 . exit 
// -----------------------------

// 2
// stck is empty

// -----------------------------
// 1 . push .
// 2 . pop .
// 3 . peek .
// 4 . isEmpty .
//  5 . exit
// -----------------------------

// 4
// true

// -----------------------------
// 1 . push .
// 2 . pop .
// 3 . peek .
// 4 . isEmpty .
//  5 . exit
// -----------------------------

// 1
// enter the number to push :
// 45

// -----------------------------
// 1 . push .
// 2 . pop .
// 3 . peek .
// 4 . isEmpty .
//  5 . exit
// -----------------------------

// 2
// poped out number : 45

// -----------------------------
// 1 . push .
// 2 . pop .
// 3 . peek .
// 4 . isEmpty .
//  5 . exit
// -----------------------------

// 4 
// true

// -----------------------------
// 1 . push .
// 2 . pop .
// 3 . peek .
// 4 . isEmpty .
//  5 . exit
// -----------------------------

// 2
// stck is empty

// -----------------------------
// 1 . push .
// 2 . pop .
// 3 . peek .
// 4 . isEmpty .
//  5 . exit
// -----------------------------

// 2
// stck is empty

// -----------------------------
// 1 . push .
// 2 . pop .
// 3 . peek .
// 4 . isEmpty .
//  5 . exit
// -----------------------------

// 1   
// enter the number to push :
// 4

// -----------------------------
// 1 . push .
// 2 . pop .
// 3 . peek .
// 4 . isEmpty .
//  5 . exit
// -----------------------------

// 4
// false

// -----------------------------
// 1 . push .
// 2 . pop .
// 3 . peek .
// 4 . isEmpty .
//  5 . exit
// -----------------------------

