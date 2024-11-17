// (II) Read an IP address from user in the form of- 192.11.12.112.
// Separate each part from ‘.’ And store it in an array using String Tokenizer.

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.StringTokenizer;

class ReasIP{
    public static void main(String[] args)
    {
        System.out.println("enter the IP : ");
        Scanner sc =new Scanner(System.in);
        String IP = sc.nextLine();
int index=0;
        StringTokenizer st = new StringTokenizer(IP, ".");

        String splitted[]  = new String[4];
        while(st.hasMoreTokens() && index <4)
        {
            splitted[index] = st.nextToken();
            index++;

        }

        for(String str : splitted)
        {
            System.out.println(str);
        }   

    }
}