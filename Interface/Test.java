package Interface;
interface displayable{
     void display(String msg);
     
}

public class Test implements displayable{
     public void display(String msg)
     {
          System.out.println(msg);
     }
     public static void main(String[] args) {
          Test dis = new Test();
          dis.display("welcome");
     }
}

