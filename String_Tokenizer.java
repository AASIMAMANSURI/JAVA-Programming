import java.util.StringTokenizer;
import java.util.Stack;
public class String_Tokenizer{

    public static void main(String args[])
    {
        String s = "Aasima Mansuri Imarn.";

        StringTokenizer St = new StringTokenizer(s);
        while(St.hasMoreTokens())
        {
            System.out.println(St.nextToken());

        }

        Stack<String> st =new Stack<>();
        while(St.hasMoreTokens())
        {
            
            st.push(St.nextToken());
        }

        StringBuilder revString = new StringBuilder();
 
            
            while (!st.isEmpty()) {
                revString.append(st.pop()).append(" ");
            }
        
            System.out.println(revString.toString().trim());
        }
    }
