import java.util.StringTokenizer;

class address{
    public static void main(String[] args) {
        if(args.length == 0 )
        {
            System.out.println("please enter the address");
        }
        StringBuilder add = new StringBuilder();
        for(String arg : args)
        {
            add.append(arg);
        }

        String address = add.toString();
        StringTokenizer st =new StringTokenizer(address, ",");
       
        while(st.hasMoreTokens())
        {
           String array = st.nextToken();
            System.out.println(array);
        }
       
    }
}