



import java.util.*;
import java.lang.*;
public class Bank
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,ch,amt,bal=600,min=500;
        String s="3000123456";
        System.out.print("Enter username:");
        String un=sc.next();
        String name=sc.next();
        String s4=name.substring(0,3)+un.substring(6,10);
        System.out.println("Enter password: ");
        String p=sc.next();
        if(un.equals(s) && p.equals(s4));
        {
            while(true)
            {
                System.out.println("1.Deposit  2.Withdraw   3.Transfer  4.Check Balance 5.Exit");
                ch=sc.nextInt();
                switch(ch)
                {
                    case 1:
                        System.out.println("Enter amount to deposit:");
                        amt=sc.nextInt();
                        bal=bal+amt;
                        break;
                    case 2:
                        System.out.println("Enter how much to amount to withdraw");
                        amt=sc.nextInt();
                        if(bal<min || bal<0)
                        {
                            System.out.println("No minimum balance");
                        }
                       
                        else
                            bal=bal-amt;
                        break;
                    case 3:
                        System.out.println("Enter how much to amount to transfer");
                        amt=sc.nextInt();
                        if(bal<min || bal<0)
                        {
                            System.out.println("No minimum balance");
                        }
                        else
                            bal=bal-amt;
                        break;
                    case 4:
                        System.out.println("Available balance is "+bal);
                        break;
                    case 5:
                        System.exit(0);
                }
            }   
        }
    }
}
