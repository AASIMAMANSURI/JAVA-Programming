package array;
import java.util.Scanner;

class Cartesian_point
{
    public int x , y ;

   public Cartesian_point (int a ,int b){
        this.x = a;
        this.y =b ;
    }
    public Cartesian_point (int a){
        this.x = a;
        this.y =a ;
    }
    public int get_x()
    { 
        return x;
    }
    public int get_y()
    {  
        return y;
    }

    public void move(int x ,int y)
    {
        this.x = x;
        this.y = y;

    }
    public void move(int a)
    {
        this.x = a;
        this.y=a;
    }

    public void Display()
    {
        System.out.println("current values of X and Y :  " + "(" + x +  " , " + y  + " )");
    }
    public static void main(String[] args) {

        Cartesian_point obj = new Cartesian_point(12,45);
        Cartesian_point obj2 = new Cartesian_point(124);
        obj.get_x();
        obj.get_y();
        obj.Display();
        obj.move(23,76);
        obj.Display();
       //overloaded method 
        obj.move(345);
        obj.Display();
        
       
    }
}
// output:
// current values of X and Y :  (12 , 45 )
// current values of X and Y :  (23 , 76 )
// current values of X and Y :  (345 , 345 )