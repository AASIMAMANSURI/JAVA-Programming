import java.util.Scanner;
class pelinderome{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the string to check pelindrome : ");
        String str = input.nextLine();
    String reversestr= "";
     
        for (int i=0 ;i<str.length() ;i++)
        {
            char ch = str.charAt(i);
            reversestr = ch + reversestr; 
        }

        System.out.println("reverse  : " + reversestr);
       
   if(str.equals(reversestr))
   {
    System.out.println("string is pelindrome");
   }
   else{
    System.out.println("string is not pelindrome");
   }
}   
}

// output:

// Z:\java>java pelinderome
// enter the string to check pelindrome :
// aasima
// reverse  : amisaa
// string is not pelindrome

// Z:\java>java pelinderome
// enter the string to check pelindrome :
// jinanij
// reverse  : jinanij
// string is pelindrome

// Z:\java>java pelinderome
// enter the string to check pelindrome :
// 12321
// reverse  : 12321
// string is pelindrome