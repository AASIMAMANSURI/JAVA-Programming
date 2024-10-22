// Write a BankAccount class with the following properties: accountNumber, balance,
// and owner. Implement methods to deposit, withdraw, and check the account balance.

import java.util.Scanner;
class Bank_Acc{
	String name;
	String acc_no;
	float balance;
	
	
	public void get_details(String a ,String b ,float c ){
		name = a ;
		 acc_no = b;
		 balance = c;
	}

	public void display()
	{
	System.out.println("name : " + name );
	System.out.println("acc_no: " + acc_no );
	System.out.println("balance: " + balance);
	
	}
	public void deposit()
	{
		Scanner input = new Scanner(System.in);
		float w_amount ;
		System.out.println("your amount is : " + balance);
		w_amount = input.nextFloat();
		
		balance =balance + w_amount;
		
		System.out.println("your amount is : " + balance);
		
	}

	public void withdraw()
	{
		float dipo;
		Scanner input = new Scanner(System.in);
		System.out.println("your amount is : " + balance);
		dipo = input.nextFloat();
		if(dipo >= balance)
		{
			System.out.println(" no sufficient amount ...!");
		}
		else
		{
			balance = balance - dipo;
		}
		System.out.println("your amount is : " + balance);
	}
	
	public void check_blc()
	{
		
		System.out.println("your amount is : " + balance);
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Bank_Acc b1 = new Bank_Acc();
		int ch;
		b1.get_details("aasima","abc123456",12000);
		do{ 
		System.out.println("--------------------\n1. Display data of Customer . \n2. Deposite Amount. \n3. Withdraw Amount. \n4. Check Balance.\n5. exit\n--------------------\n") ;
		ch = input.nextInt();
			switch(ch){
				 case 1:
					b1.display();
				 break;
				 case 2:
					b1.deposit();
				 break;
				 case 3:
					b1.withdraw();
				 break;
				 case 4:
					b1.check_blc();
				 break;
				 case 0:
					System.out.println("exit");
				 break;
				
			}
		}while(ch !=0);
	
	}
}