// Write a program which creates an Array of character. Make one function with one
// argument as a character and that function throw a user defined exception if the character
// that u have passed is digit.

class charArray {
    public static void checkexception(char ch) throws charException
    {
      if(Character.isDigit(ch))
      {
        throw new charException("the character that u have passed is digit.");
      }

    }
    public static void main(String[] args) {

        char arr[] = { '1', 's', 's' };
        for(char ch :arr)
        {
            try {
                checkexception(ch);
            } catch (Exception e) {
               System.out.println(e.getMessage());
            }
        }
    }
}