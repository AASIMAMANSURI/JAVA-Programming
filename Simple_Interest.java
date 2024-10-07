// Write a java program to calculate Simple Interest using Command Line Arguments. (Hint use
// Wrapper classes)

class custom extends Exception{
    public custom(String message)
    {
        super(message);
    }
}

class Simple_inetrest{
    
    public static void main(String[] args) {
        try {
            if(args.length != 3)
        {
            throw new custom("please enter exactly 3 ARGUMNETS : principal , rate , and time .");
        }

        double rate= Double.parseDouble(args[0]);

        double principal = Double.parseDouble(args[1]);
        double time = Double.parseDouble(args[2]);

        Double interest = principal * rate *time /100;

        System.out.println("Interest  : " + interest);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("problem here");
        }
        catch(custom e)
        {
            System.out.println(e.getMessage());
        }
        
    }
}

// output : 
// PS Z:\java> javac Simple_Interest.java
// PS Z:\java> java Simple_inetrest
// please enter exactly 3 ARGUMNETS : principal , rate , and time .
// PS Z:\java> java Simple_inetrest 12000 12 3
// Interest  : 4320.0
// PS Z:\java> 