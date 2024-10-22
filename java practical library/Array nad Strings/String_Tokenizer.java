import java.util.StringTokenizer;
import java.util.Stack;
import java.util.ArrayList;

public class String_Tokenizer {

    public static void main(String args[]) {
        String s = "Aasima Mansuri Imarn.";

        // First, tokenize the string and store the tokens in a list
        StringTokenizer St = new StringTokenizer(s);
        ArrayList<String> tokens = new ArrayList<>();
        
        while (St.hasMoreTokens()) {
            String token = St.nextToken();
            tokens.add(token);  // Store tokens in a list
            System.out.println(token);  // Print each token
        }

        // Now, push the tokens to a stack
        Stack<String> st = new Stack<>();
        for (String token : tokens) {
            st.push(token);
        }

        // Reverse the string using the stack
        StringBuilder revString = new StringBuilder();

        while (!st.isEmpty()) {
            revString.append(st.pop()).append(" ");
        }

        // Print the reversed string
        System.out.println(revString.toString().trim());
    }
}
