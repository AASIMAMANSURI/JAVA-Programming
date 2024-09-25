import java.util.Scanner;
public class comlexnumber {
 int real;
    int img;
    

    comlexnumber(int n1,int n2)
    {
        real= n1;
        img=n2;
    }

    public static comlexnumber add(comlexnumber o1 , comlexnumber o2 )
    {
        comlexnumber tem = new comlexnumber(0, 0);
        tem.real= o1.real + o2.real;
        tem.img =o1.img+o2.img;
        return tem;
        
    }
    public static comlexnumber sub(comlexnumber o1 , comlexnumber o2 )
    {
        comlexnumber tem = new comlexnumber(0, 0);
        tem.real= o1.real - o2.real;
        tem.img =o1.img - o2.img;
        return tem;
        
    }public static comlexnumber mul(comlexnumber o1 , comlexnumber o2 )
    {
        comlexnumber tem = new comlexnumber(0, 0);
        tem.real= o1.real * o2.real;
        tem.img =o1.img * o2.img;
        return tem;
        
    }

    public comlexnumber getConjugate() {
        return new comlexnumber(real, -img);
    }

    public static float magnitute(comlexnumber z)
    {
        return (float) Math.sqrt(z.real * z.real + z.img * z.img);
        
    }

    public static void main(String[] args) {
        comlexnumber  c1 =new comlexnumber(2, 3);
        comlexnumber c2 =new comlexnumber(3, 4);
        comlexnumber c3 =new comlexnumber(0, 0);
        comlexnumber c4 =new comlexnumber(0, 0);
        comlexnumber c5 =new comlexnumber(0, 0);
        c3 = add(c1, c2);
        c3 = sub(c1, c2);
        c3 = mul(c1, c2);
       System.out.println("addition " + c3.real + ","+ c3.img);
       
       System.out.println("subtraction " + c3.real + ","+ c3.img);
       
       System.out.println("multiplication " +c3.real + ","+ c3.img);
       System.out.println("magnitute : "+comlexnumber.magnitute(c1));
       comlexnumber cc =c1.getConjugate();
       System.out.println("Conjugate :  " +cc.real + ","+ cc.img);
    }
}
