import java.lang.*;
import java.util.*;
public class two
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i;
		String s="3000123456";
		System.out.println("Enter user name");
		String un=sc.next();
		String name=sc.nextLine();
		String s2=name.substring(0,4)+un.substring(6,10);
		System.out.println(s2);
	}
}
