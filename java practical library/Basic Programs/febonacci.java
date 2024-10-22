import java.util.Scanner;

class febonacci{

    public static void main(String[] args)
    { Scanner input =new Scanner(System.in);
       

        int ch;

        do{ 

            System.out.println("1. for loop \n 2. while loop \n 3. recursion \n");
                    System.out.println("enter the choise : ");
             ch = input.nextInt();
              febonacci feb = new febonacci();
            switch (ch) {
                case 1:
                     feb.forloop();
                    break;
            case 2:
                     feb.whileloop();
                    break;
                    case 3:
                    //  feb.recursion();
                    break;
                default:
                    break;
            }

        }
        while(ch!=0);
 
     
       }

public void forloop(){
        Scanner input =new Scanner(System.in);
       
int n1 =0  ,n2=1     ,limit;
 System.out.println("enter the limit : ");
        limit = input.nextInt();
        System.out.print(n1 + " , " + n2);
       for(int i=n2+1 ;i<limit ;i++)
        {
            int n3 = n1+n2;
            System.out.print("," + n3);
            n1 = n2;
            n2 = n3;    
        }
        System.out.println("\n\n");
    }

    public void whileloop(){
        Scanner input =new Scanner(System.in);
       
int n1 =0  ,n2=1     ,limit ,i=n2+1;
 System.out.println("enter the limit  : ");
        limit = input.nextInt();
        System.out.print(n1 + " , " + n2);
    while(i<limit)
    {
        int n3 = n1+n2;
            System.out.print("," + n3);
            n1 = n2;
            n2 = n3; 
            i++; 
    }
       System.out.println("\n\n");

    }
}

// output:
// 10
// 0 , 1,1,2,3,5,8,13,21,34
// PS Z:\> 