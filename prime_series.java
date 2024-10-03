class prime_number_range{
   
    static void prime()
    {
        int count = 0 ;
      
        int i=2;
        while(count < 15)
        {
            boolean flag =true;
            for(int j = 2 ;j<Math.sqrt(i);j++)
            {
                if( i % j == 0)
                {
                    flag =false;
                    break;
                  
                }
            }
        
            if (flag)
            {
                System.out.print(" " +i);
                count++;
            }
            i++;
        }

    }
    
    public static void main(String[] args) {
        prime_number_range.prime();
    }
}   