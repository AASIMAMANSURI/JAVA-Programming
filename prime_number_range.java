class prime_number_range{
   
    static void prime()
    {
        for(int i=1;i<15;i++)
        {
            boolean flag =true;
            for(int j = 2 ;j<Math.sqrt(i);j++)
            {
                if( i % j == 0)
                {
                    flag =false;
                }
            }
            if (flag )
            {
                System.out.print(" " +i);
            }
        }
        
    }
    public static void main(String[] args) {
        prime_number_range.prime();
    }
}
