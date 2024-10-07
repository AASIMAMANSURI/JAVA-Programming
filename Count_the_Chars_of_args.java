// Write an application that counts the total number of characters in all of its command-line
// arguments.

class Count_Chars_of_args{
    
    public static void main(String[] args)
    {
        int count_chars = 0;

        for(int i=0;i<args.length;i++)
        {
            count_chars=count_chars +args[i].length();
        }
        System.out.println("total chars : " + count_chars);
        
    }
}

// output :
// Microsoft Windows [Version 10.0.19045.4894]
// (c) Microsoft Corporation. All rights reserved.

// Z:\java>javac Count_the_Chars_of_args.java

// Z:\java>java Count_Chars_of_args Aasima Mansuri Imran
// total chars : 18

// Z:\java>