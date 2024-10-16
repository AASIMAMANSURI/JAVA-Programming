package graphic;

import java.util.*;

import excep.CustomException ;

public class Driver_main {
    public static void main(String[] args) {
        Shape[] shape = {
                new Square(),
                new Circle()
                // new Square();
                // new Square();
        };
        int op;
        try  {
            Scanner sc = new Scanner(System.in);
            
            do {
                System.out.println("Enter op : ");
                op = sc.nextInt();
                if (op == 3){
                    
                // if error occurs then in any block throw error in this syntax
                throw new CustomException("Your error message here"); 
                }

                switch (op) {

                    case 1:
                        Square sq = (Square) shape[0];
                        sq.print();
                        System.out.println("enter side of Squre: ");
                        int side = sc.nextInt();
                        sq.setSide(side);
                        sq.area();
                        break;

                        case 2:
                        Circle c = (Circle) shape[1];
                        c.print();
                        System.out.println("enter side of Squre: ");
                        int r = sc.nextInt();
                        c.setRadius(r);
                        c.area();
                        break;

                    default:
                        break;
                }
        sc.close();

            } while (op != 9);
        }catch (CustomException  e) {

            // Handle the custom exception here
            System.out.println("Caught CustomException: " + e.getMessage());
        }
        catch(Exception e)
        {

            System.out.println(e.getMessage());
        }
    }
}
