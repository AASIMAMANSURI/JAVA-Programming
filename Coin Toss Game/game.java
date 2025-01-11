import java.util.Scanner ;

class game{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
	
	System.out.println("enter the name of P1:");
	String P1 = sc.nextLine();
	System.out.println("enter the name of P2:");
	String P2 = sc.nextLine();
	System.out.println("enter the name of P3:");
	String P3 = sc.nextLine();
	
	System.out.println("enter the number of tosses");
	int toss = sc.nextInt();
	
	int s1 =0,s2=0,s3=0,tie=0;
	
	coin2 c1 = new coin2();
	coin2 c2 = new coin2();
	coin2 c3 = new coin2();
	
	for(int i=0;i<toss;i++)
	{
		c1.flip();
		c2.flip();
		c3.flip();
		
		System.out.println("Player 1: " +c1.getface());
		System.out.println("Player 2: " +c2.getface());
		System.out.println("Player 3: " +c3.getface());
		if(c1.getface().equals(c2.getface()) &&c2.getface().equals(c3.getface()) )
		{
			System.out.println("its a tie");
			tie++;
		}
		else if(c1.getface().equals(c2.getface()))
		{
			System.out.println(P3 + "WINS..!");
			s3++;
		}
		else if(c2.getface().equals(c3.getface()))
		{
			System.out.println(P2 + "WINS..!");
			s2++;
		}
		else{
			
			System.out.println(P3+ "WINS..!");
			s1++;
		}
		
	}
		System.out.println(P1 + ": "+s1);
		System.out.println(P2 + ": "+s2);
		System.out.println(P3 + ": "+s3);
		
		System.out.println("ties: "+tie);
	}
}
