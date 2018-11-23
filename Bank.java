import java.lang.*;
import java.util.*;
public class Bank
{
	public int bal=0;
	public void Deposit(int d)
	{
		//System.out.println("Enter amount to be deposited");
		bal=bal+d;
		System.out.println(bal);
	}
	public void Withdraw(int n)
	{
		System.out.println("Enter amount to withdrawl");
		if(bal<=n)
		{
			bal=bal-n;
			System.out.println("take money");
		}
		else
		{
			System.out.println("insufficient funds");
		}
	}
	public void check()
	{
		System.out.println(bal);
	}
	
	
		
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Bank b=new Bank();
		String accnumber= "3000123456";
		String name=sc.nextLine();
		int ch;
		System.out.println("Enter ur choice");
		System.out.printf("1.Deposit"+"2.Withdraw"+"3.check");
		while(true)
		{
		//switch(ch)
		//{
			/*case 1:System.out.println("Enter amount to be deposited");
			       int d=sc.nextInt();
			       b.Deposit(d);
			       break;
			case 2:System.out.println("Enter amount to withdrawl");
			       int n=sc.nextInt();
			       b.Withdraw(n);
			       break;
			case 3:b.check();
			       break;
			
		}/*
	}
	
	}
}
			       
	
 
