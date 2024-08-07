import java.util.Scanner;

class PrimeSeries{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.println("enter the limit to find the prime num: ");
int s;
int l;
s =input.nextInt();
l = input.nextInt();

for(int i = s ;i<l ;i++)
{
int flag =0;
if(i >1)
{
for(int j =2 ;j<i ;j++)
{
if(i %j == 0)
{
flag=1;
break;
}

}
if(flag==0)
{
System.out.print(i + " , ");
}
}

}
}}